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
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ShowCust extends javax.swing.JDialog {
    private String RFID_ID = "";
    
    public ShowCust(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        loadDataCust();
    }
    
    public String getRFID(){
        return RFID_ID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID_ID", "CUST_ID", "CUST_NAME", "CUST_SURNAME", "TEL", "BIRTH_DAY", "STATUS_ACTIVE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("แสดงรหัสข้อมูลของลูกค้าทั้งหมด");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ออก (ESC)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("เลือกข้อมูล (Enter)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = tb.getSelectedRow();
        int column = 0;
        if (row > -1) {
            RFID_ID = tb.getValueAt(row, column).toString();
            System.out.println(RFID_ID);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        if(evt.getClickCount()==2){
            int row = tb.getSelectedRow();
            int column = 0;
            if (row > -1) {
                RFID_ID = tb.getValueAt(row, column).toString();
                System.out.println(RFID_ID);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tbMouseClicked

    private void tbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int row = tb.getSelectedRow();
            int column = 0;
            if (row > -1) {
                RFID_ID = tb.getValueAt(row, column).toString();
                System.out.println(RFID_ID);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tbKeyPressed

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
            java.util.logging.Logger.getLogger(ShowCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowCust dialog = new ShowCust(new javax.swing.JFrame(), true);
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
        
        tb.getColumnModel().getColumn(0).setPreferredWidth(100);
        tb.getColumnModel().getColumn(1).setPreferredWidth(100);
        tb.getColumnModel().getColumn(2).setPreferredWidth(150);
        tb.getColumnModel().getColumn(3).setPreferredWidth(250);
        tb.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb.getColumnModel().getColumn(5).setPreferredWidth(150);
        tb.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            ConnectDB con2 = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            Statement st2 = con2.connectOpenMember().createStatement();
            String sql = "SELECT * FROM rfid_stock ";
            ResultSet rs2=null;
            ResultSet rs = stmt.executeQuery(sql);
            RFIDBean bean;
            while (rs.next()) {
                bean = new RFIDBean();
                bean.setRFID_ID(rs.getString("RFID_ID"));
                bean.setCUST_ID(rs.getString("CUST_ID"));
                bean.setRFID_STATUS(rs.getString("RFID_STATUS"));
                bean.setMEMBER_CODE(rs.getString("MEMBER_CODE"));
                
                //load member data
                try {
                    String sql2 = "select MEMBER_CODE,MEMBER_NAMETHAI,MEMBER_SURNAMETHAI,MEMBER_GENDER,"
                            + "MEMBER_MOBILE,date_format(MEMBER_BRITHDAY,'%d/%m/%Y') MEMBER_BRITHDAY "
                            + "from memmaster where member_code='"+bean.getMEMBER_CODE()+"'";
                    rs2 = st2.executeQuery(sql2);
                    while(rs2.next()){
                        bean.setMEMBER_NAME(ThaiUtil.ASCII2Unicode(rs2.getString("MEMBER_NAMETHAI")));
                        bean.setMEMBER_SURNAME(ThaiUtil.ASCII2Unicode(rs2.getString("MEMBER_SURNAMETHAI")));
                        bean.setMEMBER_GENDER(ThaiUtil.ASCII2Unicode(rs2.getString("MEMBER_GENDER")));
                        String age ="";
                        try{
                            age= ""+rs2.getString("MEMBER_BRITHDAY");
                        }catch(Exception e){
                        }
                        bean.setMEMBER_BRITHDAY(age);
                        bean.setMEMBER_MOBILE(rs2.getString("MEMBER_MOBILE"));
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    System.out.println(e.getMessage());
                }
                rs2.close();
                
                model.addRow(new String[]{bean.getRFID_ID(), bean.getCUST_ID(), bean.getMEMBER_NAME(),bean.getMEMBER_SURNAME(), 
                    bean.getMEMBER_MOBILE(), bean.getMEMBER_BRITHDAY(), bean.getRFID_STATUS()});
            }
            
            
            st2.close();
            con2.close();
            
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
