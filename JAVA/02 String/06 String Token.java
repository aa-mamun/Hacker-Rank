/**
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.

Input Format

A single string,s .

Constraints
1 <= length of string s <= 4.10^5 
 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer,n, denoting the number of tokens in string  
(they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s.
*/
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.trim().split("[\\s!,?._'@]+",0);
        if(arr.length==1 && arr[0].equals("")){
            System.out.println(0);
        }
        else{
           System.out.println(arr.length);
           for(String i : arr)
            System.out.println(i); 
        }
        
        scan.close();
    }
}
