import java.util.Scanner;

 public class A_Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        String t = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        
        String reversed = sb.reverse().toString();
        
        if(reversed.equals(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        


        
        sc.close();
    }
}