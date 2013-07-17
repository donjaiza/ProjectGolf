package sun.natee.ton.model.database;

import sun.natee.ton.model.bean.billnoBean;
import sun.natee.ton.control.api.ThaiUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class BillNoDB {
    public static void saveBillNo(billnoBean billno){
        String insertSQL = "INSERT INTO BILLNO"
                            + "(B_Refno,B_Ontime,B_OnDate,"
                            + "B_MacNo,B_Table,B_Cashier,"
                            + "B_Cust,B_ETD,B_Cash,B_Total,"
                            + "B_MemCode,B_Product,"
                            + "B_NETTOTAL,B_NETVAT,"
                            + "B_VAT,B_PAYAMT,"
                            + "B_APPCODE1,B_CRAMT1,B_CRCODE1,"
                            + "B_TON)"
                            + "VALUES('" + billno.getB_Refno() + "'," + billno.getB_Ontime() + "," + billno.getB_OnDate() + ","
                            + "'" + billno.getB_MacNo() + "','000','" + billno.getB_Cashier() + "',"
                            + "'" + billno.getB_Cust() + "','" + billno.getB_ETD() + "','" + billno.getB_Cash() + "','" + billno.getB_Total() + "',"
                            + "'"+billno.getB_MemCode()+"','"+billno.getB_Product()+"',"
                            + "'"+billno.getB_NetTotal()+"','"+billno.getB_NetVat()+"',"
                            + "'"+billno.getB_Vat()+"','"+billno.getB_PayAmt()+"',"
                            + "'"+billno.getB_AppCode1()+"','"+billno.getB_CrAmt1()+"','"+billno.getB_CrCode1()+"',"
                            + "'"+billno.getB_Ton()+"')";
        System.out.println(insertSQL);
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpen().createStatement();
            int i = stmt.executeUpdate(insertSQL);
            if (i > -1) {
                System.out.println("insert billno is already done.");
            }else{
                System.out.println("insert billno is fail !!!");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void saveMemberPay(billnoBean billno){
        String value1 = "ค่าสมาชิก";
        //update table t_sale
        String sqlMember = "INSERT INTO T_SALE"
                + "(R_Index,R_Refno,R_Table,"
                + "R_Date,R_Time,MacNo,Cashier,R_PluCode,"
                + "R_PName,R_Stock,R_ETD,R_Quan,R_Price,R_Total,R_NetTotal)"
                + "VALUES('" + billno.getB_Refno() + "/001','" + billno.getB_Refno() + "','000',"
                + "curdate(),curtime(),'" + billno.getB_MacNo() + "','" + billno.getB_Cashier() + "','0000000000000',"
                + "'" + ThaiUtil.Unicode2ASCII(value1) + "','N','E','1','" + billno.getR_Price() + "','" 
                + billno.getR_Total() + "','" + billno.getR_NetTotal() + "')";
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpen().createStatement();
            int i = stmt.executeUpdate(sqlMember);
            if (i > -1) {
                System.out.println("insert t_sale member done.");
            }else{
                System.out.println("not insert t_sale member !!!");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void saveMoneyFreePay(billnoBean billno){
        String value2 = "ค่ามัดจำ";
        String sqlFree = "INSERT INTO T_SALE"
                + "(R_Index,R_Refno,R_Table,"
                + "R_Date,R_Time,MacNo,Cashier,R_PluCode,"
                + "R_PName,R_Stock,R_ETD,R_Quan,R_Price,R_Total,R_NetTotal)"
                + "VALUES('" + billno.getB_Refno() + "/002','" + billno.getB_Refno() + "','000',"
                + "curdate(),curtime(),'" + billno.getB_MacNo() + "','" + billno.getB_Cashier() + "','0000000000001',"
                + "'" + ThaiUtil.Unicode2ASCII(value2) + "','N','E','1','" 
                + billno.getR_Price() + "','" + billno.getR_Total() + "','" + billno.getR_NetTotal() + "')";
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpen().createStatement();
            int i = stmt.executeUpdate(sqlFree);
            if (i > -1) {
                System.out.println("insert t_sale money free done.");
            }else{
                System.out.println("not insert t_sale money free !!!");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void saveBillDiscount(billnoBean billno){
        String value2 = "ค่าส่วนลด";
        String sqlFree = "INSERT INTO T_SALE"
                + "(R_Index,R_Refno,R_Table,"
                + "R_Date,R_Time,MacNo,Cashier,R_PluCode,"
                + "R_PName,R_Stock,R_ETD,R_Quan,R_Price,R_Total,R_NetTotal)"
                + "VALUES('" + billno.getB_Refno() + "/003','" + billno.getB_Refno() + "','000',"
                + "curdate(),curtime(),'" + billno.getB_MacNo() + "','" + billno.getB_Cashier() + "','0000000000002',"
                + "'" + ThaiUtil.Unicode2ASCII(value2) + "','N','E','1','" 
                + billno.getR_Price() + "','" + billno.getR_Total() + "','" + billno.getR_NetTotal() + "')";
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpen().createStatement();
            int i = stmt.executeUpdate(sqlFree);
            if (i > -1) {
                System.out.println("insert t_sale money discount done.");
            }else{
                System.out.println("not insert t_sale money discount !!!");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {        
        billnoBean bean = new billnoBean();
        bean.setB_Total(0);
        bean.setB_MemCode("0054");
        BillNoDB.savePointType(bean);
    }
    
    public static void savePointType(billnoBean billno){
        ConnectDB con = new ConnectDB();        
        SimpleDateFormat s1 = new SimpleDateFormat("EE", Locale.ENGLISH);
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat s3 = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        String DAY = s1.format(new java.util.Date());//Sun, Mon, Wed, Thu... 
        String DATE = s2.format(new java.util.Date());//2013-05-13
        String TIME = s3.format(new java.util.Date());//00:00:00
        try {
            Statement stmt = con.connectOpenMember().createStatement();
            String sql = "select bahtrateperpoint1, point1 from pointtype "
                    + "where point_typedateService like '%"+DAY+"%' "
                    + "and (point_startdateservice<='"+DATE+"' and point_finishdateservice>='"+DATE+"') "
                    + "and (point_starttimeservice1<='"+TIME+"' and point_finishtimeservice1>='"+TIME+"')";
            ResultSet rt = stmt.executeQuery(sql);            
            int MoneyRate = 1;
            int Point = 1;
            while (rt.next()) {
                MoneyRate = rt.getInt("bahtrateperpoint1");
                Point = rt.getInt("point1");
            }
            double totalMoney = 0.0;
            try{
                totalMoney = (billno.getB_Total()/MoneyRate)*Point;
            }catch(Exception e){
                
            }
            String upd = "update memmaster "
                    + "set member_totalscore=member_totalscore+"+totalMoney+" "
                    + "where member_code='"+billno.getB_MemCode()+"'";
            System.out.println(upd);
            if(stmt.executeUpdate(upd)>0){
                System.out.println("update point is already done.");
            }
            rt.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "MySQL ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
