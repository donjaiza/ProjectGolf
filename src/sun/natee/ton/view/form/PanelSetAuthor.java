package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PanelSetAuthor extends javax.swing.JPanel {

    public PanelSetAuthor() {
        initComponents();
        
        loadEmployee("");
    }
    
    public static void main(String[] args) {
        JFrame d = new JFrame();
        d.setTitle("กำหนดสิทธิ์ผู้ใช้งาน");
        d.add(new PanelSetAuthor());
        d.pack();
        d.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        d.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึก / แก้ไขข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ลำดับ", "UserGroup", "ลงทะเบียนลูกค้า", "เติมเงินในบัตร", "โอนข้อมูลบัตร", "ลบข้อมูลลูกค้า", "กำหนดสิทธิ์", "แก้ไขข้อมูลลูกค้า", "ตั้งค่าฐานข้อมูล"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb1);

        jTabbedPane1.addTab("กลุ่มพนักงาน", jScrollPane2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("โหลดข้อมูล");
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
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("กำหนดสิทธิพนักงาน");

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(TheValue.MENU[4]){
            savePermission();
        }else{
            TheValue.notAuthorization();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadDataPermission();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model;
    
    private void loadEmployee(String code) {
        model = (DefaultTableModel) tb1.getModel();
        clearTable(model);
        tb1.setShowGrid(true);
        tb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb1.setAutoCreateRowSorter(true);
        tb1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb1.setRowSelectionAllowed(true);
        tb1.setGridColor(Color.gray);
        for(int i=1;i<tb1.getColumnCount();i++){
            tb1.getColumnModel().getColumn(i).setPreferredWidth(150);
        }        
        JTableHeader header = tb1.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb1.setRowHeight(25);
        
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "SELECT * FROM rfid_permission order by usergroup";
            if(!code.equals("")){
                sql = "SELECT * FROM rfid_permission "
                        + "where username like '%"+code+"%'";
            }
            ResultSet rs = stmt.executeQuery(sql);
            boolean m1,m2,m3,m4,m5,m6,m7;
            String username;
            int count=0;
            while (rs.next()) {
                count++;
                username = rs.getString("username");                
                m1 = rs.getString("m1").equals("Y");
                m2 = rs.getString("m2").equals("Y");
                m3 = rs.getString("m3").equals("Y");
                m4 = rs.getString("m4").equals("Y");
                m5 = rs.getString("m5").equals("Y");
                m6 = rs.getString("m6").equals("Y");
                m7 = rs.getString("m7").equals("Y");
                
                model.addRow(new Object[]{count, username, m1, m2, m3, m4, m5, m6, m7});
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

    private void savePermission() {
        //clear old data
        ConnectDB con = new ConnectDB();
        con.executeSQL("delete from rfid_permission");
        
        String []perm = new String[7];
        String username, usergroup="";
        String sql;
        boolean isCheck;
        for(int i=0;i<tb1.getRowCount();i++){
            username = tb1.getValueAt(i, 1).toString();            
            for(int j=2;j<tb1.getColumnCount();j++){                
                isCheck = Boolean.parseBoolean(tb1.getValueAt(i, j).toString());
                if(isCheck){
                    perm[j-2]="Y";
                }else{
                    perm[j-2]="N";
                }
            }            
            //insert new data
            sql = "insert into rfid_permission(username, usergroup, m1,m2,m3,m4,m5,m6,m7) "
                    + "values('"+username+"','"+usergroup+"',"
                    + "'"+perm[0]+"','"+perm[1]+"','"+perm[2]+"',"
                    + "'"+perm[3]+"','"+perm[4]+"','"+perm[5]+"',"
                    + "'"+perm[6]+"')";
            con.executeSQL(sql);
        }
    }

    private void loadDataPermission() {
        if(!tableIsExist("RFID_PERMISSION")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute("insert into rfid_permission(username,usergroup) select username, password from usergroup");
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public boolean tableIsExist(String table) {
        boolean isExist = false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select * from " + table);
            isExist = true;
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            isExist=false;
            System.out.println(e.getMessage());
        }

        return isExist;
    }
}
