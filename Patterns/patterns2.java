import java.util.*;
import java.util.Scanner;

public class patterns2 {

    // ulta pyramid
    // public static void main (String args[]) {
      
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n = scanner.nextInt();

    //     for (int i = n; i >= 1; i--) {

    //         for (int j = 1; j <= i; j++) {
    //            System.out.print("*");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // output

    // Enter a number
    // 10
    // ********** 
    // ********* 
    // ******** 
    // ******* 
    // ****** 
    // ***** 
    // **** 
    // *** 
    // ** 
    // * 

 // *****************************************************************************************************************

    // que : inverted half pyramid rotated by 180 degrees

    // public static void main (String args[]) {
      
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n = scanner.nextInt();

    //     for (int i = 1; i <= n; i++) {

    //        // inner loop -> space print
    //        for (int j = 1; j <= n-i; j++) {
    //         System.out.print(" ");
    //        }

    //        // inner loop -> star print
    //        for (int j = 1; j <= i; j++) {
    //         System.out.print("*");
    //        }

    //        System.out.println(" ");
    //     }
    // }

    //   output :

    //     Enter a number
    // 5
    //     * 
    //    ** 
    //   *** 
    //  **** 
    // ***** 

 // *****************************************************************************************************************

 //numbers upside down
    // public static void main (String args[]) {
      
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n = scanner.nextInt();

    //     for (int i = n; i > 0; i--) {

    //        for (int j = 1; j <= i; j++) {

    //         System.out.print(j + "");
    //        }
    //        System.out.println();
    //     }
    // }


    // output 
    // Enter a number
    // 5
    // 12345
    // 1234
    // 123
    // 12
    // 1
    

   // *****************************************************************************************************************

   // floyads triangle  

   //  public static void main (String args[]) {
      
   //      Scanner scanner = new Scanner(System.in);
   //      System.out.println("Enter a number");
   //      int n = scanner.nextInt();
   //      int number = 1;

   //      for (int i = 1; i <= n; i++) {

   //         for (int j = 1; j <= i; j++) {

   //          System.out.print(number + " ");
   //          number++;
   //         }
   //         System.out.println();
   //      }
   //  }

   //  output 

   //  Enter a number
   //    6
   //    1 
   //    2 3 
   //    4 5 6 
   //    7 8 9 10 
   //    11 12 13 14 15 
   //    16 17 18 19 20 21 


   // *****************************************************************************************************************


   // print triangle of 0 and 1

   //  public static void main (String args[]) {
      
   //      Scanner scanner = new Scanner(System.in);
   //      System.out.println("Enter a number");
   //      int n = scanner.nextInt();
   //    //   int number = 1;

   //      for (int i = 1; i <= n; i++) {

   //         for (int j = 1; j <= i; j++) {
   //          int sum = i + j;
   //          if (sum % 2 == 0) { //even
   //             System.out.print("1 ");
   //          } else {
   //             System.out.print("0 ");
   //          }
            
   //       }
   //       System.out.println();
   //      }
   // }

   // output 

   // Enter a number
   // 6
   // 1 
   // 0 1 
   // 1 0 1 
   // 0 1 0 1 
   // 1 0 1 0 1 
   // 0 1 0 1 0 1 


   // *****************************************************************************************************************

}
