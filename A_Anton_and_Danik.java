import java.util.Scanner;

 public class A_Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        String s = sc.next().toLowerCase();

        int[] freq  = new int[26];

        for(char ch  : s.toCharArray()){
            freq[ch-'a']++;    
        }

         
        if(freq[0] > freq[3]){
            System.out.println("Anton");
        }else if(freq[0] < freq[3] ){
            System.out.println("Danik");

        }else{
            System.out.println("Friendship");
        }








       
        sc.close();
    }
}