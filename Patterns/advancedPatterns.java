import java.util.*;
import java.util.Scanner;

public class advancedPatterns {

    // printing butterfly pattern
    // public static void main(String args[]) {

    //     int n = 5;

    //     // upper half
    //     for (int i = 1; i <= n; i++) {
    //         // 1st part
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         // spaces
    //         int spaces = 2 * (n - i);
    //         for (int j = 1; j <= spaces; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2nd part
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    //     //lower half
    //     for (int i = n; i >= 1; i--) {
    //         // 1st part
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         // spaces
    //         int spaces = 2 * (n - i);
    //         for (int j = 1; j <= spaces; j++) {
    //             System.out.print(" ");
    //         }

    //         // 2nd part
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    // }

    // output

    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *


    // *****************************************************************************************************************

    // printing rhombus

    // public static void main(String args[]) {
    //   Scanner scanner = new Scanner(System.in);
     
    //   int n = 5;
     

    //   for (int i = 1; i <= n; i ++) {

    //     //spaces

    //     int spaces = n-i;
    //     for (int j =  1; j <= spaces; j++){
    //         System.out.print(" ");
    //     }

    //     //stars 
    //     for (int j = 1; j <= n; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    // }

    // output

    //     *****
    //    *****
    //   *****
    //  *****
    // *****


    // *****************************************************************************************************************

    // number pyramid

    // public static void main(String args[]) {
      
    //   int n = 5;

    //   for (int i = 1; i <= n; i ++) {

    //     // spaces
    //     int spaces = n-i;
    //     for (int j =  1; j <= spaces ; j++) {
    //         System.out.print(" ");
    //     }

    //     // printing row number , row number of times
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print(i + " ");
    //     }

    //     System.out.println();
    //   }
      

    // }

    // output

    //      1 
    //     2 2 
    //    3 3 3 
    //   4 4 4 4 
    //  5 5 5 5 5 

    // *****************************************************************************************************************
}
