import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        int ans = 0;

        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';

            if (a > b) {
                ans = 1;
                break;
            } else if (a < b) {
                ans = -1;
                break;
            }
           
        }

        System.out.println(ans);
        sc.close();
    }
}
