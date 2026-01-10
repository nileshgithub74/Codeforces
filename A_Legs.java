import java.util.Scanner;

 public class A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int n = sc.nextInt();
            int ans = Integer.MAX_VALUE;

            int low  = 1;
            int high = n;
            while(low <= high){
                int mid = (low + high)/2;
                if( ans < mid){
                    ans = mid;
                }

                
            }
        }
        sc.close();
    }
}