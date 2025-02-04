import java.util.*;

public class waytoolongword{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[N]; 
        for(int i = 0; i < N; i++){
           strArr[i] = scanner.nextLine();
        }

        for(int i = 0; i < N; i++){
          String word = strArr[i];

          if(word.length() > 10){
            // + "" + this forces java to treat everything as string
            System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));
          } else {
            System.out.println(word);
          }
        }
    }
}