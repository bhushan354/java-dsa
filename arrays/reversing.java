import java.util.Scanner;

public class reversing {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] numArr = new int[num];

    for (int i =0; i < num; i++){
        numArr[i] = scanner.nextInt();
    }

    int[] reversedArr = new int[num];

    for (int i = 0; i < num; i++){
        reversedArr[i] = numArr[num - 1 - i];
    }

    for (int i =0; i < num; i++){
        System.out.print(reversedArr[i] + " ");
    }
  }
}