
import java.util.Scanner;

  public class  AwayToLongString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here

            String str = sc.next().trim().toLowerCase();
            int n = str.length();

            String result = "";
            int remaining = n-2;

             
            

            if (n > 10) {

                result += str.charAt(0) + Integer.toString(remaining)  + str.charAt(n - 1);

            } else {
                result += str;
            }

            System.out.println(result);

        }
        sc.close();
    }
}
