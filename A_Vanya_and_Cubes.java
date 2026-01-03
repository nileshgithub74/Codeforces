
import java.util.Scanner;

public class A_Vanya_and_Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalsum =0;
        int count =0;
        int sum =0;

        while(totalsum <=  n){
            count++;
            sum  = sum + (count );
            totalsum += sum;

            if(totalsum >n){
                break;
            }
        }


        System.out.println(count-1);
      









        sc.close();
    }
}
