
import java.util.Scanner;

public class A_Night_at_the_Museum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();



        int sum = 0;
        int curr =0;

        for(int i=0; i <s.length(); i++){
            int x = s.charAt(i)-'a';
            int diff  = Math.abs(curr-x);
            sum += Math.min(diff,26- diff);
            curr = x;
        }
        

        System.out.println(sum);

        sc.close();
    }
}
