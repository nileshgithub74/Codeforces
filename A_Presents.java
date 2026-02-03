import java.util.HashMap;
import java.util.Scanner;

 public class A_Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         int[] arr =new int[t];

         for(int i=0;i<t; i++){
            arr[i] = sc.nextInt();
         }

         HashMap<Integer, Integer> map = new HashMap();

         for(int i=0; i<t;i++){
            map.put(arr[i], i+1);
         }

         for(int i=1; i<=t; i++){
            System.out.print(map.get(i)+ " ");
         }




        sc.close();
    }
}