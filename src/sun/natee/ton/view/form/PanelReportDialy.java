package sun.natee.ton.view.form;

import sun.natee.ton.view.dialog.DateChooserDialog;
import sun.natee.ton.model.database.ConnectDB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sun.natee.ton.model.bean.RFIDBean;
import sun.natee.ton.control.api.ThaiUtil;
import javax.swing.JOptionPane;


public class PanelReportDialy extends javax.swing.JPanel {

    public PanelReportDialy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHeader = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDetail = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtMoney = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JFormattedTextField();
        txtDate1 = new javax.swing.JFormattedTextField();
        txtDate2 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFree = new javax.swing.JFormattedTextField();
        lbTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "ยอดเงินสด", "ยอดบัตรเครดิต", "เงินมัดจำ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHeaderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHeader);

        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("วันที่ทำรายการ");

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ถึง");

        c1.setText("...");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

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

        tbDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสลูกค้า", "ชื่อ", "นามสกุล", "จำนวนเงินในบัตร", "จำนวนเครดิต", "ค่ามัดจำ", "วันหมดอายุบัตร"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbDetail);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("รวมยอดเงินสดทั้งหมด (บาท)");

        txtMoney.setEditable(false);
        txtMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtMoney.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("รวมยอดเครดิตทั้งหมด (บาท)");

        txtCredit.setEditable(false);
        txtCredit.setBackground(new java.awt.Color(255, 255, 255));
        txtCredit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtCredit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("รวมยอดมัดจำทั้งหมด (บาท)");

        txtFree.setEditable(false);
        txtFree.setBackground(new java.awt.Color(255, 255, 255));
        txtFree.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtFree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTotal.setText("จำนวนบัตรทั้งหมด 0 ใบ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 144, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTotal)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFree, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("สรุปยอดแต่ละวัน");

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
        searchData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        showDialogCalendar(txtDate1, c1, null);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        showDialogCalendar(txtDate2, c2, null);
    }//GEN-LAST:event_c2ActionPerformed

    private void tbHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHeaderMouseClicked
        int row = tbHeader.getSelectedRow();
        int col = 0;
        if(row>-1){
            String datetime = tbHeader.getValueAt(row, col).toString();
            loadDataDetail(datetime);
        }
    }//GEN-LAST:event_tbHeaderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbDetail;
    private javax.swing.JTable tbHeader;
    private javax.swing.JFormattedTextField txtCredit;
    private javax.swing.JFormattedTextField txtDate1;
    private javax.swing.JFormattedTextField txtDate2;
    private javax.swing.JFormattedTextField txtFree;
    private javax.swing.JFormattedTextField txtMoney;
    // End of variables declaration//GEN-END:variables

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
    
    public static void main(String[] args) {
        JFrame d = new JFrame();
        d.setTitle("รายงานต่างๆ");
        d.add(new PanelReportDialy());
        d.pack();
        d.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        d.setVisible(true);
    }

    private DefaultTableModel model;    
    private void searchData() {
        String []date1=txtDate1.getText().split("/");
        String []date2=txtDate2.getText().split("/");
        model = (DefaultTableModel) tbHeader.getModel();
        clearTable(model);
        clearTable(model2);
        tbHeader.setShowGrid(true);
        tbHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbHeader.setAutoCreateRowSorter(true);
        tbHeader.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbHeader.setRowSelectionAllowed(true);
        tbHeader.setGridColor(Color.gray);
        
        tbHeader.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbHeader.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbHeader.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbHeader.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        JTableHeader header = tbHeader.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tbHeader.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tbHeader.setRowHeight(25);        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "SELECT count(RFID_ID) CRFID, DATE_FORMAT(RFID_LAST_TIME,'%d/%m/%Y') RFID_LAST_TIME, "
                    + "sum(bill_cash) CMONEY, sum(CREDIT_MONEY) CRECOUNT,"
                    + "sum(FREE_MONEY) CFREE "
                    + "FROM rfid_stock, rfid_bill "
                    + "WHERE rfid_stock.cust_id=rfid_bill.bill_cust_id "
                    + "AND DATE_FORMAT(RFID_LAST_TIME,'%Y-%m-%d') between "
                    + "'"+date1[2]+"-"+date1[1]+"-"+date1[0]+"' "
                    + "and '"+date2[2]+"-"+date2[1]+"-"+date2[0]+"' "
                    + "and rfid_status='Y' "
                    + "group by DATE_FORMAT(RFID_LAST_TIME,'%Y-%m-%d')";
            //System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;
            while (rs.next()) {
                bean = new RFIDBean();
                bean.setRFID_LAST_TIME(rs.getString("RFID_LAST_TIME"));
                bean.setRFID_ID(rs.getString("CRFID"));
                bean.setRFID_MONEY(rs.getDouble("CMONEY"));
                bean.setCREDIT_MONEY(rs.getDouble("CRECOUNT"));
                bean.setFREE_MONEY(rs.getDouble("CFREE"));
                
                model.addRow(new Object[]{bean.getRFID_LAST_TIME(), bean.getRFID_MONEY(),
                bean.getCREDIT_MONEY(), bean.getFREE_MONEY()});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //set total score
        double totalMoney=0.0;
        double totalCredit=0.0;
        double totalFree=0.0;
        double totalCard = 0.0;
        for(int i=0;i<tbHeader.getRowCount();i++){
            totalMoney+=Double.parseDouble(""+tbHeader.getValueAt(i, 1));
            totalCredit+=Double.parseDouble(""+tbHeader.getValueAt(i, 2));
            totalFree+=Double.parseDouble(""+tbHeader.getValueAt(i, 3));            
        }
        txtMoney.setText(""+totalMoney);
        txtCredit.setText(""+totalCredit);
        txtFree.setText(""+totalFree);
        if(model2!=null){
            lbTotal.setText("จำนวนบัตรทั้งหมด "+model2.getRowCount()+" ใบ");
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
    private void loadDataDetail(String datetime) {
        model2 = (DefaultTableModel)tbDetail.getModel();
        clearTable(model2);
        tbDetail.setShowGrid(true);
        tbDetail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbDetail.setAutoCreateRowSorter(true);
        tbDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbDetail.setRowSelectionAllowed(true);
        tbDetail.setGridColor(Color.gray);
        
        tbDetail.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbDetail.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbDetail.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbDetail.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbDetail.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbDetail.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbDetail.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        JTableHeader header = tbDetail.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tbDetail.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tbDetail.setRowHeight(25);
        
        String []date1=datetime.split("/");
        datetime = date1[2]+"-"+date1[1]+"-"+date1[0];
        ConnectDB conn =new ConnectDB();
        try {
            String sql = "select CASHIER, CUST_ID,CUST_NAME,CUST_SURNAME,RFID_MONEY,CREDIT_MONEY,FREE_MONEY,"
                    + "DATE_FORMAT(RFID_EXPIRE_DATE,'%d/%m/%Y') RFID_EXPIRE_DATE "
                    + "from rfid_stock "
                    + "where date_format(rfid_last_time,'%Y-%m-%d')='"+datetime+"'";
            System.out.println(sql);
            Statement stmt = conn.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean=new RFIDBean();
            while(rs.next()){
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_NAME")));
                bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs.getString("CUST_SURNAME")));
                bean.setRFID_MONEY(rs.getDouble("RFID_MONEY"));
                bean.setCREDIT_MONEY(rs.getDouble("CREDIT_MONEY"));
                bean.setFREE_MONEY(rs.getDouble("FREE_MONEY"));
                bean.setRFID_EXPIRE_DATE(rs.getString("RFID_EXPIRE_DATE"));                
                
                model2.addRow(new Object[]{
                bean.getCUST_ID(),
                bean.getMEMBER_NAME(),
                bean.getMEMBER_SURNAME(),
                bean.getRFID_MONEY(),
                bean.getCREDIT_MONEY(),
                bean.getFREE_MONEY(),
                bean.getRFID_EXPIRE_DATE()
                });
            }
            lbTotal.setText("จำนวนบัตรทั้งหมด "+model2.getRowCount()+" ใบ");
            rs.close();
            stmt.close();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        conn.close();
    }
}
