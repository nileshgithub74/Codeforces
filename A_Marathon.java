import java.util.Scanner;

 public class A_Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            // Your code for each test case goes here
            int  a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(b >a)count++;
            if(c>a) count++;
            if(d > a)count++;

            System.out.println(count);


           
            
        }
        sc.close();
    }
}