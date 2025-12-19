import java.util.Scanner;

public class Minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcase = sc.nextInt();

        while(testcase-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(c == (a+b)){
                System.out.println('+');
            }else{
                System.out.println('-');
            }




        }

        sc.close();


    }
}