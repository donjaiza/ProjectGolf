package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.control.api.ThaiUtil;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sun.natee.ton.model.bean.RFIDBean;

public class PanelProfileCancel extends javax.swing.JPanel {

    public PanelProfileCancel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID_ID", "CUST_ID", "CUST_NAME", "CUST_SURNAME", "CUST_SEX", "CUST_AGE", "CUST_TEL", "CUST_ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ระบุข้อมูล");

        txtSearch.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        btnSearch.setText("ค้นหา");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jButton2.setText("ยกเลิกบัตร");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ยกเลิกการใช้งานบัตร");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cancleData();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model;
    
    private void searchData() {
        model = (DefaultTableModel) tb.getModel();
        clearTable(model);
        tb.setShowGrid(true);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.setAutoCreateRowSorter(true);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb.setRowSelectionAllowed(true);
        tb.setGridColor(Color.gray);
        for(int i=1;i<tb.getColumnCount();i++){
            tb.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Angsana New", Font.PLAIN, 22));
        tb.setFont(new Font("Angsana New", Font.PLAIN, 22));
        tb.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String keword = ThaiUtil.ASCII2Unicode(txtSearch.getText());
            String sql = "SELECT * FROM rfid_stock "
                        + "WHERE RFID_STATUS='Y' AND ("
                        + "CUST_NAME like '%"+keword+"%' or "
                        + "CUST_ID like '%"+keword+"%' or "
                        + "CUST_TEL like '%"+keword+"%' or "
                        + "CUST_ADDRESS like '%"+keword+"%' or "
                        + "CUST_SURNAME like '%"+keword+"%')";
            
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;
            while (rs.next()) {
                bean = new RFIDBean();
                bean.setRFID_ID(rs.getString("RFID_ID"));
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_NAME")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SURNAME")));
                bean.setMEMBER_GENDER(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SEX")));
                bean.setMEMBER_BRITHDAY(rs.getString("CUST_AGE"));
                bean.setCASHIER(ThaiUtil.ASCII2Unicode(rs.getString("CUST_ADDRESS")));
                
                model.addRow(new String[]{
                    bean.getRFID_ID(), bean.getCUST_ID(), bean.getMEMBER_NAME(),bean.getMEMBER_SURNAME(), 
                    bean.getMEMBER_GENDER(), bean.getMEMBER_BRITHDAY(), bean.getMEMBER_MOBILE(), bean.getCASHIER()
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

    private void cancleData() {
        ConnectDB conn= new ConnectDB();
        if(tb.getSelectedRow()!=-1){
            String RFID_ID = tb.getValueAt(tb.getSelectedRow(), 0).toString();
            if(conn.deleteProfile(RFID_ID)){
                JOptionPane.showMessageDialog(null, "ยกเลิกข้อมูลผู้ใช้งานเรียบร้อยแล้ว");
                searchData();
            }
        }
    }
}
