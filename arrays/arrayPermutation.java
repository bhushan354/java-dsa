import java.util.*;

public class arrayPermutation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arrOne = new int[num];
        int[] arrTwo = new int[num];

        for (int i = 0; i < num; i++){
            arrOne[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++){
            arrTwo[i] = scanner.nextInt();
        }

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        boolean isPer = true;

        for (int i = 0 ; i < num; i++){
            if(arrOne[i] != arrTwo[i]){
                isPer = false;
            }
        }

        if(isPer){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}