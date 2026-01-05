
import java.util.Scanner;

public class A_Divisibility_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a % b == 0) {
                System.out.println("0");

            } else {
                int result = b - (a % b);
                System.out.println(result);
            }
        }
        sc.close();
    }
}
