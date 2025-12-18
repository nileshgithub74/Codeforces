
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.next();

       int n = words.length();
       int count =0;
        for(char c : words.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }



        int upperCaseCount = count;
        int loweCaseCount = n-count;

        if(upperCaseCount > loweCaseCount){
           System.out.println(words.toUpperCase());
        }else{
            System.out.println(words.toLowerCase());
        }

        sc.close();



    }}
    

