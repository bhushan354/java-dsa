import java.util.Scanner;

public class positions {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] numArr = new int[num];

    for (int i =0; i < num; i++){
        numArr[i] = scanner.nextInt();
    }
    
    for (int i = 0; i < num; i++){
        if (numArr[i] <= 10){

        System.out.println("A[" + i + "] = " + numArr[i]);
        }
    }

    
    }
}