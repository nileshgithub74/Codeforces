import java.util.*;

 public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] ch = s.split("\\+");

        Arrays.sort(ch);

        String result = String.join( "+", ch);
System.out.println(result);






        




        sc.close();
    }
}