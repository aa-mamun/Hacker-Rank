import java.io.*;
import java.util.*;

public class Solution {
    static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.equals(reverseString(str)) ? "Yes" : "No");
     
        
    }
}