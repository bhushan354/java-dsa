import java.util.Scanner;

public class numberHistogram {
    public static void main(String args[]) {
          Scanner scanner = new Scanner(System.in);

          var symbol = scanner.nextLine();
          int num = scanner.nextInt();
          int[] numArray = new int[num];

          for (int i = 0; i < num; i++) {
            numArray[i] = scanner.nextInt();
          }

          for (int i = 0 ; i < numArray.length; i++){
             for (int j = 1; j <= numArray[i]; j++){
                System.out.print(symbol);
             }
             System.out.println();
          }
    }
}