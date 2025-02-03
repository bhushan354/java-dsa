 import java.util.*;
 
public class luckyArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
 
        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }
 
        int minimum = Integer.MAX_VALUE;
        int occurance = 0;
        
        for (int i = 0 ; i < numArr.length; i++){
            if(numArr[i] < minimum){
                minimum = numArr[i];
            }
        }
 
 
 
        for(int i =0; i < numArr.length; i++){
            if(numArr[i] == minimum){
                occurance+=1;
            }
        }
 
        if (occurance % 2 == 0){
            System.out.println("Unlucky");
        } else {
             System.out.println("Lucky");
        }
 
 
    }
}