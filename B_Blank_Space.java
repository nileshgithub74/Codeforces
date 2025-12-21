
import java.util.Scanner;

public class B_Blank_Space {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxCount = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0){
                    count++;
                    maxCount = Math.max(count, maxCount);
                }else{
                    count = 0;
                }
               
            }

            System.out.println(maxCount);

        }
        sc.close();
    }
}
