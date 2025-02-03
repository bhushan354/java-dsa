 import java.util.*;
 
public class luckyArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
     //   StringBuilder digit = new StringBuilder();
        
        String digit = sc.next();
         
        int sum = 0;
        
        for (int i =0; i < num; i++){
         sum += digit.charAt(i) - '0';
        }
         
         System.out.println(sum);
    }
}