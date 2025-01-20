import java.util.Scanner;

public class lowNumber {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] numArr = new int[num];

    for (int i =0; i < num; i++){
        numArr[i] = scanner.nextInt();
    }

    int lowest = numArr[0];
    int lowIndex = 1;
    
    for (int i = 0; i < num; i++){
        if(numArr[i] < lowest){
            lowest = numArr[i];
            lowIndex = i+1;
        }
    }
    System.out.println(lowest + " " + lowIndex);
  }
}

// import java.util.Scanner;

// public class lowNumbers {
//   public static void main(String args[]) {
//     Scanner scanner = new Scanner(System.in);
//     int num = scanner.nextInt();
//     int[] numArr = new int[num];

//     for (int i =0; i < num; i++){
//         numArr[i] = scanner.nextInt();
//     }
//   }
// }