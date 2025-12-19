
import java.util.Scanner;

public class A_Word_Capitalization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();

        char first = input.charAt(0);
        String remaining = input.substring(1, n);

        String result = Character.toString(first).toUpperCase() + remaining;

        System.out.println(result);

        sc.close();
    }
}
