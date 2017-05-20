/**(a + 2^0 . b) ,(a + 2^0 . b + 2^1 . b),.......,(a + 2^0 . b + 2^1 . b + ...... + 2^n-1 . b)
Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
import java.util.Scanner;
public class Solution {

 public static void main(String []argh){
        Scanner in = new Scanner(System.in);
         
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int series = a;
            for (int j = 0; j < n; j++) {
                series +=  (int) (  Math.pow(2, j)* b);
                System.out.print(series+" ");
            }
        System.out.println();
         
     }
        in.close();
    }
}
