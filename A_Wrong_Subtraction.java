
import java.util.Scanner;

public class A_Wrong_Subtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        while (n != 0 && k-- > 0) {
            int digit = n % 10;
            if (digit == 0) {
                n = n / 10;
            } else {
                n = n - 1;
            }

        }

        int originalNumber = n;

        System.out.println(originalNumber);

        sc.close();
    }
}
