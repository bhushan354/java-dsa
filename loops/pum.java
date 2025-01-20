import java.util.Scanner;

public class PUM{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int currentNum = 1;

        for (int i = 1; i <= num ; i++) {
            System.out.print(currentNum + " ");
            System.out.print((currentNum + 1) + " ");
            System.out.print((currentNum + 2) + " ");
            System.out.println("PUM");

            currentNum += 4;
        }
    }
}