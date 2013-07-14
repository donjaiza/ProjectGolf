package sun.natee.ton.control.api;

import sun.natee.ton.view.form.TheValue;
import sun.natee.ton.model.database.ConnectDB;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import sun.natee.ton.model.bean.RFIDBean;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.comm.CommDriver;

public class PPrint {
    static SerialPort serialPort;
    static InputStream inputStream;
    static OutputStream outputStream;
    static Enumeration portList;
    static CommPortIdentifier portId;
    static boolean OpenStatus = false;
    static String XLine1 = "";
    static String XLine2 = "";
    static String XLine3 = "";
    static String XLine4 = "";
    static boolean PrintLine4 = true;
    static SimpleDateFormat DatefmtThai = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.ENGLISH);
    static SimpleDateFormat Datefmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    static SimpleDateFormat ShowDatefmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static DecimalFormat DecFmt = new DecimalFormat("##,###,##0.00");
    static DecimalFormat IntFmt = new DecimalFormat("##,###,##0");
    static Date date = new Date();
    static int LineCount = 0;
    private ConnectDB conn=new ConnectDB();
    boolean EJPrint = false;
    CommDriver commDriver;

    public void PPrint() {
    }
    
    public static void main(String[] args) {
        PPrint p = new PPrint();
        PPrint.listComport();
        p.closeComport();
    }

    public Boolean OpenPrint(String PortName) {
        if(PortName.equals("")){
            return false;
        }
        OpenStatus = false;
        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(PortName)) {
                    //if (portId.getName().equals("/dev/term/a")) 
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                         PUtility.ShowError("Open Error For " + PortName);
                    } catch (RuntimeException re){
                            PUtility.ShowError("Com Port ไม่สามารถใช้งานได้ "+portId.getName());
                        }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        serialPort.setSerialPortParams(9600,
                                SerialPort.DATABITS_8,
                                SerialPort.STOPBITS_1,
                                SerialPort.PARITY_NONE);
                        serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_XONXOFF_IN | SerialPort.FLOWCONTROL_XONXOFF_OUT);
                        OpenStatus = true;

                    } catch (UnsupportedCommOperationException e) {
                        PUtility.ShowError("Open Error For " + PortName);
                    }
                }
            }
        }
        return OpenStatus;
    }   

    public void InitPrinter() {
        //Print_Str(Str.toString()) ;
        try {
            byte Str[] = {27, 64, 1}; //init Printer

            outputStream.write(Str);
            byte Str2[] = {27, 33, 1}; //Set to Nmormal Fornt

            outputStream.write(Str2);
            outputStream.flush();
            LineCount = 0;
            PrintLine4 = false;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void SelectStye(int Stye) {

        if (Stye == 1) {
            byte Str[] = {27, 33, 1};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 2) {
            byte Str[] = {27, 33, 2};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 3) {
            byte Str[] = {27, 33, 97};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 4) {
            byte Str[] = {27, 33, 98};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 5) {
            byte Str[] = {27, 33, 16};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 6) {
            byte Str[] = {27, 33, 17};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 7) {
            byte Str[] = {27, 33, 49};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 8) {
            byte Str[] = {27, 33, 48};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 10) {
            byte Str[] = {27, 45, 1};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 11) {
            byte Str[] = {27, 45, 0};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        if (Stye == 12) {
            //byte Str[] = {27, 114, 1};
        }
        if (Stye == 13) {
            byte Str[] = {27, 114, 0};

            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }


    }

    public static void Get_Line(String St) {

        int SetMode[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int list1[] = {232, 233, 234, 235, 236};
        int list2[] = {128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138,
            139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149,
            150, 151, 152, 153, 154, 155, 156, 157, 158,
            209, 212, 213, 214, 215, 219, 220, 221, 222, 231, 232,
            233, 234, 235, 236, 237, 251, 252, 253, 254
        };

        int list4[] = {216, 217};
        char ch;

        String Level1 = "";
        String Level2 = "";
        String Level3 = "";
        String Level4 = "";

        int I = 0;
        while (I <= St.length() - 1) {   // Check TIS Upper }

            ch = St.charAt(I);
            if (SearchArray((int) ch, SetMode) != -1) {
                //Level2=Level2+ch ;
            } else {
                if (SearchArray((int) ch, list1) != -1) {
                    Level1 = Level1.substring(0, Level1.length() - 1) + ch;
                } else {
                    if (SearchArray((int) ch, list2) != -1) {
                        Level2 = Level2.substring(0, Level2.length() - 1) + ch;
                    } else {
                        if (SearchArray((int) ch, list4) != -1) {
                            Level4 = Level4.substring(0, Level4.length() - 1) + ch;

                        } else {
                            Level1 = Level1 + " ";
                            Level2 = Level2 + " ";
                            Level3 = Level3 + ch;
                            Level4 = Level4 + " ";
                        }
                    }
                }
            }
            I++;
        }
        XLine1 = Level1;
        XLine2 = Level2;
        XLine3 = Level3;
        XLine4 = Level4;

    }

    public void Print_Str(String PrintMsg) {        
        if (PublicVar.HWrec_PrnType.equals("6")) {
            try {
                if(PrintMsg==null){
                    PrintMsg = "";
                }
                XLine1 = PrintMsg + "\n";
                Thread.sleep(50);
                outputStream.write(XLine1.getBytes("tis-620"));
            } catch (InterruptedException ex) {
                
            } catch (IOException ex) {
                
            }
        } else {

            Get_Line(ThaiUtilities.Unicode2ASCII(PrintMsg));
            try {
                try {
                    //outputStream.flush();
                    if (XLine1.trim().length() > 0) {
                        XLine1 = ThaiUtilities.ASCII2Unicode(XLine1 + "\n");
                        byte LineSpace[] = {27, 51, 15, 1};
                        byte LineSpace2[] = {27, 51, 5, 1};
                        String TempPrint = "\n";
                        if (XLine2.trim().length() > 0) {
                            outputStream.write(LineSpace2);
                        } else {
                            outputStream.write(LineSpace);
                        }
                        Thread.sleep(230);
                        outputStream.write(XLine1.getBytes("tis-620"));
                        LineCount = LineCount + 1;
                        PrintLine4 = false;
                    }
                    if (XLine2.trim().length() > 0) {
                        XLine2 = ThaiUtilities.ASCII2Unicode(XLine2 + "\n");
                        byte LineSpace[] = {27, 51, 17, 1};
                        outputStream.write(LineSpace);
                        Thread.sleep(230);
                        outputStream.write(XLine2.getBytes("tis-620"));
                        PrintLine4 = false;
                        LineCount = LineCount + 1;
                    }
                    if (XLine3.trim().length() >= 0) {
                        XLine3 = ThaiUtilities.ASCII2Unicode(XLine3 + "\n");
                        byte LineSpace[] = {27, 51, 15, 1};
                        byte LineSpace2[] = {27, 51, 18, 1};
                        String TempPrint = "\n";
                        if (XLine4.trim().length() > 0) {
                            outputStream.write(LineSpace);
                        } else {
                            outputStream.write(LineSpace2);
                        }
                        Thread.sleep(190);
                        outputStream.write(XLine3.getBytes("tis-620"));
                        PrintLine4 = false;
                        LineCount = LineCount + 1;
                    }
                    if (XLine4.trim().length() > 0) {
//                        System.out.println(Integer.toString(XLine4.trim().length()));
                        XLine4 = ThaiUtilities.ASCII2Unicode(XLine4 + "\n");
                        byte LineSpace4[] = {27, 51, 0};
                        outputStream.write(LineSpace4);
                        Thread.sleep(230);
                        outputStream.write(XLine4.getBytes("tis-620"));
                        PrintLine4 = true;
                        LineCount = LineCount + 1;
                    } else {
                        PrintLine4 = false;
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            } catch (InterruptedException ex) {
                PUtility.ShowError(ex.getMessage());
            }
        }
        String TempFile = PublicVar.HWRec_EJDailyPath + "/log" + PublicVar.MacNo + ".gif";
        TextWriter TextWrite = new TextWriter();
        File fObject = new File(TempFile);
        if (!fObject.canRead()) {
            TextWrite.writeToText(TempFile, "");
        }
        TextWrite.writeToText(TempFile, PrintMsg);
        if (EJPrint) {
            String TempBill = PublicVar.HWRec_EJDailyPath + "/tempbill.txt";
            if (!fObject.canRead()) {
                TextWrite.writeToText(TempBill, "");
            }
            TextWrite.writeToText(TempBill, PrintMsg);
        }
    }

    public void closePrint() {
        if (!OpenStatus) {
            return;
        }
        if (serialPort != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                PUtility.ShowError(e.getMessage());
            }
            serialPort.close();
            System.out.println("Close port printer is already done");
        }
        OpenStatus = false;
    }
    
    public void closeComport(){
        if (serialPort != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                PUtility.ShowError(e.getMessage());
            }
            serialPort.close();
            System.out.println("### Close port printer is already done");
        }
    }

    public void closePrintExit() {

        if (serialPort != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                PUtility.ShowError(e.getMessage());
            }
            serialPort.close();
        }
        OpenStatus = false;
    }

    public void PrintHeader() {
        if (!PublicVar.HWrec_PrnPort.equals("NONE")) {
            if (OpenPrint(PublicVar.HWrec_PrnPort)) {
                InitPrinter();
                Print_Str(PublicVar.HWrec_Heading1);
                Print_Str(PublicVar.HWrec_Heading2);
                Print_Str(PublicVar.HWrec_Heading3);
                Print_Str(PublicVar.HWrec_Heading4);
                //Print_Str(" ");
                Print_Str("REG ID :" + PublicVar.HWrec_MacNo);
                CutPaper();
                closePrint();
            } else {
                PUtility.ShowError("เครื่องพิมพ์ใบกำกับภาษีไม่สามารถพิมพ์ได้ ...");
            }
        } else {
            PUtility.ShowError("Printer Header Error...");

        }
    }

    public void printerror(String RefNo) {
        if (OpenPrint("COM6")) {
            InitPrinter();
            Print_Str("");
            Print_Str("มีปัญหาในการบันทึกข้อมูล  Bill-No : " + RefNo);
            Print_Str("      กรุณาทำรายการใหม่");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            CutPaper();
            closePrint();
        } else {
            PUtility.ShowError("เครื่องพิมพ์ใบกำกับภาษีไม่สามารถพิมพ์ได้ ...");
        }
    }

    // Metod for Print tility
    public static int SearchArray(int key, int[] list) {
        int ans = -1;
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                ans = i;
            }
        }
        return ans;
    }

    public void CutPaperForT70() {
        try {
            byte Str[] = {29, 86, 1}; //init Printer
            outputStream.write(Str);
        } catch (IOException ex) {
            PUtility.ShowError(ex.getMessage());
        }
    }
    
    public void CutPaper() {
        try {
            byte Str[] = {27, 105, 0}; //init Printer
                outputStream.write(Str);
        } catch (IOException ex) {
            PUtility.ShowError(ex.getMessage());
        }
    }

    public void printBill(RFIDBean bean){
        SimpleDateFormat simp1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        RFIDBean profile = conn.getDataRFID(bean.getRFID_ID());
        String money_total;
        try{
            money_total=""+(bean.getRFID_MONEY()+bean.getFREE_MONEY()+bean.getCREDIT_MONEY());
        }catch(Exception e){
            money_total="    ";
        }
        if(money_total.length()==3){
            money_total=" "+money_total;
        }
        ConnectDB con = new ConnectDB();
        String Header[] = new String[]{"","","",""};
        String Footer[] = new String[]{"",""};
        try {
            String sql = "select Terminal, MacNo, ReceNo1, Heading1, Heading2, Heading3, Heading4, "
                    + "Footting1, Footting2,receno1 "
                    + "from poshwsetup "
                    + "where MacNo='"+con.getMacNo()+"'";
            Statement stmt = con.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                Header[0]=rs.getString("Heading1");
                Header[1]=rs.getString("Heading2");
                Header[2]=rs.getString("Heading3");
                Header[3]=rs.getString("Heading4");
                Footer[0]=rs.getString("Footting1");
                Footer[1]=rs.getString("Footting2");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if (OpenPrint(TheValue.COMPORT_PRINTER)) {
            InitPrinter();
            Print_Str("");
            Print_Str(Header[0]);
            Print_Str(Header[1]);
            Print_Str(Header[2]);
            Print_Str(Header[3]);
            Print_Str("DATE: "+simp1.format(new Date())+" Bill: "+bean.getBILL_ID());
            Print_Str("       "+profile.getCUST_ID()+"คุณ "+profile.getMEMBER_NAME()+" "+profile.getMEMBER_SURNAME());
            Print_Str("");
            Print_Str("========================================");
            Print_Str("#รายการ             จำนวน        รวมเงิน");
            Print_Str("........................................");
            double moneyFree = bean.getFREE_MONEY();
            int countF =0;
            String str;
            if(moneyFree>0){
                countF =1;
                str = "";
            }else{
                str = "   ";
            }
            Print_Str("เติมเงินบัตร RFID        1       "+bean.getRFID_MONEY());
            Print_Str("ค่ามัดจำบัตร RFID        "+countF+"       "+str+bean.getFREE_MONEY());
            Print_Str("......................................");
            Print_Str("              รวมเงิน :        "+money_total+"");
            Print_Str("               ส่วนลด :        "+bean.getBILL_DISCOUNT());
            Print_Str("                 สุทธิ :        "+bean.getRFID_MONEY()+"");
            Print_Str("");
            Print_Str("========================================");
            Print_Str("ยอดเงินคงเหลือในบัตร : "+profile.getRFID_MONEY()+" บาท");            
            Print_Str("========================================");
            Print_Str(Footer[0]);
            Print_Str(Footer[1]);
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");
            Print_Str("");            
            CutPaper();
            closePrint();
        } else {
            PUtility.ShowError("เครื่องพิมพ์ใบกำกับภาษีไม่สามารถพิมพ์ได้ ...");
        }
    }
    
    public void printTest(String COMPORT){
        SimpleDateFormat simp1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (OpenPrint(COMPORT)) {
            InitPrinter();
            Print_Str("");
            Print_Str("========================================");
            Print_Str("    Start TEST Printer Port DATE: "+simp1.format(new Date())+"     ");
            Print_Str("========================================");            
            Print_Str("");
            Print_Str("");
            CutPaper();
            closePrint();
        }
    }

    public void printLoginWelcome() {
        SimpleDateFormat simp1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (OpenPrint(TheValue.COMPORT_PRINTER)) {
            InitPrinter();
            Print_Str("");
            Print_Str("========================================");
            Print_Str("        Start Login DATE: "+simp1.format(new Date())+"     ");
            Print_Str("========================================");            
            Print_Str("");
            CutPaper();
            closePrint();
        }
    }

    public static Object[] listComport(){
        portList = CommPortIdentifier.getPortIdentifiers();
        String comPort="";
        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                System.out.println(portId.getName());
                comPort+=portId.getName()+",";
            }
        }
        
        if (serialPort != null) {
            serialPort.close();
            System.out.println("### Close port printer is already done");
        }
        
        
        return comPort.split(",");
    }
    
}
