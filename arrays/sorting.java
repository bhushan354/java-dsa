import java.util.*;

public class sorting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];

        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }
        //bubble sort
        for (int i = 0; i < num; i++){
            //pushing the largest element to the end by checking adjecent elements and doing swapping
            for (int j = 0; j < num - 1 - i; j++){
                if(numArr[j] > numArr[j+1]){
                   int temp = numArr[j];
                   numArr[j] = numArr[j+1];
                   numArr[j+1] = temp; 
                }
            }
        }

        for (int i = 0; i < num; i++){  
            System.out.print(numArr[i] + " ");
        }
    }
}