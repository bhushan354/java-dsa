import java.util.*;

public class matrix {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[][] matrix = new int[num][num];

        for (int i = 0; i < num; i++){
            for(int j = 0 ; j < num; j++) {
               matrix[i][j] = scanner.nextInt();
            }
        }

        int oneDiagonal = 0;
        int anotherDiagonal = 0;

        for(int i = 0; i < num; i++){
            oneDiagonal += matrix[i][i];
            anotherDiagonal += matrix[i][num - i - 1];// Secondary diagonal (top-right to bottom-left)
        }

        // below thing is wrong way to find the secondary diagonal;
        // for(int i = 0; i < num; i++){
        //   for(int j = num -1; j >= 0; j--){
        //     anotherDiagonal += matrix[i][j];
        //   }
        // }

        int finalSum = Math.abs(oneDiagonal - anotherDiagonal);
        System.out.println(finalSum);
    }

}