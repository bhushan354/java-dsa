import java.util.*;

public class palindromArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] originalArray = new int[num];

        for (int i = 0; i < num; i++){
           originalArray[i] = sc.nextInt();
        }

        int[] reversedArr = new int[num];

        for (int i =0; i < num; i++){
            reversedArr[i] = originalArray[num - 1 - i];
        }

        boolean isPalindrome = false;
        
        for (int i = 0; i < num; i++){
            if (originalArray[i] == reversedArr[i]){
                 isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}