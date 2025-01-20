import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            arr[i] = b;
        }

        var maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxNum < arr[i]) {
                maxNum = arr[i];
            } 
        }
        System.out.println(maxNum);
    }
}