import java.util.*;

public class goodorbad{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();


        String reversed = "";

        for(int i = S.length() - 1; i >= 0; i--){
            reversed += S.charAt(i);
        }

        System.out.println(reversed);
        
    }
}