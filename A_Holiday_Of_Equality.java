
import java.util.Scanner;

public class A_Holiday_Of_Equality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }

        }

        int result = 0;
        for (int nums : arr) {
            result = result + (max - nums);
        }

        System.out.println(result);

        sc.close();
    }
}
