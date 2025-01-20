import java.util.Scanner;

public class sumOdd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int start = Math.min(A, B) + 1;
            int end = Math.max(A, B) - 1;
            int sum = 0;

            for(int j = start; j <= end; j++) {
               if (j % 2 != 0 ){
                sum+=j;
               } 
            }
            System.out.println(sum);
        }
        
    }
}

