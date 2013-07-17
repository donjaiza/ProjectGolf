package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.control.api.ThaiUtil;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.model.bean.billnoBean;
import sun.natee.ton.model.database.BillNoDB;
import sun.natee.ton.view.dialog.DateChooserDialog;
import sun.natee.ton.view.dialog.DateFormat;
import sun.natee.ton.control.api.LockPanelCom;
import sun.natee.ton.control.api.PPrint;
import sun.natee.ton.control.api.StringToDate;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;

public class PanelRegister extends javax.swing.JPanel {

    private boolean CheckOUTRFID = false;
    private Thread thread;
    private SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private ConnectDB conn = new ConnectDB();
    private ControlRFID control = new ControlRFID();
    private LockPanelCom lock = new LockPanelCom();

    public PanelRegister() {
        initComponents();

        loadCreditFile();
        loadMemberType();
//        lock.lockScreen(jPanel3, false);
//        lock.lockScreen(jPanel4, false);

        resetData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbSex = new javax.swing.JComboBox();
        txtCusSurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCusID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRFIDID = new javax.swing.JTextField();
        btnRFID = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtMemberID = new javax.swing.JTextField();
        btnRFID1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        c3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbMemberType = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDateDeposit = new javax.swing.JTextField();
        c1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtDateExpireDeposit = new javax.swing.JTextField();
        c2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtFree = new javax.swing.JTextField();
        txtDateEXP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMoneyRefill = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        cbTypePromotion = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtLastFill = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtExpireDate = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtRFIDMoney = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        lbFreeReturn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbActive = new javax.swing.JRadioButton();
        cbNoneActive = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCashPay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbCreditFile = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        txtCreditNo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtAPPCode = new javax.swing.JTextField();
        txtCreditPay = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSaveBill = new javax.swing.JButton();
        btnResetBill = new javax.swing.JButton();
        billNO = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtSumPayment = new javax.swing.JTextField();
        txtSumTon = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ประวัติลูกค้า", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ชื่อ");

        cbSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ชาย", "หญิง", "อื่นๆ" }));
        cbSex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbSexKeyReleased(evt);
            }
        });

        txtCusSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCusSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusSurnameKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("เพศ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("รหัสลูกค้า*");

        txtCusName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusNameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("นามสกุล");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("วันเกิด");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
        });

        txtCusID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCusID.setToolTipText("ไม่เกิน 7 หลัก");
        txtCusID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusIDKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("โทร");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("RFID ID*");

        txtRFIDID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRFIDID.setToolTipText("ไม่เกิน 15 หลัก");
        txtRFIDID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRFIDIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRFIDIDFocusLost(evt);
            }
        });
        txtRFIDID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRFIDIDKeyReleased(evt);
            }
        });

        btnRFID.setText("....");
        btnRFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFIDActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setText("เริ่มใหม่");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("F2 - เลือกดู");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("รหัสสมาชิก (Member)*");

        txtMemberID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMemberID.setToolTipText("ไม่เกิน 6 หลัก");
        txtMemberID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMemberIDKeyReleased(evt);
            }
        });

        btnRFID1.setText("....");
        btnRFID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFID1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("F2 - เลือกดู");

        c3.setText("...");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ประเภทสมาชิก*");

        cbMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRFIDID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRFID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRFID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCusID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbMemberType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(btnRFID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtRFIDID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCusID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbMemberType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRFID1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCusSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ลงทะเบียน / เติมเงิน");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เติมเงินในบัตร", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("มัดจำ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("บาท");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("วันที่เติม");

        txtDateDeposit.setEditable(false);
        txtDateDeposit.setBackground(new java.awt.Color(255, 255, 255));
        txtDateDeposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDateDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateDepositKeyReleased(evt);
            }
        });

        c1.setText("...");
        c1.setEnabled(false);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("วันหมดอายุบัตร");

        txtDateExpireDeposit.setEditable(false);
        txtDateExpireDeposit.setBackground(new java.awt.Color(255, 255, 255));
        txtDateExpireDeposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDateExpireDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateExpireDepositKeyReleased(evt);
            }
        });

        c2.setText("...");
        c2.setEnabled(false);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("F2 - เลือกดู");

        txtFree.setEditable(false);
        txtFree.setBackground(new java.awt.Color(255, 255, 255));
        txtFree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFree.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFreeKeyReleased(evt);
            }
        });

        txtDateEXP.setEditable(false);
        txtDateEXP.setBackground(new java.awt.Color(255, 255, 255));
        txtDateEXP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDateEXP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateEXPKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("วัน");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("จำนวนเงิน");

        txtMoneyRefill.setEditable(false);
        txtMoneyRefill.setBackground(new java.awt.Color(255, 255, 255));
        txtMoneyRefill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMoneyRefill.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMoneyRefill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMoneyRefillKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("บาท");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("ส่วนลด");

        txtDiscount.setEditable(false);
        txtDiscount.setBackground(new java.awt.Color(255, 255, 255));
        txtDiscount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });

        cbTypePromotion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTypePromotion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "%", "บาท" }));
        cbTypePromotion.setEnabled(false);
        cbTypePromotion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbTypePromotionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDateDeposit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDateEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateExpireDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMoneyRefill, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTypePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDateEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtDateExpireDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMoneyRefill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel16)
                    .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTypePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลการเติมเงินล่าสุด", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("จำนวนเงินคงเหลือ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("บาท");

        txtLastFill.setEditable(false);
        txtLastFill.setBackground(new java.awt.Color(255, 255, 255));
        txtLastFill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("วันที่เติมเงินล่าสุด");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("วันหมดอายุบัตร");

        txtExpireDate.setEditable(false);
        txtExpireDate.setBackground(new java.awt.Color(255, 255, 255));
        txtExpireDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("สถานะ");

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtRFIDMoney.setEditable(false);
        txtRFIDMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtRFIDMoney.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0"))));
        txtRFIDMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel34.setText("เงินมัดจำ");

        lbFreeReturn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFreeReturn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFreeReturn.setText("0 บาท");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtRFIDMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel25)
                        .addGap(10, 10, 10)
                        .addComponent(txtLastFill, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel26)
                        .addGap(10, 10, 10)
                        .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel27)
                        .addGap(10, 10, 10)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbFreeReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRFIDMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel25))
                    .addComponent(txtLastFill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel26))
                    .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel27))
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(lbFreeReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "สถานะการใช้งาน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        buttonGroup1.add(cbActive);
        cbActive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbActive.setText("ใช้งาน");

        buttonGroup1.add(cbNoneActive);
        cbNoneActive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbNoneActive.setText("ยกเลิกการใช้งาน");
        cbNoneActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNoneActiveItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbActive)
                .addGap(18, 18, 18)
                .addComponent(cbNoneActive)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbActive)
                    .addComponent(cbNoneActive))
                .addContainerGap())
        );

        btn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1.setText("ประวัติ");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn2.setText("โอนข้อมูล");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn3.setText("ลบข้อมูล");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("คืนมัดจำ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "จ่ายเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("เงินสด");

        txtCashPay.setEditable(false);
        txtCashPay.setBackground(new java.awt.Color(255, 255, 255));
        txtCashPay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCashPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashPayFocusGained(evt);
            }
        });
        txtCashPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashPayKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("บาท");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ประเภทบัตร");

        cbCreditFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbCreditFile.setEnabled(false);
        cbCreditFile.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCreditFileItemStateChanged(evt);
            }
        });
        cbCreditFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbCreditFileKeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("เลขที่");

        txtCreditNo.setEditable(false);
        txtCreditNo.setBackground(new java.awt.Color(255, 255, 255));
        txtCreditNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCreditNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditNoKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("App Code");

        txtAPPCode.setEditable(false);
        txtAPPCode.setBackground(new java.awt.Color(255, 255, 255));
        txtAPPCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAPPCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAPPCodeKeyReleased(evt);
            }
        });

        txtCreditPay.setEditable(false);
        txtCreditPay.setBackground(new java.awt.Color(255, 255, 255));
        txtCreditPay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCreditPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCreditPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditPayKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("จำนวนเงิน");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("บาท");

        btnSaveBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveBill.setText("บันทึก/ พิมพ์บิล");
        btnSaveBill.setEnabled(false);
        btnSaveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBillActionPerformed(evt);
            }
        });

        btnResetBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnResetBill.setText("เริ่มใหม่");
        btnResetBill.setEnabled(false);
        btnResetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetBillActionPerformed(evt);
            }
        });

        billNO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        billNO.setText("#0000000000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("บิลเลขที่");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billNO, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCreditFile, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAPPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreditPay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreditNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(billNO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCreditFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(txtCreditNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel30))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAPPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtCreditPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResetBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "จำนวนเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtSumPayment.setEditable(false);
        txtSumPayment.setBackground(new java.awt.Color(255, 255, 255));
        txtSumPayment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSumPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtSumTon.setEditable(false);
        txtSumTon.setBackground(new java.awt.Color(255, 255, 255));
        txtSumTon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSumTon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("จำนวนเงิน(บาท)");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("เงินทอน(บาท)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSumPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(txtSumTon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSumPayment)
                    .addComponent(txtSumTon))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCusIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusIDKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCusID.getText().trim().equals("")) {
            if (checkCusID()) {
                JOptionPane.showMessageDialog(null, "รหัสลูกค้า " + txtCusID.getText() + " มีการนำไปใช้งานแล้ว");
                txtCusID.setText("");
                txtCusID.requestFocus();
            } else {
                btnRFID1.setEnabled(true);
                txtMemberID.setEditable(true);
                txtMemberID.requestFocus();
            }

            btnSave.setEnabled(true);
            btnReset.setEnabled(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_txtCusIDKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetData();                
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtCusNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusNameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCusName.getText().trim().equals("")) {
            txtCusSurname.setEditable(true);
            txtCusSurname.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_txtCusNameKeyReleased

    private void txtCusSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusSurnameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCusSurname.getText().trim().equals("")) {
            cbSex.setEnabled(true);
            cbSex.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_txtCusSurnameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtAge.getText().trim().equals("")) {
            txtTel.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            c3ActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtTel.getText().trim().equals("")) {
            btnSave.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_txtTelKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (TheValue.MENU[0]) {
            saveProfile();
        } else {
            TheValue.notAuthorization();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRFIDIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFIDIDKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtRFIDID.getText().equals("")) {
            if (checkHistoryCancel(txtRFIDID.getText().trim())) {
                JOptionPane.showMessageDialog(null, "บัตรนี้ถูกยกเลิกการใช้งานไปแล้ว!");
            } else {
                if (!loadData()) {
                    txtCusID.setEditable(true);
                    btnSave.setEnabled(true);
                    btnReset.setEnabled(true);
                    txtCusID.requestFocus();
                    CheckOUTRFID = true;
                    control.closePort();
                }
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            btnRFIDActionPerformed(null);
        }
    }//GEN-LAST:event_txtRFIDIDKeyReleased

    private void btnRFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFIDActionPerformed
        ShowCust dialog = new ShowCust(null, true);
        dialog.setVisible(true);

        if (!dialog.getRFID().equals("")) {
            txtRFIDID.setText(dialog.getRFID());
            loadData();
        }
    }//GEN-LAST:event_btnRFIDActionPerformed

    private void txtCreditNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditNoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCreditNo.getText().trim().equals("")) {
            if (txtCreditNo.getText().equals("")) {
                txtCreditNo.setText("");
            }
            txtAPPCode.requestFocus();
        }
    }//GEN-LAST:event_txtCreditNoKeyReleased

    private void txtDateDepositKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateDepositKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtDateDeposit.getText().equals("")) {
            txtDateEXP.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            c1ActionPerformed(null);
        }
    }//GEN-LAST:event_txtDateDepositKeyReleased

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        showDialogCalendar(txtDateDeposit, c1, null);
        c2.requestFocus();
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        showDialogCalendar(txtDateExpireDeposit, c2, null);
        txtDateEXP.setText(StringToDate.getString(txtDateExpireDeposit.getText()));
        btnSaveBill.requestFocus();
    }//GEN-LAST:event_c2ActionPerformed

    private void btnSaveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBillActionPerformed
        if (!cbNoneActive.isSelected()) {
            if (TheValue.MENU[1]) {
                if (saveMoneyAdd()) {
                    JOptionPane.showMessageDialog(null, "บันทึกข้อมูลการเติมเงินเรียบร้อยแล้ว");
                    clearMoneyText();
                    resetData();
                }

            } else {
                TheValue.notAuthorization();
            }
        } else {
            JOptionPane.showMessageDialog(null, "ไม่สามารถเติมเงินในบัตรได้ เนื่องจากบัตรยังไม่พร้อมใช้งาน");
        }
    }//GEN-LAST:event_btnSaveBillActionPerformed

    private void cbCreditFileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCreditFileKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCreditNo.getText().equals("")) {
            txtDateDeposit.requestFocus();
        }
    }//GEN-LAST:event_cbCreditFileKeyReleased

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (!txtCusID.getText().trim().equals("")) {
            ShowHistory show = new ShowHistory(null, true, txtCusID.getText());
            show.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "กรุณาระบุรหัสลูกค้าที่ต้องการดูประวัติ", "#0010 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (TheValue.MENU[2]) {
            copyProfile();
        } else {
            TheValue.notAuthorization();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void copyProfile() {
        if (!txtRFIDID.getText().trim().equals("")) {
            CopyProfileDialog dialog = new CopyProfileDialog(null, true);
            if (dialog.loadData(txtRFIDID.getText())) {
                dialog.setVisible(true);
                if (CopyProfileDialog.isUPDATE) {
                    resetData();
                    CopyProfileDialog.isUPDATE = false;
                }
            } else {
                txtRFIDID.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "กรุณาระบุรหัสบัตร RFID ก่อนจะเรียกใช้ฟังก์ชันการโอนบัตร", "#0011 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtRFIDID.requestFocus();
        }
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (!txtCusID.getText().trim().equals("")) {
            if (TheValue.MENU[3]) {
                int iConfirm = JOptionPane.showConfirmDialog(null, "ยืนยันการลบข้อมูล");
                if (iConfirm == JOptionPane.YES_OPTION) {
                    deleteCustomerProfile(txtRFIDID.getText());
                    resetData();
                }
            } else {
                TheValue.notAuthorization();
            }
        } else {
            JOptionPane.showMessageDialog(null, "กรุณาระบุรหัสลูกค้าที่ต้องการดูประวัติ", "#0010 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void txtRFIDIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRFIDIDFocusLost
        breakRFID();
    }//GEN-LAST:event_txtRFIDIDFocusLost

    private void breakRFID() {
        CheckOUTRFID = true;
        control.closePort();
        if (thread != null) {
            thread.stop();
            System.out.println("####Stop Thread....");
        }
    }

    private void loadMemberAlready() {
        txtCusName.setEditable(true);
        btnSave.setEnabled(true);
        btnReset.setEnabled(true);
        txtCusSurname.setEditable(true);
        cbSex.setEnabled(true);
        c3.setEnabled(true);
        txtTel.setEditable(true);

        cbActive.setEnabled(true);
        cbNoneActive.setEnabled(true);
    }

    private void txtMemberIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIDKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtMemberID.getText().trim().equals("")) {
            if (!loadDataMember()) {
                loadMemberAlready();
            }
            txtCusName.requestFocus();
            btnSave.setEnabled(true);
            btnReset.setEnabled(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            btnRFID1ActionPerformed(null);
        }
    }//GEN-LAST:event_txtMemberIDKeyReleased

    private void btnRFID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFID1ActionPerformed
        ShowMember dialog = new ShowMember(null, true);
        dialog.setVisible(true);

        if (!dialog.getMemberCode().equals("")) {
            txtMemberID.setText(dialog.getMemberCode());
            loadDataMember();
            loadMemberAlready();
        }
    }//GEN-LAST:event_btnRFID1ActionPerformed

    private void cbSexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbSexKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAge.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_cbSexKeyReleased

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        showDialogCalendar(txtAge, c3, null);

        txtTel.setEditable(true);
        txtTel.requestFocus();
    }//GEN-LAST:event_c3ActionPerformed

    private void cbNoneActiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNoneActiveItemStateChanged
        if (cbNoneActive.isSelected()) {
        }
    }//GEN-LAST:event_cbNoneActiveItemStateChanged

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetData();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void txtAPPCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPPCodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtAPPCode.getText().trim().equals("")) {
            if (txtAPPCode.getText().equals("")) {
                txtAPPCode.setText("");
            }
            txtCreditPay.requestFocus();
        }
    }//GEN-LAST:event_txtAPPCodeKeyReleased

    private void cbCreditFileItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCreditFileItemStateChanged
        txtCreditNo.setEditable(cbCreditFile.getSelectedIndex() != 0);
        txtAPPCode.setEditable(cbCreditFile.getSelectedIndex() != 0);
        txtCreditPay.setEditable(cbCreditFile.getSelectedIndex() != 0);
        txtDateExpireDeposit.setEditable(cbCreditFile.getSelectedIndex() != 0);

        txtCreditNo.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtAPPCode.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtCreditPay.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtDateExpireDeposit.setEnabled(cbCreditFile.getSelectedIndex() != 0);

        if (cbCreditFile.getSelectedIndex() == 0) {
            txtCreditNo.setText("");
            txtAPPCode.setText("");
        } else {
            txtCreditNo.requestFocus();
        }
    }//GEN-LAST:event_cbCreditFileItemStateChanged

    private void txtCashPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashPayKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCashPay.getText().trim().equals("")) {
                cbCreditFile.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCashPayKeyReleased

    private void txtFreeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFreeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtFree.getText().trim().equals("")) {
                txtFree.setText("");
            }
            computeMoneyCash();
            txtDiscount.requestFocus();
        }
    }//GEN-LAST:event_txtFreeKeyReleased

    private void txtCreditPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditPayKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtCreditPay.getText().trim().equals("")) {
            btnSaveBill.requestFocus();
        }
    }//GEN-LAST:event_txtCreditPayKeyReleased

    private void txtDateEXPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateEXPKeyReleased
        SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Calendar c = Calendar.getInstance(Locale.ENGLISH);
        int countDate = 0;
        try {
            countDate = Integer.parseInt(txtDateEXP.getText());
        } catch (Exception e) {
        }
        c.add(Calendar.DATE, countDate);
        txtDateExpireDeposit.setText(ss.format(c.getTime()));
    }//GEN-LAST:event_txtDateEXPKeyReleased

    private void txtDateExpireDepositKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateExpireDepositKeyReleased
        txtDateEXP.setText(StringToDate.getString(txtDateExpireDeposit.getText()));
    }//GEN-LAST:event_txtDateExpireDepositKeyReleased

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        showFreeMoney();
    }//GEN-LAST:event_btn4ActionPerformed

    private void txtMoneyRefillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoneyRefillKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            computeMoneyCash();
            txtFree.requestFocus();
        }
    }//GEN-LAST:event_txtMoneyRefillKeyReleased

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            computeMoneyCash();
            cbTypePromotion.requestFocus();
        }
    }//GEN-LAST:event_txtDiscountKeyReleased

    private void cbTypePromotionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbTypePromotionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCashPay.requestFocus();
        }
    }//GEN-LAST:event_cbTypePromotionKeyReleased

    private void btnResetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetBillActionPerformed
        clearMoneyData();
        txtMoneyRefill.requestFocus();
    }//GEN-LAST:event_btnResetBillActionPerformed

    private void txtCashPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashPayFocusGained
        computeMoneyCash();
    }//GEN-LAST:event_txtCashPayFocusGained

    private void txtRFIDIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRFIDIDFocusGained
        loadFocus();
    }//GEN-LAST:event_txtRFIDIDFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billNO;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnRFID;
    private javax.swing.JButton btnRFID1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetBill;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveBill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JRadioButton cbActive;
    private javax.swing.JComboBox cbCreditFile;
    private javax.swing.JComboBox cbMemberType;
    private javax.swing.JRadioButton cbNoneActive;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JComboBox cbTypePromotion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbFreeReturn;
    private javax.swing.JTextField txtAPPCode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCashPay;
    private javax.swing.JTextField txtCreditNo;
    private javax.swing.JTextField txtCreditPay;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusSurname;
    private javax.swing.JTextField txtDateDeposit;
    private javax.swing.JTextField txtDateEXP;
    private javax.swing.JTextField txtDateExpireDeposit;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtExpireDate;
    private javax.swing.JTextField txtFree;
    private javax.swing.JTextField txtLastFill;
    private javax.swing.JTextField txtMemberID;
    private javax.swing.JTextField txtMoneyRefill;
    private javax.swing.JTextField txtRFIDID;
    private javax.swing.JFormattedTextField txtRFIDMoney;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSumPayment;
    private javax.swing.JTextField txtSumTon;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void resetData() {
        CheckOUTRFID = false;
        txtRFIDID.setText("");
        txtCusID.setText("");
        txtMemberID.setText("");
        txtCusName.setText("");
        txtCusSurname.setText("");
        txtAge.setText("");
        txtTel.setText("");

        //data money
        txtCashPay.setText("");
        txtFree.setText("");
        txtCreditPay.setText("");
        txtCreditNo.setText("");
        cbCreditFile.setSelectedIndex(0);
        //txtDateExpireDeposit.setText("");
        txtDateEXP.setText("");
        txtAPPCode.setText("");
        txtAPPCode.setEditable(false);
        txtCreditNo.setText("");
        txtCreditNo.setEditable(false);
        cbMemberType.setSelectedIndex(0);

        //history
        txtRFIDMoney.setText("");
        txtLastFill.setText("");
        txtExpireDate.setText("");
        txtStatus.setText("");

        txtSumPayment.setText("");
        txtSumTon.setText("");

        cbActive.setSelected(true);
        TheValue.RFID_ID = "";
        lock.lockScreen(jPanel1, true);

        loadFocus();
        lock.lockScreen(jPanel3, false);

        clearMoneyData();

        txtRFIDID.requestFocus();
    }

    private boolean validInput() {
        if (txtRFIDID.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุข้อมูลรหัสบัตร RFID ด้วย !", "#0001 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtRFIDID.requestFocus();
            return false;
        } else if (txtCusID.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุข้อมูลรหัสลูกค้า ด้วย !", "#0002 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
            return false;
        } else if (txtMemberID.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุข้อมูลรหัสสมาชิก ด้วย !", "#0003 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtMemberID.requestFocus();
            return false;
        } else if (txtRFIDID.getText().trim().length() > 15) {
            JOptionPane.showMessageDialog(null, "รหัสRFID ต้องไม่เกิน 15 หลัก", "#0005 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtRFIDID.requestFocus();
            return false;
        } else if (txtCusID.getText().trim().length() > 7) {
            JOptionPane.showMessageDialog(null, "รหัสลูกค้าต้องไม่เกิน 7 หลัก", "#0006 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
            return false;
        } else if (txtMemberID.getText().trim().length() > 13) {
            JOptionPane.showMessageDialog(null, "รหัสลูกค้าต้องไม่เกิน 13 หลัก", "#0007 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtMemberID.requestFocus();
            return false;
        } else if (checkCusID()) {
            JOptionPane.showMessageDialog(null, "รหัสลูกค้านี้ถูกลงทะเบียนเข้าในระบบแล้ว", "#0008 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
            return false;
        } else if (checkMemID()) {
            JOptionPane.showMessageDialog(null, "รหัสสมาชิกนี้ถูกผูกกับข้อมูลบัตร RFID ที่มีในระบบแล้ว", "#0009 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            txtCusID.requestFocus();
            return false;
        } else if (cbMemberType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกประเภทสมาชิกด้วย !", "#0010 [REGISTER]", JOptionPane.WARNING_MESSAGE);
            cbMemberType.requestFocus();
            return false;
        }


        return true;
    }

    private boolean saveProfile() {
        boolean isSave = false;

        //validate data input
        if (validInput()) {
            RFIDBean bean = new RFIDBean();
            bean.setCASHIER(TheValue.CASHIER);
            bean.setRFID_CREATION_DATE("current_timestamp()");
            bean.setRFID_ID(txtRFIDID.getText());
            bean.setCUST_ID(txtCusID.getText().trim());
            bean.setMEMBER_CODE(txtMemberID.getText().trim());
            bean.setMEMBER_NAME(ThaiUtil.Unicode2ASCII(txtCusName.getText().trim()));
            bean.setMEMBER_SURNAME(ThaiUtil.Unicode2ASCII(txtCusSurname.getText().trim()));
            bean.setMEMBER_MOBILE(txtTel.getText().trim());
            bean.setMEMBER_BRITHDAY(txtAge.getText());
            bean.setMEMBER_TYPE(ThaiUtil.Unicode2ASCII(cbMemberType.getSelectedItem().toString()));
            String[] mem = bean.getMEMBER_TYPE().split("-");
            bean.setMEMBER_TYPE(mem[0]);
            if (cbSex.getSelectedIndex() == 0) {
                bean.setMEMBER_GENDER("M");
            } else if (cbSex.getSelectedIndex() == 1) {
                bean.setMEMBER_GENDER("F");
            } else {
                bean.setMEMBER_GENDER("O");
            }

            if (cbActive.isSelected()) {
                bean.setRFID_STATUS("Y");
            } else {
                bean.setRFID_STATUS("N");
            }
            bean.setCREDIT_TYPE(cbCreditFile.getSelectedItem().toString());
            bean.setIMG_PATH("");
            if (!conn.dataExist(txtRFIDID.getText().trim(), txtCusID.getText().trim())) {
                bean.setRFID_LAST_ACTIVITY(ThaiUtil.Unicode2ASCII(TheValue.MSG_REGISTER));
                if (TheValue.MENU[5]) {
                    if (validInput()) {
                        if (conn.saveProfile(bean)) {
                            //any code
                            JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อยแล้ว", "Success", JOptionPane.PLAIN_MESSAGE);
                            loadData();
                            isSave = true;
                        }
                    }
                }
            } else {
                bean.setRFID_LAST_ACTIVITY(TheValue.MSG_EDIT_PROFILE);
                if (TheValue.MENU[5]) {
                    if (validInput()) {
                        if (conn.updateProfile(bean)) {
                            JOptionPane.showMessageDialog(null, "อัพเดตข้อมูลเรียบร้อยแล้ว", "Success", JOptionPane.PLAIN_MESSAGE);
                            loadData();
                            isSave = true;
                        }
                    }
                } else {
                    TheValue.notAuthorization();
                }
            }

            //unlock save money
            lock.lockScreen(jPanel3, true);
        }

        return isSave;
    }

    public static void main(String[] args) {
        JFrame d = new JFrame();
        PanelRegister p = new PanelRegister();
        d.setTitle("ระบบข้อมูลลูกค้า");
        d.add(p);
        d.pack();
        d.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        d.setVisible(true);

        p.loadFocus();
    }

    public boolean loadData() {
        boolean isFound = false;
        try {
            RFIDBean bean = conn.getDataRFID(txtRFIDID.getText());
            if (bean != null) {
                isFound = true;
                txtRFIDID.setEditable(false);
                btnRFID.setEnabled(false);
                lock.lockScreen(jPanel3, true);

                txtRFIDID.setText(bean.getRFID_ID());
                txtCusID.setText(bean.getCUST_ID());
                txtMemberID.setText(bean.getMEMBER_CODE());

                cbCreditFile.setSelectedIndex(0);

                loadDataMember();
                if (bean.getRFID_STATUS().equals("Y")) {
                    txtStatus.setText("ใช้งาน");
                } else if (bean.getRFID_STATUS().equals("N")) {
                    txtStatus.setText("ยังไม่พร้อมใช้งาน");
                } else if (bean.getRFID_STATUS().equals("C")) {
                    txtStatus.setText("ยกเลิกการใช้งานแล้ว");
                }
                loadMoney();

                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);

                btnResetBill.setEnabled(true);
                btnSaveBill.setEnabled(true);
                cbCreditFile.setEnabled(true);

                txtCashPay.setEditable(true);

                for (int i = 0; i < cbMemberType.getItemCount(); i++) {
                    String item = cbMemberType.getItemAt(i).toString();
                    String[] data = item.split("-");
                    String mtype = bean.getMEMBER_TYPE();
                    if (mtype.indexOf(data[0]) != -1) {
                        cbMemberType.setSelectedIndex(i);
                        System.out.println("selected " + i);
                        break;
                    }
                }


                txtCusName.requestFocus();
            } else {
                txtCusID.requestFocus();
            }
            CheckOUTRFID = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        

        return isFound;
    }

    void loadFocus() {
        if (thread != null) {
            thread.stop();
            System.out.println("####Stop Thread....");
        }
        TheValue.RFID_ID = "";
        
        txtRFIDID.setEditable(true);
        txtRFIDID.requestFocus();
        btnRFID.setEnabled(true);
        btnReset.setEnabled(true);
        if (!TheValue.COMPORT_RFID.equalsIgnoreCase("NOTSET")) {
            if (control.openComport(TheValue.COMPORT_RFID)) {
                System.out.println("####Start RFID Reader:");
                thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int countStop = 0;
                        while (!CheckOUTRFID) {
                            countStop++;
                            String RFID_ID = TheValue.RFID_ID;
                            if (!RFID_ID.equals("")) {
                                txtRFIDID.setText(RFID_ID);
                                System.out.println("Break;");
                                loadData();
                                control.closePort();
                                txtRFIDID.setEditable(false);
                                btnRFID.setEnabled(false);
                                txtCusID.setEditable(true);
                                txtCusID.requestFocus();
                                break;
                            }
                            try {
                                if (countStop == 10) {
                                    LockPanelCom lock = new LockPanelCom();
                                    lock.lockScreen(jPanel1, false);
                                    txtDateExpireDeposit.setEditable(false);
                                    c2.setEnabled(false);
                                    btnReset.setEnabled(true);
                                    btnReset.requestFocus();
                                    breakRFID();
                                } else {
                                    Thread.sleep(1000);
                                    System.out.println("Thread RFID Running...");
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                });
                
                thread.start();
            } else {
                System.out.println("Disconnect RFID Tag.");
            }
        } else {
            System.out.println("Disable RFID Tag Reader!!!");
        }
    }

    private boolean checkCusID() {
        ConnectDB odbc = new ConnectDB();
        return odbc.querySQL("select rfid_id from rfid_stock "
                + "where cust_id='" + txtCusID.getText() + "' "
                + "and rfid_id <> '" + txtRFIDID.getText() + "'");
    }

    private boolean checkMemID() {
        ConnectDB odbc = new ConnectDB();
        return odbc.querySQL("select Member_Code from rfid_stock "
                + "where Member_Code='" + txtMemberID.getText() + "' "
                + "and rfid_id <> '" + txtRFIDID.getText() + "'");
    }

    private void showDialogCalendar(JTextField txt, JButton btn, JFrame frame) {
        Point point = btn.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooserDialog dcd = new DateChooserDialog(frame, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectedDate() != null) {
            txt.setText(simp.format(new Date(dcd.getSelectedDate().getTimeInMillis())));
            txt.requestFocus();
        }
    }

    private void loadCreditFile() {
        try {
            ConnectDB db = new ConnectDB();
            Statement stmt = db.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select CrCode, CrName from creditfile");
            if (cbCreditFile.getItemCount() > 0) {
                cbCreditFile.removeAllItems();
            }
            cbCreditFile.addItem("เลือกประเภทบัตรเครดิต");
            while (rs.next()) {
                cbCreditFile.addItem(rs.getString(1) + "-" + rs.getString(2));
            }
            rs.close();
            stmt.close();
            db.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        txtDateDeposit.setText(simp.format(new Date()));
    }

    private void loadMemberType() {
        try {
            ConnectDB db = new ConnectDB();
            Statement stmt = db.connectOpenMember().createStatement();
            ResultSet rs = stmt.executeQuery("select * from membertype");
            if (cbMemberType.getItemCount() > 0) {
                cbMemberType.removeAllItems();
            }
            cbMemberType.addItem("เลือกประเภทสมาชิก");
            while (rs.next()) {
                cbMemberType.addItem(rs.getString("Member_TypeCode") + "-" + ThaiUtil.ASCII2Unicode(rs.getString("Member_TypeName")));
            }
            rs.close();
            stmt.close();
            db.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        txtDateDeposit.setText(simp.format(new Date()));
    }

    private boolean validMoney() {
        if (txtCashPay.getText().trim().equals("") && txtCreditPay.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุจำนวนเงินสด/บัตรเครดิตให้ถูกต้อง!", "#0010 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtCashPay.requestFocus();
            return false;
        } else if (txtMoneyRefill.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุจำนวนเงินที่ต้องการเติม!", "#0011 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtMoneyRefill.requestFocus();
            return false;
        } else if (txtCreditPay.getText().trim().equals("") && cbCreditFile.getSelectedIndex() > 0) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุจำนวนเงินในบัตรเครดิต!", "#0012 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtMoneyRefill.requestFocus();
            return false;
        } else if (txtDateDeposit.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุวันที่ที่เติมเงิน!", "#0013 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtDateDeposit.requestFocus();
            return false;
        } else if (txtDateExpireDeposit.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุวันหมดอายุบัตร!", "#0014 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtDateExpireDeposit.requestFocus();
            return false;
        } else if (txtDateEXP.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "จำนวนวันหมดอายุไม่ถูกต้อง!", "#0015 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtDateEXP.requestFocus();
            return false;
        } else if(cbCreditFile.getSelectedIndex() > 0&&txtAPPCode.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "กรุณาระบุเลขที่อนุบัตรสำหรับบัตรเครดิต!", "#0016 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtAPPCode.requestFocus();
            return false;
        } else if(cbCreditFile.getSelectedIndex() > 0&&txtCreditNo.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "กรุณาระบุเลขที่บัตรเครดิต!", "#0017 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtCreditNo.requestFocus();
            return false;
        }
        
        try {
            Double.parseDouble(txtMoneyRefill.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุจำนวนเงินที่ต้องการเติม!", "#0018 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtMoneyRefill.requestFocus();
            
            return false;
        }
        
        double cashPay = 0.0;
        try {
            cashPay = Double.parseDouble(txtCashPay.getText());
        } catch (Exception e) {
            cashPay = 0.0;
        }
        double creditPay = 0.0;
        if (cbCreditFile.getSelectedIndex() > 0) {
            try {
                creditPay = Double.parseDouble(txtCreditPay.getText());
            } catch (Exception e) {
                creditPay = 0.0;
            }
        }
        
        if(cashPay==0&&creditPay==0){
            JOptionPane.showMessageDialog(null, "กรุณาระบุจำนวนเงินสด/บัตรเครดิตให้ถูกต้อง!", "#0019 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        try {
            int countExp = Integer.parseInt(txtDateEXP.getText());
            if (countExp < 0) {
                JOptionPane.showMessageDialog(null, "จำนวนวันหมดอายุไม่ถูกต้อง!", "#0020 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
                txtDateEXP.requestFocus();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "วันหมดอายุต้องเป็นเลขจำนวนเต็มเท่านั้น!", "#0021 [REFILL]", JOptionPane.INFORMATION_MESSAGE);
            txtDateEXP.requestFocus();
            return false;
        }

        return true;
    }

    private void computeMoneyCash() {
        double reserveMoney = 0;
        try {
            reserveMoney = Double.parseDouble(txtFree.getText());
        } catch (Exception e) {
        }
        double allMoney = 0;
        try {
            allMoney = Double.parseDouble(txtMoneyRefill.getText());
        } catch (Exception e) {
        }
        double disMoney = 0;
        double totalDiscount = 0;
        //Compute percent
        try {
            disMoney = Double.parseDouble(txtDiscount.getText());
        } catch (Exception e) {
        }
        if (cbTypePromotion.getSelectedIndex() == 0) {
            totalDiscount = allMoney - (allMoney * (disMoney / 100));
        } else {
            totalDiscount = allMoney - disMoney;
        }

        allMoney = totalDiscount + reserveMoney;
        txtSumPayment.setText("" + allMoney);
    }
    private double total;

    private boolean saveMoneyAdd() {
        boolean isSave = false;
        if(!validMoney()){
            return false;
        }

        //compute
        computeMoneyCash();

        //Summary Money Pay
        RFIDBean bean = new RFIDBean();
        Statement stmt;
        String[] spData = new String[]{};

        //update bean

        bean.setRFID_ID(txtRFIDID.getText());
        bean.setCUST_ID(txtCusID.getText());
        bean.setMEMBER_CODE(txtMemberID.getText());
        bean.setFILL_MONEY_DATE(txtDateDeposit.getText());
        bean.setRFID_EXPIRE_DATE(txtDateExpireDeposit.getText());
        try {
            bean.setFREE_MONEY(Double.parseDouble(txtFree.getText().trim()));
        } catch (Exception e) {
            bean.setFREE_MONEY(0.0);
        }
        try {
            bean.setRFID_MONEY(Double.parseDouble(txtMoneyRefill.getText().trim()));
        } catch (Exception e) {
            bean.setRFID_MONEY(0.0);
        }
        try {
            bean.setCREDIT_MONEY(Double.parseDouble(txtCreditPay.getText().trim()));
        } catch (Exception e) {
            bean.setCREDIT_MONEY(0.0);
        }
        bean.setRFID_LAST_ACTIVITY(TheValue.MSG_REFILL);
        try {
            bean.setBILL_CASH(Double.parseDouble(txtCashPay.getText()));
        } catch (Exception e) {
            bean.setBILL_CASH(0.00);
        }
        if(cbTypePromotion.getSelectedIndex()==0){//Percent (%)
            double discount;
            try {                
               discount = Double.parseDouble(txtDiscount.getText().trim());
            } catch (Exception e) {
               discount = 0.0;
            }
            //compute discrount bath
            double refill = bean.getRFID_MONEY();
            double totalDiscount = (refill*discount)/100;
            bean.setBILL_DISCOUNT(totalDiscount);
            
        }else if(cbTypePromotion.getSelectedIndex()==1){//Baht
            try {
                bean.setBILL_DISCOUNT(Double.parseDouble(txtDiscount.getText().trim()));
            } catch (Exception e) {
                bean.setBILL_DISCOUNT(0.00);
            }
        }
        
        if (cbCreditFile.getSelectedIndex() > 0) {
            bean.setCREDIT_TYPE(cbCreditFile.getSelectedItem().toString());
            bean.setBILL_APPCODE(txtAPPCode.getText().trim());
            bean.setCREDIT_NO(txtCreditNo.getText());
            spData = cbCreditFile.getSelectedItem().toString().split("-");
        } else {
            bean.setCREDIT_TYPE("");
            bean.setBILL_APPCODE("");
            bean.setCREDIT_NO("");
            spData = new String[]{""};
        }
        
        //validate data
        if (bean.getRFID_MONEY() == 0) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนเงินที่ท่านต้องการเติม");
            txtMoneyRefill.setText("");
            txtMoneyRefill.requestFocus();
            return false;
        }

        if (getTonMoney(bean) == false) {
            return false;
        }
        bean.setBILL_ID(conn.getNextBillNo());
        if (conn.updateMoneyData(bean)) {
            //loadData();
            billnoBean billno = new billnoBean();
            double cashPay = 0.0, freePay = 0.0, creditPay = 0.0, cashRefill = 0.0;
            try {
                stmt = conn.connectOpen().createStatement();
                billno.setB_Refno(conn.getNextBillNo());
                billno.setB_Ontime("curtime()");
                billno.setB_OnDate("curdate()");
                billno.setB_MacNo(conn.getMacNo());
                billno.setB_Cashier(TheValue.CASHIER);
                billno.setB_Cust(0);
                billno.setB_ETD("E");
                double totalSum = 0.0;
                try {
                    totalSum = Double.parseDouble(txtSumPayment.getText());
                } catch (Exception e) {
                }
                double totalTon = 0.0;
                try {
                    totalTon = Double.parseDouble(txtSumTon.getText());
                } catch (Exception e) {
                }
                try {
                    cashPay = Double.parseDouble(txtCashPay.getText());
                } catch (Exception e) {
                }
                try {
                    cashRefill = Double.parseDouble(txtMoneyRefill.getText());
                } catch (Exception e) {
                }
                try {
                    freePay = Double.parseDouble(txtFree.getText());
                } catch (Exception e) {
                }
                try {
                    creditPay = Double.parseDouble(txtCreditPay.getText());
                } catch (Exception e) {
                }
                billno.setB_Cash(cashPay);
                billno.setB_Total(totalSum);
                billno.setB_MemCode(txtMemberID.getText().trim());
                billno.setB_CrCode1(spData[0]);

                if (includeVat()) {
                    //set table billno
                    billno.setB_Product(totalSum);
                    billno.setB_NetTotal(totalSum);
                    billno.setB_NetVat(totalSum);
                    billno.setB_Vat(totalSum * 7 / 107);
                    billno.setB_PayAmt(cashPay + creditPay);
                    billno.setB_AppCode1(txtAPPCode.getText().trim());
                    billno.setB_CrAmt1(creditPay);
                    billno.setB_Ton(totalTon);
                    if(cashPay>=totalSum){
                        billno.setB_Cash(totalSum);
                    }else{
                        billno.setB_Cash(cashPay);
                    }
                    
                } else {
                    //set table billno
                    billno.setB_Product(totalSum);
                    billno.setB_NetTotal(totalSum);
                    billno.setB_NetVat(totalSum);
                    billno.setB_Vat(totalSum * 7 / 100);
                    billno.setB_PayAmt(cashPay + creditPay);
                    billno.setB_AppCode1(txtAPPCode.getText().trim());
                    billno.setB_CrAmt1(creditPay);
                    billno.setB_Ton(totalTon);
                    if(cashPay>=totalSum){
                        billno.setB_Cash(totalSum);
                    }else{
                        billno.setB_Cash(cashPay);
                    }
                }

                BillNoDB.saveBillNo(billno);//save into table billno
                BillNoDB.savePointType(billno);//save into table member[pointtype]

                //set free money again
                billno.setR_Price(cashRefill);
                billno.setR_Total(cashRefill);
                billno.setR_NetTotal(cashRefill);
                BillNoDB.saveMemberPay(billno);//save into table t_sale[member money]

                //set free money again
                if(freePay>0){
                    billno.setR_Price(freePay);
                    billno.setR_Total(freePay);
                    billno.setR_NetTotal(freePay);
                    BillNoDB.saveMoneyFreePay(billno);//save into table t_sale[free money]
                }
                
                //save discount to t_sale
                if(bean.getBILL_DISCOUNT()>0){
                    billno.setR_Price(bean.getBILL_DISCOUNT());
                    billno.setR_Total(bean.getBILL_DISCOUNT());
                    billno.setR_NetTotal(bean.getBILL_DISCOUNT());
                    BillNoDB.saveBillDiscount(billno);//save into table t_sale[free money]
                }
                stmt.close();
                final RFIDBean beanThread = bean;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        printBill(beanThread);
                    }
                }).start();
                conn.close();

                clearMoneyText();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            isSave = true;
            conn.updateBill();
            txtCusName.requestFocus();
        }
        return isSave;
    }

    private void printBill(RFIDBean bean) {
        ConnectDB con = new ConnectDB();
        try {
            Statement stmt = con.connectOpen().createStatement();
            String sql = "select bill_no from rfid_bill where bill_no='" + bean.getBILL_ID() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bean.setBILL_ID(rs.getString("BILL_NO"));
                bean.setBILL_DISCOUNT(rs.getDouble("DISCOUNT"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!TheValue.COMPORT_PRINTER.equals("NOTSET")) {
            PPrint print = new PPrint();
            print.printBill(bean);
            print.closePrint();
        }
    }

    private void loadMoney() {
        RFIDBean bean = conn.getDataRFID(txtRFIDID.getText());
        if (bean != null) {
            txtRFIDID.setText(bean.getRFID_ID());
            txtCusID.setText(bean.getCUST_ID());

            txtRFIDMoney.setText("" + bean.getRFID_MONEY());
            if (bean.getFILL_MONEY_DATE() != null) {
                txtLastFill.setText(DateFormat.yyyy_MM_dd_TO_ddMMyyyy(bean.getFILL_MONEY_DATE().split(" ")[0]));
            }
            if (bean.getRFID_EXPIRE_DATE() != null) {
                txtExpireDate.setText(DateFormat.yyyy_MM_dd_TO_ddMMyyyy(bean.getRFID_EXPIRE_DATE().split(" ")[0]));
                txtDateExpireDeposit.setText(DateFormat.yyyy_MM_dd_TO_ddMMyyyy(bean.getRFID_EXPIRE_DATE().split(" ")[0]));
                txtDateEXP.setText(StringToDate.getString(txtDateExpireDeposit.getText()));
            }

            if (bean.getRFID_STATUS().equals("Y")) {
                cbActive.setSelected(true);
            } else {
                cbNoneActive.setSelected(true);
            }

            if (bean.getRT_FREE_MONEY().equalsIgnoreCase("Y")) {
                lbFreeReturn.setText("คืนค่ามัดจำแล้ว");
            } else {
                lbFreeReturn.setText(bean.getFREE_MONEY() + " บาท");
            }
        }
    }

    private void deleteCustomerProfile(String RFID_ID) {
        if (conn.deleteProfile(RFID_ID)) {
            JOptionPane.showMessageDialog(null, "ลบข้อมูลผู้ใช้งานเรียบร้อยแล้ว");
        }
    }

    public boolean loadDataMember() {
        boolean isFound = false;
        try {
            RFIDBean beanMember = conn.getDataMember(txtMemberID.getText().trim());
            if (beanMember != null) {
                isFound = true;
                txtMemberID.setText(beanMember.getMEMBER_CODE());
                txtCusName.setText(beanMember.getMEMBER_NAME());
                txtCusSurname.setText(beanMember.getMEMBER_SURNAME());
                String sex = beanMember.getMEMBER_GENDER();
                if (sex.equalsIgnoreCase("M")) {
                    cbSex.setSelectedIndex(0);
                } else if (sex.equalsIgnoreCase("F")) {
                    cbSex.setSelectedIndex(1);
                } else {
                    cbSex.setSelectedIndex(2);
                }
                txtTel.setText(beanMember.getMEMBER_MOBILE());
                txtAge.setText(beanMember.getMEMBER_BRITHDAY());
            } else {
                txtCusName.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return isFound;
    }

    private boolean checkHistoryCancel(String rfid_id) {
        try {
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "select RFID_ID, RFID_STATUS from rfid_stock_history where rfid_id='" + rfid_id + "' and rfid_status='C'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    private void clearMoneyText() {
        txtCashPay.setText("");
        txtFree.setText("");
        txtCreditPay.setText("");
        txtCreditNo.setText("");
        cbCreditFile.setSelectedIndex(0);
    }

    private boolean includeVat() {
        String vatType = "";
        try {
            ConnectDB con = new ConnectDB();
            Statement stmt = con.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select P_VatType from posconfigsetup");
            if (rs.next()) {
                vatType = rs.getString(1);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return vatType.equals("I");
    }

    private void clearMoneyData() {
        txtMoneyRefill.setText("");
        txtFree.setText("");
        txtDiscount.setText("");
        txtCashPay.setText("");
        cbCreditFile.setSelectedIndex(0);
        txtCreditNo.setText("");
        txtAPPCode.setText("");
        txtCreditPay.setText("");
        txtDateDeposit.setText("");
        txtDateExpireDeposit.setText("");
        txtDateEXP.setText("");
        lbFreeReturn.setText("      ");

        txtDateDeposit.setText(simp.format(new Date()));
        txtCreditNo.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtAPPCode.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtCreditPay.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        txtDateExpireDeposit.setEnabled(cbCreditFile.getSelectedIndex() != 0);
        
        billNO.setText(conn.getNextBillNo());
    }

    private void showFreeMoney() {
        String RFID_ID = txtRFIDID.getText();
        ConnectDB con = new ConnectDB();
        double free_money;
        try {
            Statement stmt = con.connectOpen().createStatement();
            Statement stmt2 = con.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select free_money from rfid_stock where rfid_id='" + RFID_ID + "'");
            if (rs.next()) {
                free_money = rs.getDouble("free_money");
                int c = JOptionPane.showConfirmDialog(null, "จำนวนเงินมัดจำคือ " + free_money + " บาท \nต้องการชำระเงินมัดจำใช่หรือไม่ ?");
                if (c == JOptionPane.YES_OPTION) {
                    RFIDBean beanAction = new RFIDBean();
                    beanAction.setRFID_ID(RFID_ID);
                    beanAction.setRFID_LAST_ACTIVITY(ThaiUtil.Unicode2ASCII(TheValue.MSG_RT_FREE_MONEY));
                    //update Y table rfid_stock
                    int iUpdate = stmt2.executeUpdate("update rfid_stock set "
                            + "free_money='0.00', "
                            + "rt_free_money='Y',"
                            + "RFID_LAST_ACTIVITY='" + ThaiUtil.Unicode2ASCII(TheValue.MSG_RT_FREE_MONEY) + "' "
                            + "where rfid_id='" + RFID_ID + "'");
                    if (iUpdate > 0) {
                        con.saveProfileHistory(beanAction);
                    }
                }
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean getTonMoney(RFIDBean bean) {
        double totalSum = 0.0;
        try {
            totalSum = Double.parseDouble(txtSumPayment.getText());
        } catch (Exception e) {
        }
        double cashAll = 0.0;
        try {
            cashAll = bean.getBILL_CASH();
        } catch (Exception e) {
        }

        double creditAll = 0.0;
        try {
            creditAll = Double.parseDouble("" + bean.getCREDIT_MONEY());
        } catch (Exception e) {
        }
        total = totalSum - (cashAll + creditAll);
        if (total < 0) {
            total *= -1;
        } else if (total > 0) {
            JOptionPane.showMessageDialog(this, "ลูกค้าต้องระบุจำนวนเงินเพิ่มอีก " + total + " บาท");
            txtCashPay.requestFocus();

            return false;
        }

        txtSumTon.setText("" + total);

        return true;
    }
}
