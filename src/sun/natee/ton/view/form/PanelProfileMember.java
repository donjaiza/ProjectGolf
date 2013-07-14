package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.control.api.ThaiUtil;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sun.natee.ton.model.bean.RFIDBean;
import javax.swing.JFrame;

public class PanelProfileMember extends javax.swing.JPanel {

    public PanelProfileMember() {
        initComponents();
        
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("โปรดระบุข้อมูล");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสมาชิก", "ชื่อ", "นามสกุล", "เพศ", "เบอร์ติดต่อ", "สถานะสมาชิก"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        tb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 509, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ข้อมูลสมาชิก (MEMBER)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        loadData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        int rows = tb.getSelectedRow();
        int cols = 1;
        String CUST_ID="";
        if(rows!=-1){
            CUST_ID = tb.getValueAt(rows, cols).toString();
        }
    }//GEN-LAST:event_tbMouseClicked

    private void tbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbKeyReleased
        tbMouseClicked(null);
    }//GEN-LAST:event_tbKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        JFrame d = new JFrame();
        d.setTitle("แสดงข้อมูลลูกค้าทั้งหมด");
        d.add(new PanelProfileMember());
        d.pack();
        d.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        d.setVisible(true);
    }
    
    private DefaultTableModel model;
    private void loadData() {
        model = (DefaultTableModel) tb.getModel();
        clearTable(model);
        tb.setShowGrid(true);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.setAutoCreateRowSorter(true);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb.setRowSelectionAllowed(true);
        tb.setGridColor(Color.gray);
        
        tb.getColumnModel().getColumn(0).setPreferredWidth(100);
        tb.getColumnModel().getColumn(1).setPreferredWidth(150);
        tb.getColumnModel().getColumn(2).setPreferredWidth(250);
        tb.getColumnModel().getColumn(3).setPreferredWidth(50);
        tb.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpenMember().createStatement();
            String keyword = ThaiUtil.Unicode2ASCII(txtSearch.getText());
            String sql = "select Member_code, member_namethai, member_surnamethai,member_gender,"
                    + "member_mobile, member_active FROM memmaster "
                    + "WHERE MEMBER_CODE like '%"+keyword+"%' or "
                    + "MEMBER_NAMETHAI like '%"+keyword+"%'";
            //System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;
            while (rs.next()) {
                bean = new RFIDBean();
                bean.setMEMBER_CODE(rs.getString("MEMBER_CODE"));                
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("MEMBER_NAMETHAI")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("MEMBER_SURNAMETHAI")));
                bean.setMEMBER_MOBILE(rs.getString("MEMBER_MOBILE"));
                bean.setMEMBER_GENDER(rs.getString("MEMBER_GENDER"));
                bean.setMEMBER_ACTIVE(rs.getString("MEMBER_ACTIVE"));
                
                model.addRow(new Object[]{
                    bean.getMEMBER_CODE(), bean.getMEMBER_NAME(), bean.getMEMBER_SURNAME(),
                    bean.getMEMBER_GENDER(), bean.getMEMBER_MOBILE(), bean.getMEMBER_ACTIVE()
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
}
