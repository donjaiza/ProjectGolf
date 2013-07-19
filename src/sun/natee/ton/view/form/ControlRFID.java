package sun.natee.ton.view.form;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.TooManyListenersException;

public class ControlRFID implements SerialPortEventListener{
    private CommPortIdentifier portId;
    private Enumeration portList;
    private InputStream inputStream;
    private SerialPort serialPort;
    private StringBuffer messageAreaIn = new StringBuffer();
    private boolean openStatus=false;
    
    public boolean openComport(String COM_PORT) {
        if(openStatus){
            closePort();
            return true;
        }
        System.out.println("Open port: "+COM_PORT);
        boolean portFound = false;
        String rfidPort = COM_PORT;
        System.out.println("Set default port to " + rfidPort);

        // parse ports and if the default port is found, initialized the reader
        portList = CommPortIdentifier.getPortIdentifiers();
        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(rfidPort)) {
                    System.out.println("Found port: " + rfidPort);
                    portFound = true;
                    openStatus = true;
                    // initalize serial port
                    try {
                        serialPort = (SerialPort) portId.open("SimpleReadApp", 2000);
                    } catch (PortInUseException e) {
                    }
                    if (serialPort != null) {
                        try {
                            inputStream = serialPort.getInputStream();
                        } catch (IOException e) {
                        }

                        try {
                            serialPort.addEventListener(this);
                        } catch (TooManyListenersException e) {
                        }

                        // activate the DATA_AVAILABLE notifier
                        serialPort.notifyOnDataAvailable(true);

                        try {
                            // set port parameters
                            serialPort.setSerialPortParams(9600,
                                    SerialPort.DATABITS_8,
                                    SerialPort.STOPBITS_1,
                                    SerialPort.PARITY_NONE);
                        } catch (UnsupportedCommOperationException e) {
                        }
                    }
                }
            }

        }
        if (!portFound) {
            System.out.println("port " + rfidPort + " not found.");
            closePort();
        }
        
        return portFound;
    }
    
    
    
    public static void main(String[] args) {
        ControlRFID control=new ControlRFID();
        if(control.openComport("COM3")){
            //control.closePort();
        }
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        // Create a StringBuffer and int to receive input data.        
        StringBuilder inputBuffer = new StringBuilder();
        TheValue.RFID_ID = "";
        int newData = 0;

        // Determine type of event.
        switch (event.getEventType()) {

            // Read data until -1 is returned. If \r is received substitute
            // \n for correct newline handling.
            case SerialPortEvent.DATA_AVAILABLE:
                while (newData != -1) {
                    try {
                        newData = inputStream.read();
                        if (newData == -1) {
                            break;
                        }
                        if ('\r' == (char) newData) {
                            inputBuffer.append('\n');
                        } else {
                            inputBuffer.append((char) newData);
                        }
                    } catch (IOException ex) {
                        System.err.println(ex);
                        return;
                    }
                }
                System.out.println(inputBuffer.toString().trim());
                TheValue.RFID_ID = inputBuffer.toString().trim();
                break;

            // If break event append BREAK RECEIVED message.
            case SerialPortEvent.BI:
                messageAreaIn.append("\n--- BREAK RECEIVED ---\n");
        }
    }

    public void closePort() {
        System.out.println("### Close RFID Port");
        // If port is alread closed just return.
        if (!openStatus) {
            return;
        }
        // Check to make sure sPort has reference to avoid a NPE.

        if (serialPort != null) {
            try {
                // close the i/o streams.
                //outputStream.flush();
                //outputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // Close the port.
            serialPort.close();
        // Remove the ownership listener.
        //portId.removePortOwnershipListener(this);
        }
        openStatus = false;
    }
    
}
