import java.util.Scanner;

public class numAndSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while(true){ // this will keep running till it hits zero
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if(A <= 0 || B <= 0){
                break;
            }

            int max = Math.max(A, B);
            int min = Math.min(A, B);
            int sum = 0;

            StringBuilder output = new StringBuilder();

            for (int i = min; i <= max; i++) {
                 output.append(i).append(" ");
                 sum+=i;
            }

            output.append("sum =").append(sum);
            System.out.println(output);
        }
    }
}