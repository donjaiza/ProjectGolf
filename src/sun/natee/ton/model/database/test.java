/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sun.natee.ton.model.database;

import sun.natee.ton.control.api.ThaiUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Installation-Laptop
 */
public class test {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/MyGolf?charset=tis620";
            Connection conn = DriverManager.getConnection(URL, "root", "000000");
            Statement stmt = conn.createStatement();
            String sql = "select username, password from posuser";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //System.out.println(rs.getMetaData().getColumnClassName(3));
                System.out.print(ThaiUtil.ASCII2Unicode(rs.getString(1))+"=");
                System.out.println(ThaiUtil.ASCII2Unicode(rs.getString(2)));
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
