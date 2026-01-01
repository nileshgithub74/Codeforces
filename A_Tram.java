
import java.util.Scanner;

public class A_Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total = 0;
        int maxSum = 0;
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            total += y - x;
            maxSum = Math.max(total, maxSum);

        }

        System.out.println(maxSum);



        sc.close(); 
    }
}
