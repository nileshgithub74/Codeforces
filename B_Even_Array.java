import java.util.Scanner;

 public class B_Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int n = sc.nextInt();

            int[] arr  = new int[n];
            for(int i =0; i <n; i++){
                arr[i] = sc.nextInt();
            }



            
        }
        sc.close();
    }
}