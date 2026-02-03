import java.util.Scanner;

 public class A_Trippi_Troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            // Your code for each test case goes here
            String str = sc.nextLine();


    
             String ans = "";
              ans += str.charAt(0);

              for(int i =1; i<str.length(); i++){
                if( str.charAt(i)== ' ' && i+1 < str.length()){
                    ans += str.charAt(i+1);
                }
              }

           System.out.println(ans);

       
        }
        sc.close();
    }
}