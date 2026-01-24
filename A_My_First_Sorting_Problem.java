import java.util.Scanner;

 public class A_My_First_Sorting_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int a  =sc.nextInt();
            int b = sc.nextInt();

            if(a>b){
                System.out.print(b+" "+a);
            }else{
                System.out.print(a+ " "+b);
            }
            System.out.println();
        }
        sc.close();
    }
}