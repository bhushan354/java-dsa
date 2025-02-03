import java.util.*;

public class minMax {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimum){
                arr[i] = maximum;
            } else if(arr[i] == maximum){
                arr[i] = minimum;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
    }


}