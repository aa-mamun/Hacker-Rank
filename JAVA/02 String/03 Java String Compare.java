/**
Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 
2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String minSub = "";
        String maxSub = "";
        
        for(int i = 0 ; i <= str.length()- k; i++){
            String sub = str.substring(i,i+k);
            if(sub.compareTo(minSub)<0 || minSub.isEmpty()){
                minSub = sub;
            }
            if(sub.compareTo(maxSub)>0 || maxSub.isEmpty()){
                maxSub = sub;
             }
            
        }
        System.out.println(minSub);
        System.out.println(maxSub);
        
    }
}