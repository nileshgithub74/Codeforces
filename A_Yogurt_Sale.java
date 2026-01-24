import java.util.Scanner;

 public class A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans =0;
        while (t-- > 0) {
            // Your code for each test case goes here
            int n =sc.nextInt();
            int a = sc.nextInt();
            int b  = sc.nextInt();

            int reminder = n/2;

            
             ans = Math.min( a* n,  Math.min(b * reminder, reminder * a));
             System.out.println(ans);
 
          

        }
        sc.close();
    }
}