import java.util.Scanner;

 public class A_Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limakAge = sc.nextInt();
        int bobAge = sc.nextInt();

        int count =0;

        while(  limakAge  <= bobAge){
            count++;

            limakAge = 3 * limakAge;
            bobAge =  2 * bobAge;
        }

        System.out.println(count);


       
        sc.close();
    }
}