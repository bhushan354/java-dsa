import java.util.Scanner;

public class divisor {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
           if(num%i ==0) {
            System.out.println(i);
           }
        }

    } 
}