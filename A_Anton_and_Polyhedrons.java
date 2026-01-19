
import java.util.Scanner;

public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        while (t-- > 0) {
            // Your code for each test case goes here
            String str = sc.nextLine();

            if (str.equals("Tetrahedron")) {
                sum += 4;
            } else if (str.equals("Cube")) {
                sum += 6;
            } else if (str.equals("Octahedron")) {
                sum += 8;
            } else if (str.equals("Dodecahedron")) {
                sum += 12;

            } else {
                sum += 20;
            }

        }
        System.out.println(sum);
         sc.close();
    }
}
