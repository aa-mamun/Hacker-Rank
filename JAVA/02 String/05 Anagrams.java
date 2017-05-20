 import java.io.*;
import java.util.*;

 class Solution {
 static boolean isAnagram(String a, String b) {
    
        
        return sort(a).equals(sort(b)) ? true : false ;
        
    }
static String sort(String s){
    s = s.toLowerCase();
    char[] chArr = s.toCharArray();
    Arrays.sort(chArr);
    return new String(chArr);
}
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}