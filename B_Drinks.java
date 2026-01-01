
import java.util.Scanner;

public class B_Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int totalfraction = t;
        double fraction = 0;

        while (t-- > 0) {
            int x = sc.nextInt();
            fraction += x / 100.0;

        }

        double percentage = (fraction / totalfraction) * 100;
        System.out.println(percentage);

        sc.close();
    }
}
