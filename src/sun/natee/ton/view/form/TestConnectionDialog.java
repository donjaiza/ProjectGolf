package sun.natee.ton.view.form;

import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.control.api.ThaiUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TestConnectionDialog extends javax.swing.JDialog {

    public TestConnectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        loadURL();
    }
    
    public void loadURL(){
        txtURL.setText(txtMySQL.getText()+txtHost.getText()+txt3.getText()+txtPort.getText()+txt5.getText()+txtDB.getText()+txt7.getText()+txtCharset.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDB = new javax.swing.JComboBox();
        cbTB = new javax.swing.JComboBox();
        txtURL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbTotalRecord = new javax.swing.JLabel();
        lbTotalColumn = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtDB = new javax.swing.JTextField();
        txtCharset = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        txtMySQL = new javax.swing.JTextField();
        txtHost = new javax.swing.JTextField();
        txt3 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listColumn = new javax.swing.JList();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSQL = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbDB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDBItemStateChanged(evt);
            }
        });

        cbTB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTBItemStateChanged(evt);
            }
        });

        txtURL.setEditable(false);
        txtURL.setBackground(new java.awt.Color(255, 255, 255));
        txtURL.setText("jdbc:mysql://localhost:3306/MyChocolate?charset=tis620");

        jButton1.setText("Load Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Load Column");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Load data to Grid");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbTotalRecord.setText("Total");

        lbTotalColumn.setText("Column");

        txtUser.setText("root");

        jLabel1.setText("User");

        jLabel2.setText("Pass");

        txtPass.setText("000000");

        jButton5.setText("Map to Class[Bean]");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        jTabbedPane1.addTab("Data Grid", jScrollPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Class [Bean]", jScrollPane2);

        txtDB.setText("MyChocolate");

        txtCharset.setText("tis620");

        txtPort.setText("3306");

        txtMySQL.setEditable(false);
        txtMySQL.setBackground(new java.awt.Color(255, 255, 255));
        txtMySQL.setText("jdbc:mysql://");

        txtHost.setText("localhost");

        txt3.setText(":");

        txt5.setText("/");

        txt7.setText("?charset=");

        jScrollPane3.setViewportView(listColumn);

        jCheckBox1.setText("(*) - all column");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        txtSQL.setColumns(20);
        txtSQL.setRows(5);
        jScrollPane4.setViewportView(txtSQL);

        jButton6.setText("Generate Method");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalRecord)
                            .addComponent(lbTotalColumn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMySQL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDB, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCharset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbTB, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDB, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtURL, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMySQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCharset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3)
                    .addComponent(txt5)
                    .addComponent(txt7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotalRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotalColumn)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1032, 734));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadDataToCombo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadColumn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadTableToGrid();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        mapToClassBean(cbTB.getSelectedItem().toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbDBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDBItemStateChanged
        txtDB.setText(cbDB.getSelectedItem().toString());
        loadURL();
    }//GEN-LAST:event_cbDBItemStateChanged

    private void cbTBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTBItemStateChanged
        txtSQL.setText("select * from "+cbTB.getSelectedItem().toString());
    }//GEN-LAST:event_cbTBItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if(jCheckBox1.isSelected()){
            listColumn.setSelectionInterval(0, listColumn.getModel().getSize());
        }else{
            listColumn.clearSelection();
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestConnectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestConnectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestConnectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestConnectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TestConnectionDialog dialog = new TestConnectionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
//        TestConnectionDialog test = new TestConnectionDialog(null, true);
//        test.mapToClassBean("product");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbDB;
    private javax.swing.JComboBox cbTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbTotalColumn;
    private javax.swing.JLabel lbTotalRecord;
    private javax.swing.JList listColumn;
    private javax.swing.JTable tb;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt7;
    private javax.swing.JTextField txtCharset;
    private javax.swing.JTextField txtDB;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtMySQL;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextArea txtSQL;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void loadDataToCombo() {
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            ResultSet rs = stmt.executeQuery("show databases");
            if(cbDB!=null){
                if (cbDB.getItemCount() > 0) {
                    cbDB.removeAllItems();
                }
                String item;
                while (rs.next()) {
                    item = rs.getString(1);
                    if(item.indexOf("information")==-1){
                        cbDB.addItem(item);
                    }
                }
                rs.close();
                stmt.close();
                conn.close();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void loadTable() {
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            stmt.execute("use " + cbDB.getSelectedItem());
            ResultSet rs = stmt.executeQuery("show tables");
            if(cbTB!=null){
                if (cbTB.getItemCount() > 0) {
                    cbTB.removeAllItems();                
                }
                while (rs.next()) {
                    cbTB.addItem(rs.getString(1));
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void loadColumn() {
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            stmt.execute("use " + cbDB.getSelectedItem());
            ResultSet rs = stmt.executeQuery("describe " + cbTB.getSelectedItem());
            
            DefaultListModel model = new DefaultListModel();
            listColumn.setModel(model);            
            for(int i=0;i<model.getSize();i++){
                model.remove(0);
            }
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private DefaultTableModel model;

    private void loadTableToGrid() {
        if(txtSQL.getText().trim().equals("")){
            return ;
        }
        clearTable(model);

        model = new DefaultTableModel(getColumns(), 0);
        addRows(model);
        tb.setModel(model);

        //set default width column
        int row, column, size;
        String data = null;
        for (int i = 0; i < model.getRowCount(); i++) {
            row = i;
            for (int j = 0; j < model.getColumnCount(); j++) {
                column = j;
                data = "" + model.getValueAt(row, column);
                size = data.length() * 20;
                if (size < 50) {
                    size = 50;
                }
                tb.getColumnModel().getColumn(j).setPreferredWidth(size);
            }
        }
        tb.setShowGrid(true);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.setAutoCreateRowSorter(true);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb.setRowSelectionAllowed(true);
        tb.setGridColor(Color.gray);

        JTableHeader header = tb.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        tb.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tb.setRowHeight(25);

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

    private String[] getColumns() {
        String arr = "NO,";
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            ResultSet rs = stmt.executeQuery(txtSQL.getText());
            int count = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= count; i++) {
                arr += rs.getMetaData().getColumnName(i) + ",";
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return arr.split(",");
    }

    private void addRows(DefaultTableModel model) {
        String arr;
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            ResultSet rs = stmt.executeQuery(txtSQL.getText());
            int count = rs.getMetaData().getColumnCount();
            int a = 0;
            String item = null;
            while (rs.next()) {
                a++;
                arr = a + ",";
                for (int i = 1; i <= count; i++) {
                    if (rs.getMetaData().getColumnClassName(i).equals("java.sql.Date")) {
                        try {
                            item = "" + rs.getDate(i);
                        } catch (Exception e) {
                            item = "";
                        }
                    } else {
                        item = rs.getString(i);
                    }
                    if (item == null) {
                        item = "";
                    }
                    arr += ThaiUtil.ASCII2Unicode(item) + ",";
                }
                if (arr.length() > 0) {
                    model.addRow(arr.split(","));
                }
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }

        lbTotalRecord.setText("Total: " + model.getRowCount() + " Record.");
        lbTotalColumn.setText("Total: " + (model.getColumnCount() - 1) + " Column.");
    }

    private String[] mapToClassBean(String table) {
        String arr = "";
        ConnectDB conn = new ConnectDB();
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.connectOpen(txtURL.getText()).createStatement();
            ResultSet rs = stmt.executeQuery("describe "+table);
            String columnName="";
            String columnType="";
            String columnDefault="";
            String other="";
            StringBuffer buff = new StringBuffer();
            buff.append("import java.util.Date;\n\n\n");
            buff.append("public class "+table+"Bean{\n");      
            while(rs.next()){
                columnName = rs.getString(1);
                columnType = rs.getString(2);
                columnDefault = rs.getString(5);
                if(columnType.indexOf("varchar")!=-1){
                    columnType="String";
                }else if(columnType.indexOf("char")!=-1){
                    columnType="String";
                }else if(columnType.indexOf("double")!=-1){
                    columnType="double";
                }else if(columnType.indexOf("float")!=-1){
                    columnType="double";
                }else if(columnType.indexOf("int")!=-1){
                    columnType="int";
                }else if(columnType.indexOf("date")!=-1){
                    columnType="Date";
                }else if(columnType.indexOf("time")!=-1){
                    columnType="String";
                }else if(columnType.indexOf("Long")!=-1){
                    columnType="int";
                }
                if(columnDefault!=null&&!columnDefault.trim().equals("")){
                    if(columnType.indexOf("String")!=-1){
                        other=" = \""+columnDefault+"\"";
                    }else if(columnType.indexOf("Date")!=-1){
                        other = "";
                    }else{
                        other=" = "+columnDefault+"";
                    }
                }else{
                    other = "";
                }
                buff.append("     private "+columnType+" "+columnName+other+";\n");
            }
            
            buff.append("}");
            System.out.println(buff.toString());
            jTextArea1.setText(buff.toString());
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return arr.split(",");
    }

}
