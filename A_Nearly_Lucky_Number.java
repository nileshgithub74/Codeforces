
import java.util.*;

public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String str = String.valueOf(n);
        

        boolean isfound = true;
        for(char ch : str.toCharArray()){
            int digit = ch-'0';

            if(digit != 4  digit != 7){
               isfound = false;
               break;
            }
        }
         

        if(isfound){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        

      

        sc.close();
    }
}
