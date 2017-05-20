/**
print an array in reverse order
*/
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int len = arr.length;
        for(int i = len-1 ; i >= 0 ; i--)
            {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}