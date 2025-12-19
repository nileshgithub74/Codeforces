
import java.util.Scanner;

class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();
        int n = input.length();

        int[] freq = new int[26];
        int count = 0;
        for (int i = 0; i < n; i++) {
            freq[input.charAt(i) - 'a']++;

        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;

            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
