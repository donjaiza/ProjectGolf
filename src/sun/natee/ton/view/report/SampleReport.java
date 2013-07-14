package sun.natee.ton.view.report;

import sun.natee.ton.model.database.ConnectDB;
import sun.natee.ton.model.database.dbUtility;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;

public class SampleReport {
    
    public SampleReport(){
        dbUtility db = new dbUtility();
        db.dbconnect();
    }
        
    public void testPrint(){
        ConnectDB conn = new ConnectDB();
        try {
            Connection con = conn.connectOpen();
            Map param = new HashMap();
//            param.put("SQL", "select * from rfid_stock");
            
            JasperReport jasperReport = null;
            try {
                jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/com/project/report/report3.jasper"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, con);
            int pageSize = jasperPrint.getPages().size();
            if (pageSize > 0) {
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void printCompile() {
        try {
            Map parameters = new HashMap();
            parameters.put("branchName", "");
            parameters.put("month", "");
            parameters.put("sql", "");
            parameters.put("tax", "");
            parameters.put("companyName", "");
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/com/project/report/stockInhand_balanceVender.jasper"));
            JasperFillManager.fillReport(jasperReport, parameters, dbUtility.con);
        } catch (JRException ex) {
            Logger.getLogger(SampleReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        SampleReport t = new SampleReport();
        t.testPrint();
    }
}
