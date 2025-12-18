
import java.util.Scanner;

public class SearchEasy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean isHard = false;

        for (int x : arr) {
            if (x == 1) {
                isHard = true;
            }

        }

        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

        sc.close();

    }

}
