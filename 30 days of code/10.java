/**Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting 
the maximum number of consecutive 1's in n's binary representation.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        
        int consecutiveNumber = 0;
        int maxConsecutiveNumber = 0;
        
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1'){
                consecutiveNumber++;
                maxConsecutiveNumber = Math.max(consecutiveNumber, maxConsecutiveNumber);
            }
            else
            {
                consecutiveNumber = 0;
            }
        }
        System.out.println(maxConsecutiveNumber);
        sc.close();
    }
}