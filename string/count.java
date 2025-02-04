import java.util.*;

public class count{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
 
        int sum = 0;
        for(char c : A.toCharArray()){
           if(Character.isDigit(c)){
            int digit = c - '0';
            sum += digit;
           }
        }
        System.out.println(sum);
    }
}