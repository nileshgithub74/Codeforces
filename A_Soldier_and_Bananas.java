import java.util.Scanner;

 public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();
        int moneyHave = sc.nextInt();

        int numberofBanana = sc.nextInt();
         
        int sum =0;
        for(int i =1; i <=numberofBanana; i++){
            sum += cost * i;
        }


        if(sum > moneyHave){
            System.out.println(sum- moneyHave);
        }else{
            System.out.println("0");
        }
       


        sc.close();
    }
}