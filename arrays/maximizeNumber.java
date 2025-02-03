import java.util.*;

public class maximizeNumber {
    public static void main(String args[]){
          Scanner scanner = new Scanner(System.in);
          int num = scanner.nextInt();

          int[] arr = new int[num];

          for(int i = 0; i < num; i++){
               arr[i] = scanner.nextInt();
          }  

          int operations = 0;
          
        while (true){
            boolean allEven = true;

            for(int i = 0; i < num; i++) {
                if(arr[i] % 2 != 0){
                    allEven = false;
                    break;
                }
            }

            if(allEven){
                for(int i = 0; i < num; i++){
                   arr[i] /= 2;
                }
                operations++;
            } else {
                break;
            }
        }

        System.out.println(operations);
    }
} 