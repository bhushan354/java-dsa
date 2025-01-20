import java.util.Scanner;

public class factorial {
    public static void main(String[] ags) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int[] array = new int[a];

       for (int i = 0; i < a; i++) {
        array[i] = scanner.nextInt();
       }
       long[] finalFactorial = new long[a];
       for (int i = 0; i < a; i++) {

        int num = array[i];
        
        long factorial = 1;
        
        for (int j = 1; j <= num; j++) {
            factorial *= j;
        }
        finalFactorial[i] = factorial;
       }
       for (int i = 0 ; i < a; i++) {
        System.out.println(finalFactorial[i]);
       }
       
    }
}