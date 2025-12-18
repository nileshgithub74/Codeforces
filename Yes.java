
import java.util.Scanner;

public class Yes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
      

        while (testcase-- > 0) {

            String str = sc.next();
            str  = str.toLowerCase();

            if (str.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        sc.close();

    }
}
