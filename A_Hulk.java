import java.util.Scanner;

public class A_Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append("I ");
            if (i % 2 == 1)
                sb.append("hate");
            else
                sb.append("love");

            if (i < n)
                sb.append(" that ");
        }

        sb.append(" it");
        System.out.print(sb.toString());

        sc.close();
    }
}
