
import java.util.HashSet;
import java.util.Scanner;

public class A_Beautiful_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (true) {
            n++;

            String str = String.valueOf(n);

            HashSet<Character> set = new HashSet<>();

            for (char ch : str.toCharArray()) {

                set.add(ch);

            }

            if(set.size() == 4){
                System.out.println(n);
                break;
            }

        }

        sc.close();
    }
}
