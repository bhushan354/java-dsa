import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int num = scanner.nextInt();

       for (int i = 1; i <= 12; i++) {
        var multiplication = num * i;
        System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + multiplication);
       }
    }
}
