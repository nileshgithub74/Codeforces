import java.util.Scanner;

public class Beautiful {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];


        for (int i = 0; i < 5; i++) {
            for(int j =0; j <5; j++){
                arr[i][j] = sc.nextInt();

            }
            
        }







        int result =0;

         outerLoop:
        for(int i =0; i <5; i++){
            for(int j =0;j<5; j++){
                if(arr[i][j] == 1){
                    result = Math.abs(i-2)+ Math.abs(j-2);
                    break outerLoop ;
                }
            }
            
        }

        System.out.println(result);



        sc.close();
        
    }
    
}
