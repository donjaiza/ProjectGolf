package sun.natee.ton.control.api;


import java.sql.Time;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author surapol
 */
public class PublicVar {
    static String UseTouchScreen;
    static String ProcessType;
    static Boolean ChangTypeOK;
    static SimpleDateFormat DateFmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    static SimpleDateFormat TimeFmt = new SimpleDateFormat("HH:mm");
    static int P_ItemCount = 0;
    static Double P_TotalAmt = 0.00;
    static Double P_TotService = 0.00;
    static Double P_TotDiscount = 0.00;
    static Double P_NetAmt = 0.00;
    static int P_LineCount = 0;
    static Boolean P_LogoffOK = false;
    static String PrintOK = "Y";
    static String P_Table = "";
    static String _EDT = "E";
    static String P_Code = "";
    static String P_Status = "";
    static double P_Qty = 0.0;
    static Boolean ErrorColect = false;
    static String ReturnString = "";
    static int ReturnQty = 0;
    static String TempIndexKey = "";
    static int RowSelected = 0;
    static Boolean SubTotalOK;
    static int CouponCnt = 0;
    static String Open24House = "N";
    static Date SaleDate;
    static String CakeOrder_Id = "";
    static Double CakeOrder_Amount = 0.0;
    static String CakeOrder_Type = "";
    static Double CakeOrder_Deposite = 0.0;
    static String CakeOrder_PluCode = "";
    static Double CakeOrder_Qty = 0.0;
    static Double CakeOrder_Size = 0.0;
    //ForCharge
    static double ChargePriceDown = 0.50;
    static String ChargeCode = "";
    static String ChargeName = "";
    static int ChargeType = 0;
    static String ChargeRemark = "";
    static String ChargeGroup = "";
    static Date ChargeBeginDate;
    static Date ChargeExpDate;
    static String ChargeDocNo = "";
    //For ChkPromotion
    static Double PDisc = 0.0;
    static double PSpDisc = 0.0;
    static String ProType = "";
    static double XPoint;
    static String Branch_Name = "";
    static String Branch_Code = "";
    static String Branch_BranchType = "";
    static String Branch_Group = "";
    static String Branch_Kic1 = "N";
    static String Branch_Kic2 = "N";
    static String Branch_Kic3 = "N";
    static String Branch_Kic4 = "N";
    static String Branch_Saveorder = "N";
    static String Branch_GiftStatusChk = "N";
    static String Branch_PromotionGP = "";
    static int LockTime = 0;
    static String MacNo = "";
    static String invoiceno = "XXXXXXXX";
    static String CheckStockOnLine = "N";
    static String _User = "";
    static int _UserRound = 1;
    static String _RealUser = "";
    static String _UserName = "";
    static String Cont0 = "N";
    static String Cont1 = "N";
    static String Cont2 = "N";
    static String Cont3 = "N";
    static String Cont4 = "N";
    static String Cont5 = "N";
    static String Cont6 = "N";
    static String Cont7 = "N";
    static String Cont8 = "N";
    static String Cont9 = "N";
    static String Cont10 = "N";
    static String Cont11 = "N";
    static String Cont12 = "N";
    static String Cont13 = "N";
    static String Cont14 = "N";
    static String Cont15 = "N";
    static String Sale1 = "N";
    static String Sale2 = "N";
    static String Sale3 = "N";
    static String Sale4 = "N";
    static String Sale5 = "N";
    static String Sale6 = "N";
    static String Sale7 = "N";
    static String Sale8 = "N";
    static String Sale9 = "N";
    static String Sale10 = "N";
    static String Sale11 = "N";
    static String Sale12 = "N";
    static String Sale13 = "N";
    static String Sale14 = "N";
    static String Sale15 = "N";
    static String Sale16 = "N";
    static String Sale17 = "N";
    static String Sale18 = "N";
    static String Sale19 = "N";
    static String Sale20 = "N";
    static String Sale21 = "N";
    static String Sale22 = "N";
    static String Sale23 = "N";
    static String Sale24 = "N";
    static String Sale25 = "N";
    static String Sale26 = "N";
    static String Sale27 = "N";
    static String Sale28 = "N";
    static String Sale29 = "N";
    static String Sale30 = "N";
    static String Sale31 = "N";
    static String Sale32 = "N";
    static String Sale33 = "N";
    static String Sale34 = "N";
    static String Sale35 = "N";
    static String Sale36 = "N";
    static String Stock0_1 = "N";
    static String Stock1 = "N";
    static String Stock2 = "N";
    static String Stock3 = "N";
    static String Stock4 = "N";
    static String Stock5 = "N";
    static String Stock6 = "N";
    static String Stock7 = "N";
    static String Stock8 = "N";
    static String Stock9 = "N";
    static String Stock10 = "N";
    static String Stock11 = "N";
    static String Stock12 = "N";
    static String Stock13 = "N";
    static String Stock14 = "N";
    static String Stock15 = "N";
    static String Stock16 = "N";
    static String Stock17 = "N";
    static String Stock18 = "N";
    static String Stock19 = "N";
    static String Stock20 = "N";
    static String Stock21 = "N";
    static String Stock22 = "N";
    static String Stock23 = "N";
    static String Stock24 = "N";
    static String Stock25 = "N";
    static String Stock26 = "N";
    static String Stock27 = "N";
    static String Stock28 = "N";
    static String Stock29 = "N";
    static String Stock30 = "N";
    static String Stock31 = "N";
    static String Stock32 = "N";
    static String Stock33 = "N";
    static String Stock34 = "N";
    static String Stock35 = "N";
    static String Stock36 = "N";
    static String Stock37 = "N";
    static String Stock38 = "N";
    static String Stock39 = "N";
    static String Stock40 = "N";
    static String Stock41 = "N";
    static String Stock42 = "N";
    static String Stock43 = "N";
    static String Stock44 = "N";
    static String Stock45 = "N";
    static String Stock46 = "N";
    static String Stock47 = "N";
    static String Stock48 = "N";
    static String Stock49 = "N";
    static String Stock50 = "N";
    static String Stock51 = "N";
    static String Stock52 = "N";
    static String Stock53 = "N";
    static String Stock54 = "N";
    static String Stock55 = "N";
    static String Stock56 = "N";
    static String Stock57 = "N";
    //THWRec = Record No {Define Terminal Hardware Config....}
    static String HWRec_Terminal = "";
    static String HWrec_MacNo = "";
    static long HWrec_Receno1 = 0;
    static String HWrec_SaleType = "";
    static String HWrec_Heading1 = "";
    static String HWrec_Heading2 = "";
    static String HWrec_Heading3 = "";
    static String HWrec_Heading4 = "";
    static String HWrec_Footting1 = "";
    static String HWrec_Footting2 = "";
    static String HWrec_DrPort = "";
    static String HWrec_DrType = "";
    static String HWrec_DrCom = "";
    static String HWrec_DisPort = "";
    static String HWrec_DisType = "";
    static String HWrec_DisCom = "";
    static String HWrec_PrnPort = "";
    static String HWrec_PrnType = "1";
    static String HWrec_PrnCom = "";
    static String HWrec_PrnThaiLeval = "";
    static String HWrec_Kic1Port = "";
    static String HWrec_Kic1Type = "";
    static String HWrec_Kic1Com = "";
    static Boolean HWrec_Kic1ThaiLeval = false;
    static String HWrec_Kic2Port = "";
    static String HWrec_Kic2Type = "";
    static String HWrec_Kic2Com = "";
    static String HWrec_Kic2ThaiLeval = "";
    static String HWrec_Kic3Port = "";
    static String HWrec_Kic3Type = "";
    static String HWrec_Kic3Com = "";
    static Boolean Kic3ThaiLeval = false;
    static String HWrec_Kic4Port = "";
    static String HWrec_Kic4Type = "";
    static String HWrec_Kic4Com = "";
    static Boolean HWrec_Kic4ThaiLeval = false;
    static String HWrec_EDCPort = "";
    static String HWrec_SMPBank = "";
    static String HWrec_SMPPort = "";
    static String HWrec_MenuItemList = "";
    static String HWRec_EJDailyPath = "";
    static String HWRec_EJBackupPath = "";
    //TPOSConfig_Rec = Record     {Define POS-Default data Record...}
    static String Posconfig_P_Terminal = "";
    static Double Posconfig_P_Vat = 0.00;
    static String Posconfig_P_VatType = "";
    static Double Posconfig_P_Service = 0.00;
    static String Posconfig_P_VatPrn = "";
    static int Posconfig_P_BillCopy = 1;
    static String Posconfig_P_CodePrn = "";
    static String Posconfig_P_BillCopyOne = "";
    static String Posconfig_P_DefaultSaleType = "";
    static String Posconfig_P_EmpUse = "";
    static String P_CheckBillBeforCash = "";
    static String Posconfig_P_PrintDetailOnRecp = "";
    static String Posconfig_P_PrintRecpMessage = "";
    static String Posconfig_P_MemDisc = "";
    static String Posconfig_P_MemDiscChk = "";
    static String Posconfig_P_MemDiscGet = "";
    static String Posconfig_P_MemDiscMax = "";
    static String Posconfig_P_FastDisc = "";
    static String Posconfig_P_FastDiscChk = "";
    static String Posconfig_P_FastDiscGet = "";
    static String Posconfig_P_FastDiscMax = "";
    static String Posconfig_P_EmpDisc = "";
    static String Posconfig_P_EmpDiscChk = "";
    static String Posconfig_P_EmpDiscGet = "";
    static String Posconfig_P_EmpDiscMax = "";
    static String Posconfig_P_TrainDisc = "";
    static String Posconfig_P_TrainDiscChk = "";
    static String Posconfig_P_TrainDiscGet = "";
    static String Posconfig_P_TrainDiscMax = "";
    static String Posconfig_P_SubDisc = "";
    static String Posconfig_P_SubDiscChk = "";
    static String Posconfig_P_SubDiscGet = "";
    static String Posconfig_P_SubDiscMax = "";
    static String Posconfig_P_DiscBathChk = "";
    static int Posconfig_P_DiscBathMax = 0;
    static String Posconfig_P_PromotionChk = "";
    static String Posconfig_P_SpacialChk = "";
    static String Posconfig_P_DiscRound = "";
    static String Posconfig_P_ServiceRound = "";
    static String Posconfig_P_SerChkBySaleType = "";
    static String Posconfig_P_DiscChkBySaleType = "";
    static Double Posconfig_P_Memaddtimeamt = 0.0;
    static Double Posconfig_P_Memaddtimescore = 0.0;
    //TTableRec = Record   {Table Record .......}
    static String TableRec_RefNo = "";
    static Date TableRec_OnDate;
    static String TableRec_OnTime = "";
    static String TableRec_MacNo = "";
    static String TableRec_Cashier = "";
    static String TableRec_ETD = "";
    static String TableRec_TCode = "";
    static String TableRec_TLogInTime = "";
    static String TableRec_TCurTime = "";
    static Date TableRec_TLoginDate;
    static String TableRec_TOnAct = "";
    static int TableRec_TItem = 0;
    static int TableRec_TCustomer = 0;
    static Double TableRec_TAmount = 0.00;
    static Double TableRec_Food = 0.00;
    static Double TableRec_Drink = 0.00;
    static Double TableRec_Product = 0.00;
    static Double TableRec_Service = 0.00;
    static Double TableRec_ServiceAmt = 0.00;
    static String TableRec_FastDisc = "";
    static Double TableRec_FastDiscAmt = 0.00;
    static String TableRec_EmpDisc = "";
    static Double TableRec_EmpDiscAmt = 0.00;
    static String TableRec_TrainDisc = "";
    static Double TableRec_TrainDiscAmt = 0.00;
    static String TableRec_MemDisc = "";
    static Double TableRec_MemDiscAmt = 0.00;
    static String TableRec_SubDisc = "";
    static Double TableRec_SubDiscAmt = 0.00;
    static Double TableRec_DiscBath = 0.00;
    static Double TableRec_ProDiscAmt = 0.00;
    static Double TableRec_SpaDiscAmt = 0.00;
    static Double TableRec_CuponDiscAmt = 0.00;
    static Double TableRec_ItemDiscAmt = 0.00;
    static String TableRec_MemCode = "";
    static String TableRec_MemName = "";
    static Date TableRec_MemBegin;
    static Date TableRec_MemEnd;
    static Date TableRec_MemBrid;
    static Double TableRec_MemCurAmt = 0.00;
    static Double TableRec_Score = 0.00;
    static Double TableRec_SumScoreal = 0.00;
    static String TableRec_MemLastDate = "";
    static Double TableRec_NetTotal = 0.00;
    static Double TableRec_NetFood = 0.00;
    static Double TableRec_NetDrink = 0.00;
    static Double TableRec_NetProduct = 0.00;
    static Double TableRec_NetVat = 0.00;
    static Double TableRec_NetNonVat = 0.00;
    static Double TableRec_Vat = 0.00;
    static String TableRec_ArCode = "";
    static int TableRec_AccrCr = 0;
    static Double TableRec_ArPayment = 0.00;
    static Double TableRec_PayAmt = 0.00;
    static Double TableRec_Ton = 0.00;
    static Double TableRec_Earnest = 0.00;
    static Double TableRec_Gift_Voucher = 0.00;
    static Double TableRec_Cash = 0.00;
    static String TableRec_Cr_Bank = "";   //For SMP
    static Double TableRec_Cr_CardAmt = 0.00;
    static int TableRec_Cr_CurPoint = 0;
    static int TableRec_Cr_SumPoint = 0;
    static Double TableRec_Cr_PurseAmt = 0.00;
    static Double TableRec_Cr_CouponAmt = 0.00;
    static Double TableRec_Cr_TotCoupon = 0.00;
    static String TableRec_Cr_Code1 = "";
    static String TableRec_Cr_Name1 = "";
    static Double TableRec_Cr_Charge = 0.00;
    static Double TableRec_Cr_ChargeAmt = 0.00;
    static Double TableRec_Cr_Redule = 0.00;
    static String TableRec_Cr_CardNo1 = "";
    static String TableRec_Cr_App_Code1 = "";
    static Double TableRec_Cr_Amount1 = 0.00;
    static Double TableRec_PrintTotal = 0.00;
    static int TableRec_PrnCnt = 0;
    static int TableRec_BillCopy = 0;
    static String TableRec_PrnTime1 = "";
    static String TableRec_PrnTime2 = "";
    static String TableRec_BranCode = "";
    static String TableRec_BranName = "";
    static String TableRec_BranTel = "";
    static String TableRec_BranTime = "";
    static String TableRec_BranchDate = "";
    static String TableRec_ChkBill = "";
    static Time TableRec_ChkBillTime;  //Please Check Data Type
    static String TableRec_MemBarcode = "N";
    static String TableRec_PrintChkBill = "N";
    static String TableRec_BarcodeLost = "N";
    static String TableRec_BarcodeLostUser = "";
    static String TableRec_BarcodeLostUserName = "";
    static String TableRec_BarcodeLostTime = "";
    static String TableRec_EmpCode = "";
    static String TableRec_EmpName = "";
    static String TableRec_CakeOrder_Id = "";
    static Double TableRec_CakeOrder_Amount = 0.0;
    static String TableRec_CakeOrder_Type = "";
    static Double TableRec_CakeOrder_Deposite = 0.0;
    static String TableRec_ChargeCode1 = "";
    static String TableRec_ChargeName1 = "";
    static int TableRec_ChargeType1 = 0;
    static String TableRec_ChargeRemark1 = "";
    static String TableRec_ChargeGroup1 = "";
    //TTableRec2 = Record   {Table Record .......}
    static String TableRec2_RefNo = "";
    static Date TableRec2_OnDate;
    static String TableRec2_OnTime = "";
    static String TableRec2_MacNo = "";
    static String TableRec2_Cashier = "";
    static String TableRec2_ETD = "";
    static String TableRec2_TCode = "";
    static String TableRec2_TLogInTime = "";
    static String TableRec2_TCurTime = "";
    static Date TableRec2_TLoginDate;
    static String TableRec2_TOnAct = "";
    static int TableRec2_TItem = 0;
    static int TableRec2_TCustomer = 0;
    static Double TableRec2_TAmount = 0.00;
    static Double TableRec2_Food = 0.00;
    static Double TableRec2_Drink = 0.00;
    static Double TableRec2_Product = 0.00;
    static Double TableRec2_Service = 0.00;
    static Double TableRec2_ServiceAmt = 0.00;
    static String TableRec2_FastDisc = "";
    static Double TableRec2_FastDiscAmt = 0.00;
    static String TableRec2_EmpDisc = "";
    static Double TableRec2_EmpDiscAmt = 0.00;
    static String TableRec2_TrainDisc = "";
    static Double TableRec2_TrainDiscAmt = 0.00;
    static String TableRec2_MemDisc = "";
    static Double TableRec2_MemDiscAmt = 0.00;
    static String TableRec2_SubDisc = "";
    static Double TableRec2_SubDiscAmt = 0.00;
    static Double TableRec2_DiscBath = 0.00;
    static Double TableRec2_ProDiscAmt = 0.00;
    static Double TableRec2_SpaDiscAmt = 0.00;
    static Double TableRec2_CuponDiscAmt = 0.00;
    static Double TableRec2_ItemDiscAmt = 0.00;
    static String TableRec2_MemCode = "";
    static String TableRec2_MemName = "";
    static Date TableRec2_MemBegin;
    static Date TableRec2_MemEnd;
    static Date TableRec2_MemBrid;
    static Double TableRec2_MemCurAmt = 0.00;
    static Double TableRec2_Score = 0.00;
    static Double TableRec2_SumScoreal = 0.00;
    static String TableRec2_MemLastDate = "";
    static Double TableRec2_NetTotal = 0.00;
    static Double TableRec2_NetFood = 0.00;
    static Double TableRec2_NetDrink = 0.00;
    static Double TableRec2_NetProduct = 0.00;
    static Double TableRec2_NetVat = 0.00;
    static Double TableRec2_NetNonVat = 0.00;
    static Double TableRec2_Vat = 0.00;
    static String TableRec2_ArCode = "";
    static int TableRec2_AccrCr = 0;
    static Double TableRec2_ArPayment = 0.00;
    static Double TableRec2_PayAmt = 0.00;
    static Double TableRec2_Ton = 0.00;
    static Double TableRec2_Earnest = 0.00;
    static Double TableRec2_Gift_Voucher = 0.00;
    static Double TableRec2_Cash = 0.00;
    static String TableRec2_Cr_Bank = "";   //For SMP
    static Double TableRec2_Cr_CardAmt = 0.00;
    static int TableRec2_Cr_CurPoint = 0;
    static int TableRec2_Cr_SumPoint = 0;
    static Double TableRec2_Cr_PurseAmt = 0.00;
    static Double TableRec2_Cr_CouponAmt = 0.00;
    static Double TableRec2_Cr_TotCoupon = 0.00;
    static String TableRec2_Cr_Code1 = "";
    static String TableRec2_Cr_Name1 = "";
    static Double TableRec2_Cr_Charge = 0.00;
    static Double TableRec2_Cr_ChargeAmt = 0.00;
    static Double TableRec2_Cr_Redule = 0.00;
    static String TableRec2_Cr_CardNo1 = "";
    static String TableRec2_Cr_App_Code1 = "";
    static Double TableRec2_Cr_Amount1 = 0.00;
    static Double TableRec2_PrintTotal = 0.00;
    static int TableRec2_PrnCnt = 0;
    static int TableRec2_BillCopy = 0;
    static String TableRec2_PrnTime1 = "";
    static String TableRec2_PrnTime2 = "";
    static String TableRec2_BranCode = "";
    static String TableRec2_BranName = "";
    static String TableRec2_BranTel = "";
    static String TableRec2_BranTime = "";
    static String TableRec2_BranchDate = "";
    static String TableRec2_ChkBill = "";
    static Time TableRec2_ChkBillTime;  //Please Check Data Type
    static String TableRec2_MemBarcode = "N";
    static String TableRec2_PrintChkBill = "N";
    static String TableRec2_BarcodeLost = "N";
    static String TableRec2_BarcodeLostUser = "";
    static String TableRec2_BarcodeLostUserName = "";
    static String TableRec2_BarcodeLostTime = "";
    static String TableRec2_EmpCode = "";
    static String TableRec2_EmpName = "";
    static String TableRec2_CakeOrder_Id = "";
    static Double TableRec2_CakeOrder_Amount = 0.0;
    static String TableRec2_CakeOrder_Type = "";
    static Double TableRec2_CakeOrder_Deposite = 0.0;    
    //ProRec = Record 
    static String Procode = "";
    static String ProDesc = "";
    static Date PDate1;
    static Date PDate2;
    static String PSTRDay = "";
    static String PTime1S = "";
    static String PTime1E = "";
    static Double PDisc1 = 0.00;
    static Double PSpDisc1 = 0.00;
    static String PTS1 = "";
    static String PTime2S = "";
    static String PTime2E = "";
    static Double PDisc2 = 0.00;
    static Double PSpDisc2 = 0.00;
    static String PTS2 = "";
    static String PTime3S = "";
    static String PTime3E = "";
    static Double PDisc3 = 0.00;
    static Double PSpDisc3 = 0.00;
    static String PTS3 = "";
    static String PType = "";
    static int PSale1 = 0;
    static int PFree1 = 0;
    static int PSum1 = 0;
    static Double PDiscFree1 = 0.00;
    static int PSale2 = 0;
    static int PFree2 = 0;
    static int PSum2 = 0;
    static Double PDiscFree2 = 0.00;
    static int PSale3 = 0;
    static int PFree3 = 0;
    static int PSum3 = 0;
    static Double PDiscFree3 = 0.00;
    static int PSale41 = 0;
    static int PSale42 = 0;
    static int PSale43 = 0;
    static int PFree41 = 0;
    static int PFree42 = 0;
    static int PFree43 = 0;
    static String fixbranch = "";    
}
