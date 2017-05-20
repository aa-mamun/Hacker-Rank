/**
retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of  A and B.
Determine if  A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class Solution {
    static String capitalizeFirstChar(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = a.length() + b.length();
        System.out.println(sum);
        System.out.println(a.compareTo(b)>0 ? "Yes" : "No");
        System.out.println(capitalizeFirstChar(a) + " " + capitalizeFirstChar(b));
        
    }
}
