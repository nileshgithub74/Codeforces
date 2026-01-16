
import java.util.Scanner;

public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];

        boolean right = true;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = '#';
                }
            } else {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = '.';
                }

                if (right) {
                    arr[i][m - 1] = '#';
                } else {
                    arr[i][0] = '#';
                }

                right = !right;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j]);
            }

            System.out.println();

        }

        sc.close();
    }
}
