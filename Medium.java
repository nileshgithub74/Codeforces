
import java.util.*;

public class Medium {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testcasee  = sc.nextInt();

        while(testcasee-- >0){
            int[] arr = new int[3];

            for(int i =0; i <3; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            
            int result =arr[1];

            System.out.println(result);





        }

        sc.close();
    }
}
