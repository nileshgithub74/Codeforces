import java.util.Scanner;

 public class A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int result = (int) Math.ceil(t/5.0);
        System.out.println(result);
       
        sc.close();
    }
}