
import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            int x = s1.charAt(i) - '0';
            int y = s2.charAt(i) - '0';

            sb.append(x ^ y);

        }

        System.out.println(sb.toString());




        sc.close();
    }
}
