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

public class TableTemplate extends JTable {
    private DefaultTableModel model;
    private String sql;
    
    public TableTemplate(String sql){
        this.sql=sql;
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
            Statement stmt = conn.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int count = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= count; i++) {
                arr += rs.getMetaData().getColumnName(i) + ",";
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return arr.split(",");
    }

    private void addRows(DefaultTableModel model) {
        String arr;
        ConnectDB conn = new ConnectDB();
        
        try {
            //Load driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            
            Statement stmt = conn.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
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
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public JTable loadTableToGrid() {
        clearTable(model);

        model = new DefaultTableModel(getColumns(), 0);
        addRows(model);
        setModel(model);

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
                getColumnModel().getColumn(j).setPreferredWidth(size);
            }
        }
        setShowGrid(true);
        setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        setAutoCreateRowSorter(true);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setRowSelectionAllowed(true);
        setGridColor(Color.gray);

        JTableHeader header = getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        setFont(new Font("Tahoma", Font.PLAIN, 12));
        setRowHeight(25);
        
        
        return this;

    }

}
