import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while(testcase-- >0){
            int ratings = sc.nextInt();


            if(ratings >= 1900){
                System.out.println("Division 1");
            }else if(ratings >=1600 && ratings <=1899){
                System.out.println("Division 2");
            }else if(ratings >= 1400 && ratings <= 1599){
                System.out.println("Division 3");
            }else if(ratings <= 1399){
                System.out.println("Division 4");
            }
        }

        sc.close();


    }
    
}
