package sun.natee.ton.view.form;

import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.model.bean.billnoBean;
import sun.natee.ton.model.database.BillNoDB;
import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.view.dialog.DateFormat;
import sun.natee.ton.control.api.ThaiUtil;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CopyProfileDialog extends javax.swing.JDialog {
    private SimpleDateFormat simp=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static boolean isUPDATE = false;
    
    public CopyProfileDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        jLabel1.setText("วันที่ทำรายการ: "+simp.format(new Date()));
    }
    
    public boolean loadData(String RFID_ID){
        txtDate.setText(simp.format(new Date()));
        
        ConnectDB conn =new ConnectDB();
        RFIDBean bean = conn.getDataRFID(RFID_ID);
        if(bean!=null){
            txtOld.setText(bean.getRFID_ID());
            txtMoney.setText(""+bean.getRFID_MONEY());
            if(bean.getFILL_MONEY_DATE()!=null){
                txtLastFill.setText(DateFormat.yyyy_MM_dd_TO_ddMMyyyy(bean.getFILL_MONEY_DATE().split(" ")[0]));
            }
            if(bean.getRFID_EXPIRE_DATE()!=null){
                txtExpireDate.setText(DateFormat.yyyy_MM_dd_TO_ddMMyyyy(bean.getRFID_EXPIRE_DATE().split(" ")[0]));
            }
            txtNew.requestFocus();
            conn.close();
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลรหัสบัตร RFID นี้กรุณาระบุรหัสบัตร RFID ใหม่อีกครั้ง", "#0012 [REGISTER]", JOptionPane.ERROR_MESSAGE);           
            conn.close();
            return false;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtNew = new javax.swing.JTextField();
        txtOld = new javax.swing.JTextField();
        txtFree = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtLastFill = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtExpireDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("โอนข้อมูลบัตร RFID");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลบัตร", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel28.setText("RFID ID ใหม่");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("วันที่โอนข้อมูล");

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("RFID ID เดิม");

        txtNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewFocusLost(evt);
            }
        });
        txtNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewKeyReleased(evt);
            }
        });

        txtOld.setEditable(false);
        txtOld.setBackground(new java.awt.Color(255, 255, 255));
        txtOld.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFreeKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("ค่าธรรมเนียม");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("บาท");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("ยอดเงินคงเหลือ");

        txtMoney.setEditable(false);
        txtMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("บาท");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel29.setText("วันที่เติมเงินล่าสุด");

        txtLastFill.setEditable(false);
        txtLastFill.setBackground(new java.awt.Color(255, 255, 255));
        txtLastFill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("วันหมดอายุบัตร");

        txtExpireDate.setEditable(false);
        txtExpireDate.setBackground(new java.awt.Color(255, 255, 255));
        txtExpireDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastFill, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30))
                    .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastFill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ยืนยันโอนข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ปิดหน้าต่าง");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("วันที่ทำรายการ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateProifile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&!txtNew.getText().trim().equals("")){
            txtFree.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_txtNewKeyReleased

    private void txtFreeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFreeKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&!txtFree.getText().trim().equals("")){
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_txtFreeKeyReleased

    private void txtNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewFocusGained
        loadFocus();
    }//GEN-LAST:event_txtNewFocusGained

    private void txtNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewFocusLost
        if(tread!=null){
            tread.stop();
            System.out.println("#### Stop Thread RFID");
            control.closePort();
            System.out.println("#### Stop RFID Port");
        }
    }//GEN-LAST:event_txtNewFocusLost

    private void updateProifile() {
        ConnectDB conn = new ConnectDB();
        //check reuse rfid card
        String sqlChk = "select * from rfid_stock_history "
                + "where rfid_id='"+txtNew.getText().trim()+"' "
                + "and rfid_status='N'";
        boolean reuseResult = conn.querySQL(sqlChk);
        if(reuseResult){
            JOptionPane.showMessageDialog(null, "บัตรเลขที่ "+txtNew.getText()+" ได้ยกเลิกการใช้งานไปแล้ว");
        }else{
            try {
                if(txtNew.getText().trim().equals(txtOld.getText().trim())){
                    JOptionPane.showMessageDialog(null, "เป็นรหัส RFID เดิม ไม่สามารถทำรายการได้\nกรุณาเปลี่ยนเป็นบัตร RFID ใหม่ด้วยครับ");
                }else{
                    //update old RFID_STATUS  to 'N'
                    RFIDBean oldProfile = conn.getDataRFID(txtOld.getText());
                    String sql="UPDATE RFID_STOCK SET "
                            + "RFID_STATUS='C', "
                            + "RFID_LAST_ACTIVITY='"+ ThaiUtil.Unicode2ASCII(TheValue.MSG_CANCEL)+"', "
                            + "RFID_LAST_TIME=current_timestamp() "
                            + "WHERE RFID_ID='"+oldProfile.getRFID_ID()+"' "
                            + "and CUST_ID='"+oldProfile.getCUST_ID()+"' "
                            + "and MEMBER_CODE='"+oldProfile.getMEMBER_CODE()+"'";          

                    if(conn.executeSQL(sql)){

                        //save history before
                        conn.saveProfileHistory(oldProfile);

                        //delete old data
                        String sqlUpdate = "update rfid_stock set "
                                + "rfid_id='"+txtNew.getText()+"', "
                                + "rfid_last_activity='"+ThaiUtil.Unicode2ASCII(TheValue.MSG_CHANGE_RFID)+"', "
                                + "rfid_status='Y' "
                                + "where rfid_id='"+oldProfile.getRFID_ID()+"'";
                        if(conn.executeSQL(sqlUpdate)){
                            //update history
                            RFIDBean bbb = new RFIDBean();
                            bbb.setRFID_ID(txtNew.getText().trim());
                            if(conn.saveProfileHistory(bbb)){
                                isUPDATE=true;
                                
                                //########### INSERT BILLNO, T_SALE
                                billnoBean billno = new billnoBean();
                                ConnectDB con = new ConnectDB();
                                Statement stmt;

                                double cash=0.0;
                                double free=0.0;
                                double credit=0.0;
                                try {
                                    stmt = con.connectOpen().createStatement();
                                    billno.setB_Refno(con.getNextBillNo());
                                    billno.setB_Ontime("curtime()");
                                    billno.setB_OnDate("curdate()");
                                    billno.setB_MacNo(con.getMacNo());
                                    billno.setB_Cashier(TheValue.CASHIER);
                                    billno.setB_Cust(0);
                                    billno.setB_ETD("E");

                                    try {
                                        cash = Double.parseDouble(txtMoney.getText());
                                    } catch (Exception e) {
                                    }
                                    try {
                                        free = Double.parseDouble(txtFree.getText());
                                    } catch (Exception e) {
                                    }
                                    billno.setB_Cash(cash);
                                    billno.setB_Total(cash+free+credit);
                                    billno.setB_MemCode("");                
                                    billno.setB_CrCode1("");
                                    
                                    if(includeVat()){
                                        //set table billno
                                        billno.setB_Product(cash + credit + free);
                                        billno.setB_NetTotal(cash + credit + free);
                                        billno.setB_NetVat(cash + credit + free);
                                        billno.setB_Vat(0);
                                        billno.setB_PayAmt(cash);
                                        billno.setB_AppCode1("");
                                        billno.setB_CrAmt1(0.00);                    
                                    }else{
                                        //set table billno
                                        billno.setB_Product(cash + credit + free);
                                        billno.setB_NetTotal(cash + credit + free);
                                        billno.setB_NetVat(cash + credit + free);
                                        billno.setB_Vat(0);
                                        billno.setB_PayAmt(cash);
                                        billno.setB_AppCode1("");
                                        billno.setB_CrAmt1(0.00); 
                                    }
                                    
                                    BillNoDB.saveBillNo(billno);//save into table billno
                                    BillNoDB.saveMoneyFreePay(billno);//save into table t_sale[free money]
                                    
                                    stmt.close();
                                    con.close();
                                    
                                    JOptionPane.showMessageDialog(null, "ท่านได้เปลี่ยนบัตรใหม่เรียบร้อยแล้ว");
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                }
                            }
                        }
                    }
                }
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                isUPDATE=false;
            }
        }
    }
    
    private ControlRFID control=new ControlRFID();
    private boolean CheckOUTRFID =false;
    private Thread tread;
    
    void loadFocus() {
        if(tread!=null){
            tread.stop();
            System.out.println("#### Stop Thread RFID");
        }
        
        if(!TheValue.COMPORT_RFID.equals("NOTSET")){
            if(control.openComport(TheValue.COMPORT_RFID)){
                System.out.println("Start RFID Reader:");

                tread = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        while(!CheckOUTRFID){
                            String RFID_ID=TheValue.RFID_ID;
                            if(!txtOld.getText().trim().equals(RFID_ID)){
                                if(!RFID_ID.equals("")){
                                    txtNew.setText(RFID_ID);
                                    System.out.println("#### Close RFID Port");
                                    control.closePort();
                                    txtFree.requestFocus();
                                    break;
                                }
                                try {
                                    Thread.sleep(1000);
                                    System.out.println("Thread RFID Running...");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                    }
                });

                tread.start();
            }else{
                System.out.println("Disconnect RFID Tag.");
            }
        }else{
            System.out.println("NOT SET PORT RFID !");
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CopyProfileDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopyProfileDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopyProfileDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopyProfileDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CopyProfileDialog dialog = new CopyProfileDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtExpireDate;
    private javax.swing.JTextField txtFree;
    private javax.swing.JTextField txtLastFill;
    private javax.swing.JTextField txtMoney;
    private javax.swing.JTextField txtNew;
    private javax.swing.JTextField txtOld;
    // End of variables declaration//GEN-END:variables

    private boolean includeVat() {
        String vatType = "";
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select P_VatType from posconfigsetup");
            if(rs.next()){
                vatType = rs.getString(1);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return vatType.equals("I");
    }
}
