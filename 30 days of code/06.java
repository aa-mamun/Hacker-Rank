/**
Given a string, S, of length N that is indexed from 0 to N, print its even-indexed and odd-indexed characters as 2 
"space-separated" strings on a single line.Input n ,then n strings.
*/
import java.util.*;
public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 
        String str ="";
        String evenChar = "";
        String oddChar = "";
        for (int i = 0; i < n; i++) {
             evenChar = "";
             oddChar = "";
             str = sc.nextLine();
             for(int c = 0; c<str.length();c++){
                 char ch = str.charAt(c);
                 if(c%2 == 0)
                 {
                     evenChar+=ch;
                 }
                 else{
                     oddChar+=ch;
                 }
             }
             System.out.println(evenChar + "  " + oddChar);
        }
        sc.close();
    }
}
