import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number; // Store the original number
        int reverse = 0;  

        // // this is reversing number using while loop
        // while(number != 0) {  
        // int remainder = number % 10;  //gets last number
        // reverse = reverse * 10 + remainder; // Build the reversed number
        // number /= 10; //removes the last number
        // }

        // this is reversing number using for loop, there is no initial condition here
        for (; number != 0; number /= 10) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
        }

        // System.out.println("The reverse of number is: " + reverse);  

        /* also we are modifing the original 'int number' hence we have declared
        'int originalNumber' for last comparison */
        if (originalNumber == reverse) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
        }
    }
} 

// Initially, reverse = 0
// When remainder = 4, reverse = 0 * 10 + 4 = 4
// Next, remainder = 3, reverse = 4 * 10 + 3 = 43
// Then, remainder = 2, reverse = 43 * 10 + 2 = 432
// Finally, remainder = 1, reverse = 432 * 10 + 1 = 4321



//correct code , the above code is also correct but it didnt pass one test case
// import java.util.Scanner;

// public class onePrime {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();

//         if (num <= 1) {
//             System.out.println("NO");
//             return;
//         }

//         boolean isPrime = true; // Assume the number is prime initially

//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) {
//                 System.out.println("NO");
//                 isPrime = false; // Mark as not prime
//                 break; // Exit the loop
//             }
//         }

//         if (isPrime) {
//             System.out.println("YES"); // Print YES only if no divisor was found
//         }
//     }
// }
