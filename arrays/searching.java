import java.util.Scanner;

public class searching {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] allInput = new int[input];

        for(int i = 0; i < input; i++) {
            allInput[i] = scanner.nextInt();
        }

        int X = scanner.nextInt();
        int firstPosition = -1; //we need first occurance
        int count = 0;

        for (int i = 0; i < input; i++){
            if(X == allInput[i]){
                count++;
                if (firstPosition == -1) {
                    firstPosition = i;
                }
            }
        }

        if (count == 1){
          System.out.println(firstPosition);
        } else if( count == 2) {
          System.out.println("0");
        } else if( count == 0) {
            System.out.println("-1");
        } else {
          System.out.println(firstPosition);
        }
    }
}