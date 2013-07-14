package sun.natee.ton.view.form;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class TheValue {
    public static String RFID_ID="";
    public static String USERNAME="";
    public static boolean CONNECT_PORT=false;
    public static String COMPORT_RFID="";
    public static String COMPORT_PRINTER="";
    public static SimpleDateFormat simp=new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    public static SimpleDateFormat formatNormal=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static String BILL_START="";
    public static String Terminal = "";
    public static String CASHIER = "";
    public static String MSG_IMPORT="ลูกค้าระบบเดิม";
    public static String MSG_REGISTER="ลงทะเบียน";
    public static String MSG_EDIT_PROFILE="แก้ไขประวัติ";
    public static String MSG_REFILL="เติมเงินในบัตร";
    public static String MSG_CHANGE_RFID="เปลี่ยนข้อมูลในบัตร";
    public static String MSG_DEL_PROFILE="ลบข้อมูลผู้ถือบัตร";
    public static String MSG_CANCEL="ยกเลิกการใช้งานบัตร";
    public static String MSG_RT_FREE_MONEY="คืนเงินมัดจำ";
    
    public static boolean []MENU=new boolean[7];
    static Color colorDisable = new Color(255,255,255);
    
    public static void notAuthorization(){
        JOptionPane.showMessageDialog(null, "ท่านไม่มีสิทธิ์ใช้งานฟังก์ชันการทำงานนี้", "#0001 [Permission]", JOptionPane.ERROR_MESSAGE);
    }

}
