import java.util.*;

// this code gives wrong answer on test 48
public class fibonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int fib1 = 0;
        int fib2 = 1;

        if (num == 1) {
            System.out.println(fib1);
        } else if (num == 2) {
            System.out.println(fib2);
        } else {
            for (int i = 3; i <= num; i++) {
                int temp = fib1 + fib2;
                fib1 = fib2;
                fib2 = temp;
            }
            System.out.println(fib2);
        }
    }
}
