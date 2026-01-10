
import java.util.Scanner;

public class A_Sereja_and_Dima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int i = 0;
        int j = n - 1;
        int seerjasum = 0;
        int dimasum = 0;
        boolean serjaturn = true;
        
        while (i <= j) {
            int sum = 0;
            if (arr[i] > arr[j]) {
                sum += arr[i];
                i++;

            } else {
                sum += arr[j];
                j--;
            }

            if (serjaturn) {
                seerjasum += sum;
            }else
            {
                dimasum += sum;
            }

            serjaturn = !serjaturn;

        }

        System.out.println(seerjasum + " " + dimasum);

        sc.close();
    }
}
