import java.util.Scanner;

public class luckyNumber{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        boolean found = false;

        for (int i = A; i <= B; i++) {
            if(isLuckyNum(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }

    public static boolean isLuckyNum(int n){
        String str = String.valueOf(n);
        char[] charArray = str.toCharArray();

        for(char c : charArray) {
            if (c != '4' && c != '7'){
                return false; //not a lucky number
            }
        }

        return true;
    }
}