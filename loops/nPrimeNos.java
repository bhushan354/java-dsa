import java.util.Scanner;

public class nPrimeNos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
          if (n <= 1) {
            return false;
          }

          for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
          }
          return true;
    }
}