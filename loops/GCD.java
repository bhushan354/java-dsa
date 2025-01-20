import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       int num = scanner.nextInt(); 
       int num2 = scanner.nextInt();

       int greatestDivisor = 1;
        
       // Iterate up to the smaller of num and num2
       for(int i = 1; i <= Math.min(num, num2); i++) {
            if(num % i == 0 && num2 % i == 0) {
               greatestDivisor = i;
            }
       }
       System.out.println(greatestDivisor);
    }
}