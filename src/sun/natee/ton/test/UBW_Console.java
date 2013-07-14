package sun.natee.ton.test;


import java.io.*;
import java.util.*;
import gnu.io.*;


import java.util.Enumeration;

public class UBW_Console {

    /**
     * @param args
     */
    static SerialPort serialPort = null;
    static OutputStream outStream = null;
    static InputStream inStream = null;

    public void portsList(List<String> list) {

        //System.setProperty("gnu.io.rxtx.SerialPorts", "/dev/ttyUSB0"); //add this line ttyACMx [0,1,2,..]
        @SuppressWarnings("rawtypes")
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();


        String strPorts = "";

        Writer writer = null;
        File file = null;

        try {
            file = new File("ports.txt");
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        while (ports.hasMoreElements()) {
            strPorts = ((CommPortIdentifier) ports.nextElement()).getName();
            System.out.println(strPorts);

            try {
                writer.write(strPorts + "\n");
                list.add(new String(strPorts));


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void Print_List(List<String> list) {
        Iterator<String> it = list.iterator();

        System.out.println("\nContents of List:");

        while (it.hasNext()) {
            String value = (String) it.next();

            System.out.println(value);
        }

        System.out.println("Size of List: " + list.size());
    }

    public void PopulateListFromFile(List<String> list) {
        try {
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream("ports.txt");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                list.add(new String(strLine));
                // Print the content on the console
                System.out.println(strLine);

                strLine = "";
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {
            //Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void connect(String portName) throws IOException {
        System.out.println("Connecting to " + portName);

        try {
            // Obtain a CommPortIdentifier object for the port you want to open
            CommPortIdentifier portId = CommPortIdentifier.getPortIdentifier(portName);

            // Get the port's ownership
            serialPort = (SerialPort) portId.open("UBW_Console", 5000);

            // Set the parameters of the connection.
            setSerialPortParameters();

            // Open the input and output streams for the connection. If they won't
            // open, close the port before throwing an exception.
            outStream = serialPort.getOutputStream();
            inStream = serialPort.getInputStream();
        } catch (NoSuchPortException e) {
            throw new IOException(e.getMessage());
        } catch (PortInUseException e) {
            throw new IOException(e.getMessage());
        } catch (IOException e) {
            serialPort.close();
            throw e;
        }
    }

    public void setSerialPortParameters() {
        //set parameters of serial port except for flow control
        int baudRate = 9600; // 57600bps

        try {
            // Set serial port to 9600bps-8N1
            serialPort.setSerialPortParams(
                    baudRate,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

            //Set flow control of serial port
            serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
            // OR
            // If CTS/RTS is needed
            //serialPort.setFlowControlMode(
            //SerialPort.FLOWCONTROL_RTSCTS_IN |
            //SerialPort.FLOWCONTROL_RTSCTS_OUT);

        } catch (UnsupportedCommOperationException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void disconnect() {
        if (serialPort != null) {
            try {
                // close the i/o streams.
                outStream.close();
                inStream.close();
            } catch (IOException ex) {
                // don't care
            } finally {
                // Close the port.
                System.out.println("\nDisconnecting from Serial Port");
                serialPort.close();
            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> Ports_List = new ArrayList<String>();
        List<String> Ports_List2 = new ArrayList<String>();

        System.out.println("Hello, World!\n");

        UBW_Console ubw = new UBW_Console();
        ubw.portsList(Ports_List);

        ubw.Print_List(Ports_List);
        System.out.println("\nNewList:");
        ubw.PopulateListFromFile(Ports_List2);
        ubw.Print_List(Ports_List2);

        try {
            //ubw.connect(Ports_List.get(0));
            ubw.connect("COM3");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        ubw.setSerialPortParameters();


        //get input and output streams for serial port
        try {
            outStream = serialPort.getOutputStream();
            inStream = serialPort.getInputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String serialMessage = "V";

        try {
            outStream = serialPort.getOutputStream();
            outStream.write(serialMessage.getBytes());

            for (int i = 0; i <= 100; i++) {
                serialMessage = "O,0,2,0";
                outStream = serialPort.getOutputStream();
                outStream.write(serialMessage.getBytes());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                serialMessage = "O,0,0,0";
                outStream = serialPort.getOutputStream();
                outStream.write(serialMessage.getBytes());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                if ((i % 10 == 0 && i != 0) || i == 1) {
                    System.out.print(i);
                } else if (i != 0) {
                    System.out.print(".");
                }
                //System.out.println("");

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        ubw.disconnect();




    }
}
