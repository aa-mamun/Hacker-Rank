import java.util.*;
import java.math.*;


public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger product = BigInteger.valueOf(0);
        sum = sum.add(a);
        sum = sum.add(b);
        
        product = a.multiply(b);
        System.out.println(sum);
        System.out.println(product);
    }
}