/**Finding max absolute difference among intgers 
e.g 
3
1 2 5
Output 4
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

    private int[] elements;
    public int maximumDifference;
    // Add your code here

    Difference(int[] arr) {
        elements = arr;
    }

    void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
