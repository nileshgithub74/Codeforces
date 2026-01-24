import java.util.Scanner;

 public class A_Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            String input =sc.next().toUpperCase();
            int n = input.length();


             int count =0;
   
             for(int i =0; i < n; i++){
                char ch = input.charAt(i);
                if(ch == 'A'){
                    count++;
                }
             }

             int Acount = count;
             int Bcount = n-count;

             if(Acount > Bcount){
                System.out.println("A");
             }else{
                System.out.println("B");
             }


        }
        sc.close();
    }
}