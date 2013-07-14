package sun.natee.ton.control.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static String getString(String dateStr){
        String data="0";
        try {
            SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date nextExp = s.parse(dateStr);
            long expDate = nextExp.getTime();
            Date today = new Date();
            // Get msec from each, and subtract.
            long diff = expDate - today.getTime();
            long total = (diff / (1000 * 60 * 60 * 24))+1;
            if(diff<0){
                System.err.println("Incorrect expire date!");
                data = "";
            }else if(diff>1){
                data = ""+total;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            data = "";
        }
        
        return data;
    }
    public static String formatDateNormal(String dateStr){
        //format dd/MM/yyyy
        String []date = dateStr.split("/");                
        String data="";
        if(date.length==3){
            data= date[2]+"-"+date[1]+"-"+date[0];
        }
        return data;
    }
}
