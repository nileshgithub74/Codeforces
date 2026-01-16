import java.util.Scanner;

 public class A_Creating_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            String a= sc.next().toLowerCase();
            String b  = sc.next().toLowerCase();

             char[] str= a.toCharArray();
             char[] str2 = b.toCharArray();

             char temp = str[0];
              str[0] = str2[0];
              str2[0] = temp;

              String s1= new String(str);
              String s2 = new String(str2);
              

            System.out.println(s1 + " " + s2);


             
            
            
        }
        sc.close();
    }
}