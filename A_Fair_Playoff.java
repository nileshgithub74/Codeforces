
import java.util.Scanner;

public class A_Fair_Playoff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here

            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }

            int max1 = Math.max(arr[0], arr[1]);
            int max2 = Math.max(arr[2], arr[3]);

            int min = Math.min(max1, max2);
            int max  = Math.max(max1, max2);

            boolean isfound = false;
            for (int x : arr) {
                if (x > min && x != max) {
                    isfound = true;
                    break;
                }
            }

            if (isfound) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
        sc.close();
    }
}
