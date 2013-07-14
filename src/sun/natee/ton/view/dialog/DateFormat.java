/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sun.natee.ton.view.dialog;

/**
 *
 * @author Installation-Laptop
 */
public class DateFormat {
    
    public static String yyyy_MM_dd_TO_ddMMyyyy(String yyyyMMdd){
        String date="";
        String []dd=yyyyMMdd.split("-");
        date=dd[2]+"/"+dd[1]+"/"+dd[0];
        
        return date;
    }
}
