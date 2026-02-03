import java.util.*;

 public class A_Spell_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int n = sc.nextInt();
            String str = sc.next();

            if(n != 5){
                System.out.println("NO");
                continue;
            }


            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String st = new String(ch);


            if(st.equals("Timru")){
            System.out.println("YES");

            }else{
                System.out.println("NO");
            }




        
            
        }
        sc.close();
    }
}