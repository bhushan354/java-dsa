import java.util.Scanner;

public class onePrime {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if (num <= 1) {
      System.out.println("NO");
      return;
    }

    for (int i = 2; i < num; i++) {

      if (num % i == 0) {
        System.out.println("NO");
        return; //this will return out of programme(main function) not just out of loop
        // if we want to exit out of loop only we will use 'break;' method
      }
    }
    System.out.println("YES");
  }
}
