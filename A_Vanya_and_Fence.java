import java.util.Scanner;

 public class A_Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h = sc.nextInt();

        int count =0;

        for(int i =0; i <n; i++){
            int values = sc.nextInt();

            if(values >h){
                count = count +2;
            }else{
                count++;
            }
        }



    System.out.println(count);

       












        sc.close();
    }
}