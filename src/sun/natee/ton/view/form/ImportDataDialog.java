package sun.natee.ton.view.form;

import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.control.api.StringToDate;
import sun.natee.ton.control.api.ThaiUtil;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ImportDataDialog extends javax.swing.JDialog {

    public ImportDataDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtFilePath = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lbCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID_ID", "CUST_ID", "CUST_NAME", "CUST_SURNAME", "RFID_MONEY", "RFID_EXPIRE_DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbData);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("เลือกไฟล์");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("บันทึกข้อมูล");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbCount.setText("0 row");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCount)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1040, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private DefaultTableModel model;
    private void clearTable(DefaultTableModel md) {
        if (md != null) {
            int rowCnt = md.getRowCount();
            if (rowCnt > 0) {
                for (int i = 0; i < rowCnt; i++) {
                    md.removeRow(0);
                }
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model = (DefaultTableModel) tbData.getModel();
        
        txtFilePath.setText("");
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(this);
        File file = choose.getSelectedFile();
        if(file!=null){
            clearTable(model);
            txtFilePath.setText(file.getAbsolutePath());
            
            try {
                FileInputStream fs = new FileInputStream(file);  
                DataInputStream ds = new DataInputStream(fs);
                BufferedReader br = new BufferedReader(new InputStreamReader(ds));
                String data;
                String []datas;
                while ((data = br.readLine()) != null)   {
                    datas = data.split("\t", data.length());
                    model.addRow(datas);
                }  
                lbCount.setText(""+model.getRowCount()+" row");
                br.close();
                ds.close();
                fs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(saveProfile()){
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
            clearTable(model);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validInput(RFIDBean bean) {
        if (bean.getRFID_ID().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุข้อมูลรหัสบัตร RFID ด้วย !", "#0001 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (bean.getCUST_ID().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาระบุข้อมูลรหัสลูกค้า ด้วย !", "#0002 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (bean.getRFID_ID().length() > 15) {
            JOptionPane.showMessageDialog(null, "รหัสRFID ต้องไม่เกิน 15 หลัก", "#0005 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (bean.getCUST_ID().length() > 7) {
            JOptionPane.showMessageDialog(null, "รหัสลูกค้าต้องไม่เกิน 7 หลัก", "#0006 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (checkCusID(bean)) {
            JOptionPane.showMessageDialog(null, "รหัสลูกค้านี้ถูกลงทะเบียนเข้าในระบบแล้ว", "#0008 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        } else if (checkMemID(bean)) {
            JOptionPane.showMessageDialog(null, "รหัสสมาชิกนี้ถูกผูกกับข้อมูลบัตร RFID ที่มีในระบบแล้ว", "#0009 [REGISTER]", JOptionPane.WARNING_MESSAGE);            
            return false;
        }


        return true;
    }
    private boolean checkCusID(RFIDBean bean) {
        ConnectDB odbc = new ConnectDB();
        return odbc.querySQL("select rfid_id from rfid_stock "
                + "where cust_id='" + bean.getCUST_ID() + "' "
                + "and rfid_id <> '" + bean.getRFID_ID() + "'");
    }
    
    private boolean checkMemID(RFIDBean bean) {
        ConnectDB odbc = new ConnectDB();
        return odbc.querySQL("select Member_Code from rfid_stock "
                + "where Member_Code='" + bean.getMEMBER_CODE() + "' "
                + "and rfid_id <> '" + bean.getRFID_ID() + "'");
    }
    private ConnectDB conn = new ConnectDB();
    private boolean saveProfile() {
        boolean isSave = false;
        for(int i=0;i<tbData.getRowCount();i++){
            RFIDBean bean = new RFIDBean();
            bean.setCASHIER(TheValue.CASHIER);
            bean.setRFID_CREATION_DATE("current_timestamp()");
            bean.setRFID_ID(tbData.getValueAt(i, 0).toString());
            bean.setCUST_ID(tbData.getValueAt(i, 1).toString());
            double moneyRFID = 0.0;
            try {
                moneyRFID = Double.parseDouble(tbData.getValueAt(i, 4).toString());
            } catch (Exception e) {
            }
            bean.setRFID_MONEY(moneyRFID);
            bean.setMEMBER_CODE(tbData.getValueAt(i, 1).toString());
            bean.setMEMBER_NAME(ThaiUtil.Unicode2ASCII(tbData.getValueAt(i, 2).toString()));
            bean.setMEMBER_SURNAME(ThaiUtil.Unicode2ASCII(tbData.getValueAt(i, 3).toString()));
            bean.setMEMBER_MOBILE("");
            bean.setMEMBER_GENDER("");
            bean.setMEMBER_BRITHDAY("0");
            bean.setRFID_STATUS("Y");
            bean.setCREDIT_TYPE("");
            bean.setIMG_PATH("");
            String datetime = tbData.getValueAt(i, 5).toString();
            bean.setRFID_EXPIRE_DATE(StringToDate.getString(datetime));
            if (!conn.dataExist(tbData.getValueAt(i, 0).toString().trim(), tbData.getValueAt(i, 1).toString().trim())) {
                bean.setRFID_LAST_ACTIVITY(ThaiUtil.Unicode2ASCII(TheValue.MSG_IMPORT));
                if (TheValue.MENU[5]) {
                    if (validInput(bean)) {
                        if (conn.saveProfile(bean)) {
                            //any code
                            //JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อยแล้ว", "Success", JOptionPane.PLAIN_MESSAGE);
                            isSave = true;
                        }
                    }
                }
            }
        }

        return isSave;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImportDataDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportDataDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportDataDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportDataDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImportDataDialog dialog = new ImportDataDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCount;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtFilePath;
    // End of variables declaration//GEN-END:variables
}
