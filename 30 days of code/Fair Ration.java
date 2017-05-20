/**
distribute loaf of bread to each person in the line , so that after distribution each person have even number of loaf
e.g
5           --- five person in the line
2 3 4 5 6   --- each person initially have these numbers of loaf

rules
 if we give a loaf to one then we hvae to give one more loaf to other person to have even number for each person.
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int sum =0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum+=B[B_i];
        }
        int count=0;
        if(sum % 2 !=0){
            System.out.println("NO");
        }
        else{
            for(int i=0; i < N; i++){
               if(B[i]%2 !=0){
                  B[i] = B[i]+1;
                  B[i+1] = B[i+1] +1;
                  count+=2;
               }
            }
            System.out.println(count);
        }
    }
}
