
import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String stones = sc.next();

        int removals = 0;
        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                removals++;
            }
        }

        System.out.println(removals);

        sc.close();
    }
}
