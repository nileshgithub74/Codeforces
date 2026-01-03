
import java.util.Scanner;

public class DoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here

            String sb = sc.next();

            int  a= sb.charAt(0) -'0';
            int b = sb.charAt(2)-'0';

            int result = a +b;
            System.out.println(result);

            
        }
        sc.close();
    }
}
