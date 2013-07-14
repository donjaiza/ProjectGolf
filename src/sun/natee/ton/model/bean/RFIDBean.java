package sun.natee.ton.model.bean;

public class RFIDBean {
    //PROFILE
    private String MEMBER_CODE;
    private String MEMBER_TYPE;
    private String MEMBER_NAME;
    private String MEMBER_SURNAME = "";    
    private String MEMBER_GENDER = "";
    private String MEMBER_MOBILE = "";
    private String MEMBER_BRITHDAY = "";   
    private String MEMBER_ACTIVE = "N";
    private String RFID_ID;
    private String CUST_ID;
    private String CASHIER;
    
    //RFID HISTORY
    private String RFID_CREATION_DATE;
    private String RFID_EXPIRE_DATE;
    private String RFID_LAST_ACTIVITY;
    private Double RFID_MONEY = 0.00;
    private String RFID_STATUS;
    private String RFID_REMARK;
    private String RFID_LAST_TIME;
    private String RFID_STATUS_REMARK;
    private String IMG_PATH;
    private Double FREE_MONEY = 0.00;
    private String RT_FREE_MONEY;
    
    //RFID MONEY
    private String CREDIT_NO;
    private String CREDIT_TYPE;
    private Double CREDIT_MONEY = 0.00;
    private String FILL_MONEY_DATE;    
    private String BILL_APPCODE;
    
    //OTHER
    private String OPTION;
    private String BILL_ID;
    private Double BILL_CASH;
    private Double BILL_DISCOUNT;

    public Double getBILL_DISCOUNT() {
        return BILL_DISCOUNT;
    }

    public void setBILL_DISCOUNT(Double BILL_DISCOUNT) {
        this.BILL_DISCOUNT = BILL_DISCOUNT;
    }

    public String getRT_FREE_MONEY() {
        return RT_FREE_MONEY;
    }

    public void setRT_FREE_MONEY(String RT_FREE_MONEY) {
        this.RT_FREE_MONEY = RT_FREE_MONEY;
    }

    public Double getBILL_CASH() {
        return BILL_CASH;
    }

    public void setBILL_CASH(Double BILL_CASH) {
        this.BILL_CASH = BILL_CASH;
    }

    public String getMEMBER_TYPE() {
        return MEMBER_TYPE;
    }

    public void setMEMBER_TYPE(String MEMBER_TYPE) {
        this.MEMBER_TYPE = MEMBER_TYPE;
    }

    public String getBILL_APPCODE() {
        return BILL_APPCODE;
    }

    public void setBILL_APPCODE(String BILL_APPCODE) {
        this.BILL_APPCODE = BILL_APPCODE;
    }

    public String getBILL_ID() {
        return BILL_ID;
    }

    public String getMEMBER_ACTIVE() {
        return MEMBER_ACTIVE;
    }

    public void setMEMBER_ACTIVE(String MEMBER_ACTIVE) {
        this.MEMBER_ACTIVE = MEMBER_ACTIVE;
    }

    public void setBILL_ID(String BILL_ID) {
        this.BILL_ID = BILL_ID;
    }

    public String getMEMBER_BRITHDAY() {
        return MEMBER_BRITHDAY;
    }

    public void setMEMBER_BRITHDAY(String MEMBER_AGE) {
        this.MEMBER_BRITHDAY = MEMBER_AGE;
    }

    public String getMEMBER_MOBILE() {
        return MEMBER_MOBILE;
    }

    public void setMEMBER_MOBILE(String MEMBER_MOBILE) {
        this.MEMBER_MOBILE = MEMBER_MOBILE;
    }

    public String getMEMBER_NAME() {
        return MEMBER_NAME;
    }

    public void setMEMBER_NAME(String MEMBER_NAME) {
        this.MEMBER_NAME = MEMBER_NAME;
    }

    public String getMEMBER_SURNAME() {
        return MEMBER_SURNAME;
    }

    public void setMEMBER_SURNAME(String MEMBER_SURNAME) {
        this.MEMBER_SURNAME = MEMBER_SURNAME;
    }

    public String getMEMBER_GENDER() {
        return MEMBER_GENDER;
    }

    public void setMEMBER_GENDER(String MEMBER_GENDER) {
        this.MEMBER_GENDER = MEMBER_GENDER;
    }

    public String getMEMBER_CODE() {
        return MEMBER_CODE;
    }

    public void setMEMBER_CODE(String MEMBER_CODE) {
        this.MEMBER_CODE = MEMBER_CODE;
    }

    public String getCREDIT_TYPE() {
        return CREDIT_TYPE;
    }

    public void setCREDIT_TYPE(String CREDIT_TYPE) {
        this.CREDIT_TYPE = CREDIT_TYPE;
    }

    public String getOPTION() {
        return OPTION;
    }

    public void setOPTION(String OPTION) {
        this.OPTION = OPTION;
    }

    public String getRFID_ID() {
        return RFID_ID;
    }

    public void setRFID_ID(String RFID_ID) {
        this.RFID_ID = RFID_ID;
    }

    public String getCUST_ID() {
        return CUST_ID;
    }

    public void setCUST_ID(String CUST_ID) {
        this.CUST_ID = CUST_ID;
    }

    public String getCASHIER() {
        return CASHIER;
    }

    public void setCASHIER(String CASHIER) {
        this.CASHIER = CASHIER;
    }

    public String getRFID_CREATION_DATE() {
        return RFID_CREATION_DATE;
    }

    public void setRFID_CREATION_DATE(String RFID_CREATION_DATE) {
        this.RFID_CREATION_DATE = RFID_CREATION_DATE;
    }

    public String getRFID_EXPIRE_DATE() {
        return RFID_EXPIRE_DATE;
    }

    public void setRFID_EXPIRE_DATE(String RFID_EXPIRE_DATE) {
        this.RFID_EXPIRE_DATE = RFID_EXPIRE_DATE;
    }

    public String getRFID_LAST_ACTIVITY() {
        return RFID_LAST_ACTIVITY;
    }

    public void setRFID_LAST_ACTIVITY(String RFID_LAST_ACTIVITY) {
        this.RFID_LAST_ACTIVITY = RFID_LAST_ACTIVITY;
    }

    public Double getRFID_MONEY() {
        return RFID_MONEY;
    }

    public void setRFID_MONEY(Double RFID_MONEY) {
        this.RFID_MONEY = RFID_MONEY;
    }

    public String getRFID_STATUS() {
        return RFID_STATUS;
    }

    public void setRFID_STATUS(String RFID_STATUS) {
        this.RFID_STATUS = RFID_STATUS;
    }

    public String getRFID_REMARK() {
        return RFID_REMARK;
    }

    public void setRFID_REMARK(String RFID_REMARK) {
        this.RFID_REMARK = RFID_REMARK;
    }

    public String getRFID_LAST_TIME() {
        return RFID_LAST_TIME;
    }

    public void setRFID_LAST_TIME(String RFID_LAST_TIME) {
        this.RFID_LAST_TIME = RFID_LAST_TIME;
    }

    public String getRFID_STATUS_REMARK() {
        return RFID_STATUS_REMARK;
    }

    public void setRFID_STATUS_REMARK(String RFID_STATUS_REMARK) {
        this.RFID_STATUS_REMARK = RFID_STATUS_REMARK;
    }

    public String getIMG_PATH() {
        return IMG_PATH;
    }

    public void setIMG_PATH(String IMG_PATH) {
        this.IMG_PATH = IMG_PATH;
    }

    public Double getFREE_MONEY() {
        return FREE_MONEY;
    }

    public void setFREE_MONEY(Double FREE_MONEY) {
        this.FREE_MONEY = FREE_MONEY;
    }

    public String getCREDIT_NO() {
        return CREDIT_NO;
    }

    public void setCREDIT_NO(String CREDIT_NO) {
        this.CREDIT_NO = CREDIT_NO;
    }

    public Double getCREDIT_MONEY() {
        return CREDIT_MONEY;
    }

    public void setCREDIT_MONEY(Double CREDIT_MONEY) {
        this.CREDIT_MONEY = CREDIT_MONEY;
    }

    public String getFILL_MONEY_DATE() {
        return FILL_MONEY_DATE;
    }

    public void setFILL_MONEY_DATE(String FILL_MONEY_DATE) {
        this.FILL_MONEY_DATE = FILL_MONEY_DATE;
    }
}
