import java.util.Scanner;

public class summation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long summation = 0;

        for (int i = 0 ; i < N; i++) {
           long num = scanner.nextInt();
           summation+=num;
        }
        long finalSummation = Math.abs(summation);
        System.out.println(finalSummation);
    }
}