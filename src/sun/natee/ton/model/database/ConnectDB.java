package sun.natee.ton.model.database;

import sun.natee.ton.view.form.TheValue;
import sun.natee.ton.control.api.ThaiUtil;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.control.api.FileUtility;

public class ConnectDB {
    private String URL = "";
    private String USER = "";
    private String PASS = "";
    private Connection CONN;
    
    public static void main(String[] args) {
        ConnectDB odbc=new ConnectDB();
        odbc.test();
    }
    
    public boolean executeSQLTest(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }

    public ConnectDB() {
    }
    
    public boolean executeSQL(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            if (stmt.executeUpdate(sql) != -1) {
                System.out.println("Update/Insert Success Command.");
                isSuccess=true;
            } else {
                System.out.println("Update/Insert Not success !!!");
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }
    
    public boolean querySQL(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            if (stmt.executeQuery(sql).next()) {
                isSuccess=true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }
    
    public boolean tableIsExist(String table) {
        boolean isExist = false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select * from " + table);
            isExist = true;
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            isExist=false;
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return isExist;
    }

    public void createTableSetup() {
        String sql = "CREATE TABLE TBSETUP (\n"
                + "TABLE_ID VARCHAR( 5 ) NOT NULL ,\n"
                + "TABLE_NO VARCHAR( 5 ) NOT NULL ,\n"
                + "TABLE_STATUS CHAR( 1 ) NOT NULL ,\n"
                + "TABLE_TIME INT( 2 ) NOT NULL ,\n"
                + "PRIMARY KEY (TABLE_ID, TABLE_NO)\n"
                + ")ENGINE=MyISAM DEFAULT CHARSET=latin1";
        if(!tableIsExist("TBSETUP")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createBillTable() {
        String sql = "CREATE TABLE RFID_BILL (\n"
                + "BILL_NO VARCHAR( 10 ) NOT NULL ,\n"
                + "BILL_DATE DATETIME NOT NULL ,\n"
                + "BILL_CUST_ID CHAR( 5 ) NOT NULL ,\n"
                + "BILL_FREE_MONEY DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_CASH DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_CREDIT DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_TOTAL_SUMMARY DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "PRIMARY KEY (BILL_NO)\n"
                + ")ENGINE=MyISAM DEFAULT CHARSET=latin1";
        if(!tableIsExist("RFID_BILL")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createRFIDStock(){
        String sql = "CREATE TABLE RFID_STOCK ("
                + "RFID_ID VARCHAR( 15 ) NOT NULL ,"
                + "CUST_ID VARCHAR( 5 ) NOT NULL ,"
                + "MEMBER_CODE VARCHAR( 13 ) NOT NULL ,"
                + "RFID_LAST_ACTIVITY VARCHAR( 50 ),"
                + "RFID_CREATION_DATE DATETIME,"
                + "RFID_EXPIRE_DATE DATETIME,"
                + "RFID_MONEY DOUBLE( 8, 2 ),"
                + "RFID_STATUS CHAR( 1 )DEFAULT  'N',"
                + "CUST_NAME VARCHAR( 50 ) ,"
                + "CUST_SURNAME VARCHAR( 100 ),"
                + "CUST_AGE FLOAT(12,2) DEFAULT '0',"
                + "CUST_SEX VARCHAR( 100 ),"
                + "CASHIER VARCHAR( 50 ),"
                + "CUST_TEL VARCHAR( 15 ),"
                + "RFID_REMARK VARCHAR( 250 ),"
                + "RFID_LAST_TIME DATETIME,"
                + "RFID_STATUS_REMARK VARCHAR( 250 ),"
                + "IMG_PATH VARCHAR( 250 ),"
                + "FILL_MONEY_DATE DATETIME,"
                + "FREE_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_NO VARCHAR( 15 ),"
                + "CREDIT_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_TYPE VARCHAR( 30 ),"
                + "PRIMARY KEY (  RFID_ID, CUST_ID ))"
                + "ENGINE=MyISAM DEFAULT CHARSET=latin1";
        //if not exist
        if(!tableIsExist("RFID_STOCK")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                if(stmt.execute(sql)){
                    System.out.println("==>Create table RFID_STOCK is success");
                }else{
                    System.out.println("Not create table RFID_STOCK");
                }
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createRFIDStockHistory(){
        String sql = "CREATE TABLE RFID_STOCK_HISTORY ("
                + "RFID_ID VARCHAR( 15 ) NOT NULL ,"
                + "CUST_ID VARCHAR( 5 ) NOT NULL ,"
                + "MEMBER_CODE VARCHAR( 13 ) NOT NULL ,"
                + "RFID_LAST_ACTIVITY VARCHAR( 50 ),"
                + "RFID_CREATION_DATE DATETIME,"
                + "RFID_EXPIRE_DATE DATETIME,"
                + "RFID_MONEY DOUBLE( 8, 2 ),"
                + "RFID_STATUS CHAR( 1 )DEFAULT  'N',"
                + "CUST_NAME VARCHAR( 50 ),"
                + "CUST_SURNAME VARCHAR( 100 ),"
                + "CUST_AGE FLOAT(12,2) DEFAULT '0',"
                + "CUST_SEX VARCHAR( 100 ),"
                + "CASHIER VARCHAR( 50 ),"
                + "CUST_TEL VARCHAR( 15 ),"
                + "RFID_REMARK VARCHAR( 250 ),"
                + "RFID_LAST_TIME DATETIME,"
                + "RFID_STATUS_REMARK VARCHAR( 250 ),"
                + "IMG_PATH VARCHAR( 250 ),"
                + "FILL_MONEY_DATE DATETIME,"
                + "FREE_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_NO VARCHAR( 15 ),"
                + "CREDIT_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_TYPE VARCHAR( 30 )"
                + ")"                
                + "ENGINE=MyISAM DEFAULT CHARSET=latin1";
        //if not exist
        if(!tableIsExist("RFID_STOCK_HISTORY")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public Connection connectOpen() {
        loadConfigFromFile("config.txt");
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpen(String URL) {
        loadConfigFromFile("config.txt");
        this.URL=URL;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpenMember() {
        loadConfigFromFile("configMem.txt");
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpen(String URL, String USER, String PASS) {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           //URL = jdbc:mysql://localhost:3307/mycrmbranch?charset=tis620
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }

    public void close() {
        if (CONN != null) {
            try {
                CONN.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public RFIDBean getDataMember(String MEMBER_CODE) {
        RFIDBean bean=null;
        String age;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpenMember().createStatement();
            String sql="select MEMBER_CODE, MEMBER_TYPECODE, MEMBER_NAMETHAI, MEMBER_SURNAMETHAI, MEMBER_MOBILE, MEMBER_GENDER, "
                    + "date_format(Member_Brithday,'%d/%m/%Y') MEMBER_BRITHDAY "
                    + "FROM memmaster where MEMBER_CODE='"+MEMBER_CODE+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bean= new RFIDBean();
                //PROFILE DATA
                bean.setMEMBER_CODE(rs.getString("MEMBER_CODE"));
                bean.setMEMBER_TYPE(rs.getString("MEMBER_TYPECODE"));
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("MEMBER_NAMETHAI")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("MEMBER_SURNAMETHAI")));
                bean.setMEMBER_GENDER(rs.getString("MEMBER_GENDER"));
                bean.setMEMBER_MOBILE(rs.getString("MEMBER_MOBILE"));
                try {
                    age = rs.getString("MEMBER_BRITHDAY");
                    if(age.equals("00/00/0000")){
                        age = "";
                    }
                } catch (Exception e) {
                    age = "";
                }
                bean.setMEMBER_BRITHDAY(age);
            }
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return bean;
    }
    
    public RFIDBean getDataRFID(String rfid_id) {
        RFIDBean bean=null;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="select * from rfid_stock where rfid_id='"+rfid_id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bean= new RFIDBean();
                //PROFILE DATA
                bean.setRFID_ID(rs.getString("RFID_ID"));
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setMEMBER_TYPE(rs.getString("MEMBER_TYPE"));
                bean.setMEMBER_CODE(rs.getString("MEMBER_CODE"));
                bean.setRFID_EXPIRE_DATE(rs.getString("RFID_EXPIRE_DATE"));
                bean.setRT_FREE_MONEY(rs.getString("RT_FREE_MONEY"));
                
                //RFID DATA
                bean.setRFID_MONEY(rs.getDouble("RFID_MONEY"));
                bean.setRFID_EXPIRE_DATE(rs.getString("RFID_EXPIRE_DATE"));
                bean.setFILL_MONEY_DATE(rs.getString("FILL_MONEY_DATE"));
                bean.setRFID_STATUS(rs.getString("RFID_STATUS"));
                bean.setFREE_MONEY(rs.getDouble("FREE_MONEY"));
                bean.setCREDIT_NO(rs.getString("CREDIT_NO"));
                bean.setCREDIT_MONEY(rs.getDouble("CREDIT_MONEY"));
                bean.setCREDIT_TYPE(rs.getString("CREDIT_TYPE"));
                
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_NAME")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SURNAME")));
                bean.setMEMBER_BRITHDAY(rs.getString("CUST_AGE"));
                bean.setMEMBER_GENDER(rs.getString("CUST_SEX"));
                bean.setMEMBER_MOBILE(rs.getString("CUST_TEL"));
            }
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return bean;
    }
    
    public boolean saveProfile(RFIDBean bean) {
        boolean isReturn=false;
        boolean isReturn2=false;
        String sqlAddMember = "";
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="insert into rfid_stock("
                    + "rfid_id,cust_id,member_code,cust_name,cust_surname,"
                    + "cust_tel, cashier,cust_sex,"
                    + "rfid_last_activity,rfid_creation_date,rfid_status,rfid_money,"
                    + "rfid_last_time, IMG_PATH, CREDIT_TYPE, MEMBER_TYPE) "
                    + "values("
                    + "'"+bean.getRFID_ID()+"',"
                    + "'"+bean.getCUST_ID()+"',"
                    + "'"+bean.getMEMBER_CODE()+"',"
                    + "'"+bean.getMEMBER_NAME()+"',"                    
                    + "'"+bean.getMEMBER_SURNAME()+"',"
                    + "'"+bean.getMEMBER_MOBILE()+"',"
                    + "'"+bean.getCASHIER()+"',"
                    + "'"+bean.getMEMBER_GENDER()+"',"
                    + "'"+bean.getRFID_LAST_ACTIVITY()+"',"
                    + ""+bean.getRFID_CREATION_DATE()+","
                    + "'"+bean.getRFID_STATUS()+"',"
                    + "'"+bean.getRFID_MONEY()+"',"
                    + "current_timestamp(),"
                    + "'"+bean.getIMG_PATH()+"',"
                    + "'', '"+bean.getMEMBER_TYPE()+"')";
            sqlAddMember = "insert into memmaster"
                    + "(member_code, member_namethai, member_surnamethai, "
                    + "member_gender, member_mobile, member_brithday, member_active, Member_TypeCode)"
                    + "values('"+bean.getMEMBER_CODE()+"','"+bean.getMEMBER_NAME()+"', '"+bean.getMEMBER_SURNAME()+"', "
                    + "'"+bean.getMEMBER_GENDER()+"', '"+bean.getMEMBER_MOBILE()+"', "
                    + "STR_TO_DATE('"+bean.getMEMBER_BRITHDAY()+"', '%d/%m/%Y'), 'Y', '"+bean.getMEMBER_TYPE()+"');";            
            //System.out.println(sql);
            if (stmt.executeUpdate(sql) != -1) {
                saveProfileHistory(bean);
                isReturn=true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            isReturn = false;
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //ADD MEMBER 
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpenMember().createStatement();
            String chkMember = "select MEMBER_CODE from memmaster where member_code='"+bean.getMEMBER_CODE()+"'";
            ResultSet rs = stmt.executeQuery(chkMember);
            if(rs.next()){
                updateMember(bean);
                isReturn2 = true;
            }else{
                int i = stmt.executeUpdate(sqlAddMember);
                if(i>-1){
                    isReturn2 = true;
                }
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            isReturn2 = false;
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        boolean result = false;
        if(isReturn==true&&isReturn2==true){
            result = true;
        }
        
        return result;
    }
    
    public boolean saveProfileHistory(RFIDBean bean){
        boolean isReturn=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql = "insert into rfid_stock_history"
                    + "(RFID_ID,CUST_ID,MEMBER_CODE,RFID_LAST_ACTIVITY,RFID_CREATION_DATE,"
                    + "RFID_EXPIRE_DATE,RFID_MONEY,RFID_STATUS,CUST_NAME,"
                    + "CUST_SURNAME,CUST_SEX,CASHIER,CUST_AGE,CUST_TEL,RFID_REMARK,"
                    + "RFID_LAST_TIME,RFID_STATUS_REMARK,IMG_PATH,FILL_MONEY_DATE,"
                    + "FREE_MONEY,CREDIT_NO,CREDIT_MONEY,CREDIT_TYPE, MEMBER_TYPE) \n"
                    + "select RFID_ID,CUST_ID,MEMBER_CODE,RFID_LAST_ACTIVITY,RFID_CREATION_DATE,"
                    + "RFID_EXPIRE_DATE,RFID_MONEY,RFID_STATUS,CUST_NAME,"
                    + "CUST_SURNAME,CUST_SEX,CASHIER,CUST_AGE,CUST_TEL,RFID_REMARK,"
                    + "RFID_LAST_TIME,RFID_STATUS_REMARK,IMG_PATH,FILL_MONEY_DATE,"
                    + "FREE_MONEY,CREDIT_NO,CREDIT_MONEY,CREDIT_TYPE,MEMBER_TYPE from rfid_stock "
                    + "where rfid_id='"+bean.getRFID_ID()+"' ";
            if (stmt.executeUpdate(sql) != -1) {
                isReturn=true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isReturn;
    }
    
    public void updateBill(){
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "update poshwsetup set receno1=receno1+1 where terminal='"+getMacNo()+"'";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean updateMoneyData(RFIDBean bean) {
        boolean result=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="UPDATE RFID_STOCK "
                    + "SET "
                    + "FREE_MONEY='"+bean.getFREE_MONEY()+"',"
                    + "CREDIT_NO='"+bean.getCREDIT_NO()+"',"
                    + "CREDIT_MONEY='"+bean.getCREDIT_MONEY()+"',"
                    + "RFID_MONEY="+bean.getRFID_MONEY()+"+RFID_MONEY,"
                    + "RFID_LAST_TIME=current_timestamp(),"
                    + "RFID_REMARK='"+bean.getRFID_REMARK()+"',"
                    + "RFID_LAST_ACTIVITY='"+ThaiUtil.Unicode2ASCII(bean.getRFID_LAST_ACTIVITY())+"',"
                    + "FILL_MONEY_DATE=STR_TO_DATE('"+bean.getFILL_MONEY_DATE()+"', '%d/%m/%Y'), "
                    + "RFID_EXPIRE_DATE=STR_TO_DATE('"+bean.getRFID_EXPIRE_DATE()+"', '%d/%m/%Y'),"
                    + "CREDIT_TYPE='"+bean.getCREDIT_TYPE()+"' "
                    + "WHERE RFID_ID='"+bean.getRFID_ID()+"' "
                    + "AND CUST_ID='"+bean.getCUST_ID()+"' "
                    + "AND MEMBER_CODE='"+bean.getMEMBER_CODE()+"'";
            if (stmt.executeUpdate(sql) != -1) {
                saveBillData(bean);
                saveProfileHistory(bean);
                result=true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return result;
    }
    
    public String getMacNo(){
        return FileUtility.readFile("C:/macno.txt")[0].trim();
    }
    
    public String getNextBillNo(){
        String ReceNo1="";
        try {
            ConnectDB cc = new ConnectDB();
            Statement stmt = cc.connectOpen().createStatement();
            String sql = "select (ReceNo1+1) ReceNo1 from poshwsetup where Terminal='"+getMacNo()+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                ReceNo1 = rs.getString("ReceNo1");
                if(ReceNo1.length()==1){
                    ReceNo1="000000"+ReceNo1;
                }else if(ReceNo1.length()==2){
                    ReceNo1="00000"+ReceNo1;
                }else if(ReceNo1.length()==3){
                    ReceNo1="0000"+ReceNo1;
                }else if(ReceNo1.length()==4){
                    ReceNo1="000"+ReceNo1;
                }else if(ReceNo1.length()==5){
                    ReceNo1="00"+ReceNo1;
                }else if(ReceNo1.length()==6){
                    ReceNo1="0"+ReceNo1;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ReceNo1;
    }
    
    public void saveBillData(RFIDBean bean){
        String billNo = getNextBillNo();
        bean.setBILL_ID(billNo);
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="INSERT INTO RFID_BILL "
                    + "(BILL_NO,BILL_DATE,BILL_CUST_ID,BILL_FREE_MONEY,BILL_CASH,BILL_CREDIT,BILL_TOTAL_SUMMARY,"
                    + "BILL_APPCODE, DISCOUNT)"
                    + "VALUES("
                    + "'"+bean.getBILL_ID()+"',CURRENT_TIMESTAMP(),'"+bean.getCUST_ID()+"',"
                    + "BILL_FREE_MONEY+"+bean.getFREE_MONEY()+","
                    + "'"+bean.getBILL_CASH()+"',"
                    + "'"+bean.getCREDIT_MONEY()+"',"
                    + "'"+bean.getRFID_MONEY()+"',"
                    + "'"+bean.getBILL_APPCODE()+"',"
                    + "'"+bean.getBILL_DISCOUNT()+"')";
            stmt.executeUpdate(sql);
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean updateProfile(RFIDBean bean) {
        boolean result=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="UPDATE RFID_STOCK SET \n" +
                        "RFID_LAST_ACTIVITY='"+ThaiUtil.Unicode2ASCII(bean.getRFID_LAST_ACTIVITY())+"',\n" +
                        "CUST_NAME='"+bean.getMEMBER_NAME()+"',\n" +
                        "CUST_SURNAME='"+bean.getMEMBER_SURNAME()+"',\n" +
                        "CUST_SEX='"+bean.getMEMBER_GENDER()+"',\n" +
                        "CASHIER='"+bean.getCASHIER()+"',\n" +
                        "CUST_TEL='"+bean.getMEMBER_MOBILE()+"',\n" +
                        "RFID_LAST_TIME=CURRENT_TIMESTAMP(),\n" +
                        "RFID_STATUS='"+bean.getRFID_STATUS()+"'," + 
                        "MEMBER_TYPE='"+bean.getMEMBER_TYPE()+"' " +
                        "WHERE RFID_ID='"+bean.getRFID_ID()+"' AND CUST_ID='"+bean.getCUST_ID()+"'";            
            if (stmt.executeUpdate(sql) != -1) {
                result=true;
                //JOptionPane.showMessageDialog(null, "Update Success :)");
                //update history
                saveProfileHistory(bean);
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            result=false;
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        //UPDATE MEMBER 
        updateMember(bean);
        
        return result;
    }
    
    public boolean updateMember(RFIDBean bean){
        boolean result = false;
        //UPDATE MEMBER 
        try {
            String sqlUpdate = "update memmaster set "
                    + "member_namethai='"+bean.getMEMBER_NAME()+"',"
                    + "member_surnamethai='"+bean.getMEMBER_SURNAME()+"',"
                    + "member_gender='"+bean.getMEMBER_GENDER()+"',"
                    + "member_mobile='"+bean.getMEMBER_MOBILE()+"',"
                    + "member_brithday=STR_TO_DATE('"+bean.getMEMBER_BRITHDAY()+"', '%d/%m/%Y'),"
                    + "member_active='"+bean.getRFID_STATUS()+"',"
                    + "member_typecode='"+bean.getMEMBER_TYPE()+"' "
                    + "where member_code='"+bean.getMEMBER_CODE()+"'";
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpenMember().createStatement();
            int i = stmt.executeUpdate(sqlUpdate);
            if(i>-1){
                result = true;
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            result = false;
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return result;
    }

    public void createTablePermission(){
        String sql="CREATE TABLE RFID_PERMISSION (\n" +
                    " USERNAME VARCHAR( 20 ) NOT NULL ,\n" +
                    " USERGROUP VARCHAR( 10 ) NOT NULL ,\n" +
                    " M1 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M2 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M3 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M4 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M5 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M6 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M7 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M8 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M9 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M10 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M11 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M12 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    "PRIMARY KEY (  USERNAME )\n" +
                    ")";
        if(!tableIsExist("RFID_PERMISSION")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.execute("insert into rfid_permission(username,usergroup) select username, password from usergroup");
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public boolean[] getPermission(String username){
        ConnectDB odbc = new ConnectDB();
        String user="";
        try {
            Statement st = odbc.connectOpen().createStatement();
            ResultSet rs = st.executeQuery("select Usergroup from posuser where username='"+username+"'");
            if(rs.next()){
                user = rs.getString("usergroup");
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        String sql = "select * from rfid_permission where username='"+user+"'";        
        boolean []p = new boolean[TheValue.MENU.length];
        try {            
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                for(int i=0;i<p.length;i++){
                    p[i] = rs.getString(i+3).equals("Y");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return p;
    }

    private void loadConfigFromFile(String file) {
        File f=new File(file);
        if(!f.exists()){
            JOptionPane.showMessageDialog(null, "ไม่พบไฟล์ "+file+" กรุณาตรวจสอบอีกครั้ง");
        }else{
            try {
                FileInputStream fs = new FileInputStream(file);  
                DataInputStream ds = new DataInputStream(fs);
                BufferedReader br = new BufferedReader(new InputStreamReader(ds));
                String data;
                while ((data = br.readLine()) != null)   {
                    //System.out.println (data);
                    String []arr=data.split(",");
                    String tag=arr[0];
                    String value="";
                    if(arr.length==2){
                        value=arr[1];
                    }
                    if(tag.indexOf("URL")!=-1){
                        URL=value;
                    }else if(tag.indexOf("RFID")!=-1){
                        TheValue.COMPORT_RFID=value;
                    }else if(tag.indexOf("PRINTER")!=-1){
                        TheValue.COMPORT_PRINTER=value;
                    }else if(tag.indexOf("USER")!=-1){
                        USER=value;
                    }else if(tag.indexOf("PASS")!=-1){
                        PASS=value;
                    }
                }  
                ds.close();                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public boolean deleteProfile(String RFID_ID) {
        boolean result=false;
        RFIDBean bean = null;
        try {
            ConnectDB odbc = new ConnectDB();
            bean = odbc.getDataRFID(RFID_ID);
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="UPDATE RFID_STOCK SET "
                    + "RFID_STATUS='D', "
                    + "RFID_LAST_TIME=current_timestamp(), "
                    + "RFID_LAST_ACTIVITY='"+ThaiUtil.Unicode2ASCII(TheValue.MSG_DEL_PROFILE)+"' "
                    + "WHERE RFID_ID='"+bean.getRFID_ID()+"' "
                    + "AND CUST_ID='"+bean.getCUST_ID()+"'";
            String sqlDel = "delete from rfid_stock where rfid_id='"+bean.getRFID_ID()+"'";
            if (stmt.executeUpdate(sql) != -1) {                
                saveProfileHistory(bean);
                stmt.executeUpdate(sqlDel);
                
                result = true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return result;
    }
    
    public boolean cancleProfile(String RFID_ID) {
        boolean result=false;
        RFIDBean bean = null;
        try {
            ConnectDB odbc = new ConnectDB();
            bean = odbc.getDataRFID(RFID_ID);
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="UPDATE RFID_STOCK SET "
                    + "RFID_STATUS='C', "
                    + "RFID_LAST_TIME=current_timestamp(), "
                    + "RFID_LAST_ACTIVITY='"+ThaiUtil.Unicode2ASCII(bean.getRFID_LAST_ACTIVITY())+"' "
                    + "WHERE RFID_ID='"+bean.getRFID_ID()+"' "
                    + "AND CUST_ID='"+bean.getCUST_ID()+"'";
            String sqlDel = "delete from rfid_stock where rfid_id='"+bean.getRFID_ID()+"'";
            if (stmt.executeUpdate(sql) != -1) {                
                saveProfileHistory(bean);
                stmt.executeUpdate(sqlDel);
                
                result = true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return result;
    }
    
    public boolean informProfile(String RFID_ID) {
        boolean result=false;
        RFIDBean bean = null;
        try {
            ConnectDB odbc = new ConnectDB();
            bean = odbc.getDataRFID(RFID_ID);
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="UPDATE RFID_STOCK SET "
                    + "RFID_STATUS='N', "
                    + "RFID_LAST_TIME=current_timestamp(), "
                    + "RFID_LAST_ACTIVITY='INFORM' "
                    + "WHERE RFID_ID='"+bean.getRFID_ID()+"' "
                    + "AND CUST_ID='"+bean.getCUST_ID()+"'";
            String sqlDel = "delete from rfid_stock where rfid_id='"+bean.getRFID_ID()+"'";
            if (stmt.executeUpdate(sql) != -1) {                
                saveProfileHistory(bean);
                stmt.executeUpdate(sqlDel);
                
                result = true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return result;
    }

    private void test() {
        ConnectDB conn =new ConnectDB();
        try {
           Statement stmt = conn.connectOpen().createStatement();
           ResultSet rs = stmt.executeQuery("select * from product");
           while(rs.next()){
               System.out.println(rs.getString("PDESC"));
           }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean dataExist(String rfid_id, String cust_id) {
        boolean result=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="select * from rfid_stock where rfid_id='"+rfid_id+"' and cust_id='"+cust_id+"'";
            if (stmt.executeQuery(sql).next()) {
                result = true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return result;
    }

}
