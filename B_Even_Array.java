
import java.util.Scanner;

public class B_Even_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int length = sc.nextInt();

            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();

            }

            int evenIndexCount = 0;
            int oddIndexCount = 0;
            int n = arr.length;

            for (int i = 0; i < n;
                    i++) {
                if (i % 2 == 0) {
                    if (arr[i] % 2 != 0) {
                        evenIndexCount++;
                    }
                } else if (i % 2 != 0) {
                    if (arr[i] % 2 == 0) {
                        oddIndexCount++;
                    }
                }
            }

            if (oddIndexCount != evenIndexCount) {
                System.out.println("-1");
            } else {
                System.out.println(oddIndexCount);
            }

        }
        sc.close();
    }
}
