import java.util.Scanner;

public class sumOfDigits {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int totalSum = 0;

        for (int i = 1; i <= N; i++){
            int digitSum = sumOfDigitFunction(i);

            if(digitSum >= A && digitSum <= B){
                 totalSum+= i ;
            }
        }

        System.out.print(totalSum);
    }

    public static int sumOfDigitFunction(int checkNum){
        int sum = 0;
        while(checkNum > 0) {
            int lastDigit = checkNum % 10; // Get the last digit
            sum += lastDigit;             // Add it to the sum
            checkNum = checkNum / 10;     // Remove the last digit
        }

        return sum;
    }
}