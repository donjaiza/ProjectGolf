package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.control.api.ThaiUtil;

public class ShowHistory extends javax.swing.JDialog {
    private String CUST_ID = "";
    
    public ShowHistory(java.awt.Frame parent, boolean modal, String CUST_ID) {
        super(parent, modal);
        initComponents();
        
        this.CUST_ID = CUST_ID;
        loadDataCust();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "cashier", "รายการ", "สถานะใช้งาน", "ชื่อ", "นามสกุล", "รหัสลูกค้า", "รหัสสมาชิก", "รหัส RFID", "ยอดเงินคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("แสดงข้อมูลประวัติการใช้งาน");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ปิดหน้าต่าง");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("เมนู");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("ปิดหน้าต่าง");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ShowHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowHistory dialog = new ShowHistory(new javax.swing.JFrame(), true, "1111ABC");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.loadDataCust();
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel model;
    
    private void loadDataCust() {
        model = (DefaultTableModel) tb.getModel();
        clearTable(model);
        tb.setShowGrid(true);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.setAutoCreateRowSorter(true);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb.setRowSelectionAllowed(true);
        tb.setGridColor(Color.gray);
        
        tb.getColumnModel().getColumn(0).setPreferredWidth(150);
        tb.getColumnModel().getColumn(1).setPreferredWidth(50);
        tb.getColumnModel().getColumn(2).setPreferredWidth(100);
        tb.getColumnModel().getColumn(3).setPreferredWidth(50);
        tb.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb.getColumnModel().getColumn(5).setPreferredWidth(120);
        tb.getColumnModel().getColumn(6).setPreferredWidth(60);
        tb.getColumnModel().getColumn(7).setPreferredWidth(60);
        tb.getColumnModel().getColumn(8).setPreferredWidth(100);
        tb.getColumnModel().getColumn(9).setPreferredWidth(150);
        
        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "SELECT RFID_STATUS, CASHIER, DATE_FORMAT(RFID_LAST_TIME,'%d/%m/%Y %H:%i:%s') RFID_LAST_TIME, "
                    + "RFID_LAST_ACTIVITY, CUST_NAME, CUST_SURNAME,"
                    + "CUST_ID, MEMBER_CODE, RFID_ID, RFID_MONEY "
                    + "FROM rfid_stock_history where cust_id='"+CUST_ID+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;
            while (rs.next()) {
                bean = new RFIDBean();
                bean.setCASHIER(rs.getString("CASHIER"));
                bean.setRFID_STATUS(rs.getString("RFID_STATUS"));
                bean.setRFID_LAST_TIME(rs.getString("RFID_LAST_TIME"));
                bean.setRFID_LAST_ACTIVITY(ThaiUtil.ASCII2Unicode(rs.getString("RFID_LAST_ACTIVITY")));
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_NAME")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SURNAME")));
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setMEMBER_CODE(ThaiUtil.ASCII2Unicode(rs.getString("MEMBER_CODE")));
                bean.setRFID_ID(rs.getString("RFID_ID"));
                bean.setRFID_MONEY(rs.getDouble("RFID_MONEY"));
                
                model.addRow(new String[]{
                bean.getRFID_LAST_TIME(),
                bean.getCASHIER(),
                bean.getRFID_LAST_ACTIVITY(),
                bean.getRFID_STATUS(),
                bean.getMEMBER_NAME(),
                bean.getMEMBER_SURNAME(),
                bean.getCUST_ID(),
                bean.getMEMBER_CODE(),
                bean.getRFID_ID(),
                ""+bean.getRFID_MONEY()
                });
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
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
    
    void setIndicator(String cust_id) {
        this.CUST_ID=cust_id;
    }
}
