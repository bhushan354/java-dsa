import java.util.*;

public class mirrorArray{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[][] arr = new int[num1][num2];

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = num2 - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
