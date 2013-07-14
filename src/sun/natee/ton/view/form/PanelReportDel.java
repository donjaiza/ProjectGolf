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
import sun.natee.ton.view.dialog.DateChooserDialog;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PanelReportDel extends javax.swing.JPanel {

    public PanelReportDel() {
        initComponents();
        
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JFormattedTextField();
        c1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JFormattedTextField();
        c2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส RFID", "รหัสลูกค้า", "รหัสสมาชิก", "ชื่อ", "นามสกุล", "สถานะใช้งาน"
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

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "cashier", "รายการ", "สถานะใช้งาน", "รหัสลูกค้า", "รหัส RFID", "ยอดเงินคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb2);

        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("วันที่ทำรายการ");

        c1.setText("...");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ถึง");

        c2.setText("...");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jButton1.setText("แสดงข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 432, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("รายงานข้อมูลการลบข้อมูลบัตร");

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

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        int rows = tb.getSelectedRow();
        int cols = 1;
        String CUST_ID="";
        if(rows!=-1){
            CUST_ID = tb.getValueAt(rows, cols).toString();
        }
        loadHistory(CUST_ID);
    }//GEN-LAST:event_tbMouseClicked

    private void tbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbKeyReleased
        tbMouseClicked(null);
    }//GEN-LAST:event_tbKeyReleased

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        showDialogCalendar(txtDate1, c1, null);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        showDialogCalendar(txtDate2, c2, null);
    }//GEN-LAST:event_c2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private SimpleDateFormat simp=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private void showDialogCalendar(JTextField txt, JButton btn, JFrame frame) {
        Point point = btn.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());  
        DateChooserDialog dcd = new DateChooserDialog(frame, true, point);
        dcd.setVisible(true);
        
        if(dcd.getSelectedDate()!=null){
            txt.setText(simp.format(new Date(dcd.getSelectedDate().getTimeInMillis())));
            txt.requestFocus();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb;
    private javax.swing.JTable tb2;
    private javax.swing.JFormattedTextField txtDate1;
    private javax.swing.JFormattedTextField txtDate2;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        JFrame d = new JFrame();
        d.setTitle("แสดงข้อมูลลูกค้าทั้งหมด");
        d.add(new PanelReportDel());
        d.pack();
        d.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        d.setVisible(true);
    }
    
    private DefaultTableModel model;
    private void loadData() {
        model = (DefaultTableModel) tb.getModel();
        clearTable(model);
        clearTable(model2);
        tb.setShowGrid(true);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.setAutoCreateRowSorter(true);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb.setRowSelectionAllowed(true);
        tb.setGridColor(Color.gray);
        
        tb.getColumnModel().getColumn(0).setPreferredWidth(100);
        tb.getColumnModel().getColumn(1).setPreferredWidth(100);
        for(int i=2;i<tb.getColumnCount();i++){
            tb.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String []date1=txtDate1.getText().split("/");
            String []date2=txtDate2.getText().split("/");
            String sql = "select * "
                    + "from rfid_stock_history "
                    + "where rfid_status='D' and "
                    + "DATE_FORMAT(RFID_LAST_TIME,'%Y-%m-%d') between "
                    + "'"+date1[2]+"-"+date1[1]+"-"+date1[0]+"' "
                    + "and '"+date2[2]+"-"+date2[1]+"-"+date2[0]+"' ";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;            
            while (rs.next()) {
                bean = new RFIDBean();             
                bean.setRFID_ID(rs.getString("RFID_ID"));
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setMEMBER_CODE(rs.getString("MEMBER_CODE"));
                
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_NAME")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SURNAME")));
                bean.setRFID_STATUS(rs.getString("RFID_STATUS"));
                
                model.addRow(new Object[]{
                    bean.getRFID_ID(), bean.getCUST_ID(), bean.getMEMBER_CODE(),
                    bean.getMEMBER_NAME(), bean.getMEMBER_SURNAME(), bean.getRFID_STATUS()
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

    private DefaultTableModel model2;
    private void loadHistory(String CUST_ID) {
        model2 = (DefaultTableModel) tb2.getModel();
        clearTable(model2);
        tb2.setShowGrid(true);
        tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb2.setAutoCreateRowSorter(true);
        tb2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tb2.setRowSelectionAllowed(true);
        tb2.setGridColor(Color.gray);
        
        tb2.getColumnModel().getColumn(0).setPreferredWidth(150);
        tb2.getColumnModel().getColumn(1).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(2).setPreferredWidth(250);
        tb2.getColumnModel().getColumn(3).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(5).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        JTableHeader header = tb2.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb2.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "SELECT * FROM rfid_stock_history where cust_id ='"+CUST_ID+"'";
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
                
                model2.addRow(new Object[]{
                bean.getRFID_LAST_TIME(),
                bean.getCASHIER(),
                bean.getRFID_LAST_ACTIVITY(),
                bean.getRFID_STATUS(),
                bean.getCUST_ID(),
                bean.getRFID_ID(),
                bean.getRFID_MONEY()
                });
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
