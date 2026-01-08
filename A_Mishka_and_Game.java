
import java.util.Scanner;

public class A_Mishka_and_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int mcount = 0;
        int chCount = 0;
        while (t-- > 0) {
            // Your code for each test case goes here
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                mcount++;
            } else if( a<b) {
                chCount++;
            }

        }

        if (mcount > chCount) {
            System.out.println("Mishka");
        } else if (mcount < chCount) {
            System.out.println("Chris");
        } else {

            System.out.println("Friendship is magic!^^");

        }
        sc.close();
    }
}
