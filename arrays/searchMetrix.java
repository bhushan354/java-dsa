import java.util.*;

public class searchMetrix {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[][] arr= new int[A][B];

        for(int i = 0 ; i < A; i++){
            for (int j = 0 ; j < B; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int C = scanner.nextInt();
        boolean idFound = false;
        for(int i = 0 ; i < A; i++){
            for (int j = 0 ; j < B; j++){
                if(arr[i][j]  == C){
                   idFound = true;
                }
            }
        }

        if(idFound) {
            System.out.println("will not take number");

        } else{
            System.out.println("will take number");
        }


    }
}