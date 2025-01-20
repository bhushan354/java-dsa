import java.util.Scanner;

public class replacement {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] numArr = new int[num];

    for (int i = 0; i < num; i++) {
      numArr[i] = scanner.nextInt();
    }

    int[] newArr = new int[num];

    for (int i = 0; i < num; i++) {
      if (numArr[i] > 0) {
        newArr[i] = 1;
      } else if (numArr[i] < 0) {
        newArr[i] = 2;
      } else if (numArr[i] == 0) {
        newArr[i] = 0;
      }
    }

    for (int i = 0; i <  ; i++) {
      System.out.print(newArr[i] + " ");
    }
  }
}
