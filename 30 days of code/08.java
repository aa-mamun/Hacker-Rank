/**Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. For each name queried, print the 
associated entry from your phone book on a new line in the form name=phoneNumber; 
if an entry for name is not found, print Not found instead.
*/
import java.util.*;

public class Solution {

    public static void main(String[] argh) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (map.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }
        in.close();
    }
}