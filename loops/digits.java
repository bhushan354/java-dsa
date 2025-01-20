import java.util.Scanner;

public class digits {

// // this implementation removes the trailing zeros
    // public static void main(String args[]) {
    //     Scanner scanner = new Scanner(System.in);

    //     int num = scanner.nextInt();
    //     int[] numArr = new int[num];

    //     for (int i = 0; i < num; i++) {
    //       numArr[i] = scanner.nextInt();
    //     }

    //     int[] reversedNum = new int[num];

    //     for (int i = 0; i < numArr.length; i++) {
    //         for (; numArr[i] != 0; numArr[i] /= 10) {
    //             int localNum = numArr[i];
    //             int lastNum = localNum % 10;
    //             reversedNum[i] = reversedNum[i] * 10 + lastNum; 
    //         }
    //     }

    //     for(int i = 0; i < reversedNum.length; i++) {

    //         String str = String.valueOf(reversedNum[i]);
    //         char[] number = str.toCharArray();

    //         for (char c : number){
    //           System.out.print(c + " ");
    //         }
    //         System.out.println();
    //     }
    // }


// in this implementation i have converted the numbers to string and directly printing them
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num]; 

        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < numArr.length; i++) {
            String str = String.valueOf(numArr[i]);
            char[] number = str.toCharArray();
            
            for (int j = number.length - 1 ; j >= 0 ; j--){
                System.out.print(number[j] + " ");
            }
            System.out.println(" ");
        }
    }
}