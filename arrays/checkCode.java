import java.util.*;

public class checkCode {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String S = scanner.next();

        if(S.length() != A+B+1){
            System.out.println("NO");
            return;
        }

        boolean isDigitValid = true;

        for(int i = 0; i < S.length(); i++){
            // if(S.chartAt(A) == "-"){
            //the above string is wrong we should use single quotes here
            if(i == A){
                if(S.charAt(A) != '-'){
                   
                   isDigitValid = false;
                   break;

                }
            } else {
                //below check if the char is digit
                if(!Character.isDigit(S.charAt(i))){

                   isDigitValid = false;
                   break;
                }
            }
        }

        if(isDigitValid){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}