import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd"); 
        Date date;
        try {
           date = sdf.parse(year + "-" + month + "-" + day); 
            sdf.applyPattern("EEEE");
           String str = sdf.format(date);
           System.out.println(str.toUpperCase()); 
        }catch (ParseException e) { 
           System.out.println("Unparseable using " + sdf); 
        }
    }
}
