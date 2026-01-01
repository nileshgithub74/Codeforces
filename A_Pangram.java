import java.util.Scanner;

 public class A_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        String string = sc.next().toLowerCase();


        int[] freq = new int[26];

        for(char ch : string.toCharArray()){
            freq[ch-'a']++;

        }


        boolean isPangram = true;
        for(int i =0; i <26; i++){
            if(freq[i] == 0){
                isPangram = false;
                break;
            }
        }

        if(isPangram){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


       




      
        sc.close();
    }
}