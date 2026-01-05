
import java.util.Scanner;

public class A_Short_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            String s = sc.next();

            int count = 0;

            if (s.charAt(0) != 'a') {
                count++;
            }
            if (s.charAt(1) != 'b') {
                count++;

            }
            if (s.charAt(2) != 'c') {
                count++;
            }

            if (count > 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
        sc.close();
    }
}
