import java.util.HashSet;
import java.util.Scanner;

 public class A_Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        int[] arr = {a,b,c,d};
         HashSet<Integer> set = new HashSet<>();

         for(int x : arr){
            set.add(x);
         }
         int result = 4- set.size();
         System.out.println(result);

        sc.close();
    }
}