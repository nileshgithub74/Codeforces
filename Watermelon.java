
import java.util.Scanner;

class Watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input > 2 && input % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}
