import java.util.Scanner;

 public class A_Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String original  =  "codeforces";
        char[] originalg  = original.toCharArray();
        while (t-- > 0) {
            // Your code for each test case goes here
            String input  = sc.next().toLowerCase();

            char[] inputg = input.toCharArray();


           
            
            int count = 0;
             for(int i =0; i < inputg.length; i++){
                if(inputg[i] != originalg[i]){
                    count++;
                }
                 
             }

              System.out.println(count);
             
          




        }
        sc.close();
    }
}