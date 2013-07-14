package sun.natee.ton.control.api;

import java.io.*;
import java.util.*;
import gnu.io.*; // for rxtxSerial library

public class ReadRFIDPort implements SerialPortEventListener {
    private CommPortIdentifier portId;
    private CommPortIdentifier saveportId;
    private Enumeration portList;
    private InputStream inputStream;
    private SerialPort serialPort;
    private OutputStream outputStream;

    public ReadRFIDPort(){
        
    }
    
    public void readData(String PORT){
        boolean portFound = false;
        String rfidPort = PORT;
        System.out.println("Set default port to " + rfidPort);

        // parse ports and if the default port is found, initialized the reader
        portList = CommPortIdentifier.getPortIdentifiers();
        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equals(rfidPort)) {
                    System.out.println("Found port: " + rfidPort);
                    portFound = true;

                    initalize();
                }
            }

        }
        if (!portFound) {
            System.out.println("port " + rfidPort + " not found.");
        }
    }

    public void initalize() {
        // initalize serial port
        try {
            serialPort = (SerialPort) portId.open("SimpleReadApp", 2000);            
            //System.out.println("Owner: "+portId.getCurrentOwner());
            //System.out.println("Port type: "+portId.getPortType());
        } catch (PortInUseException e) {
        }

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

    @Override
    public void serialEvent(SerialPortEvent event) {
        switch (event.getEventType()) {
            case SerialPortEvent.BI:
            case SerialPortEvent.OE:
            case SerialPortEvent.FE:
            case SerialPortEvent.PE:
            case SerialPortEvent.CD:
            case SerialPortEvent.CTS:
            case SerialPortEvent.DSR:
            case SerialPortEvent.RI:
            case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
                break;
            case SerialPortEvent.DATA_AVAILABLE:
                // we get here if data has been received
                byte[] readBuffer = new byte[40];
                try {
                    // read data
                    int numBytes;
                    while (inputStream.available() > 0) {
                        numBytes = inputStream.read(readBuffer);
                    }
                    // print data
                    String data = new String(readBuffer);
                    System.out.println(data);
                    /*
                    if(!data.trim().equals("")){
                        System.out.print(data.trim());                        
                    }
                    if(data.trim().length()>=10){
                        System.out.println("");
                    }
                    */
                } catch (IOException e) {
                }

                break;
        }        
    }
    
    public static void main(String[] args) {
        ReadRFIDPort r = new ReadRFIDPort();
        r.readData("COM9");
    }

}