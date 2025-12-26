import java.util.*;

public class A_Again_Twenty_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(5);
        } else {
            System.out.println(25);
        }

        sc.close();
    }
}
