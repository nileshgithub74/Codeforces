
// import java.util.Scanner;

// public class IQTest {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int evenCount = 0;
//         int oddCount = 0;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] % 2 == 0) {
//                 evenCount++;
//             } else {
//                 oddCount++;
//             }

//         }
//         int index = 0;
//         if (evenCount == 1) {
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] % 2 == 0) {
//                     index = i;
//                     break;
//                 }
//             }

//         }

//         if (oddCount == 1) {
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] % 2 != 0) {
//                     index = i;
//                     break;
//                 }
//             }

//         }

//         System.out.println(index + 1);

//         sc.close();

//     }

// }
