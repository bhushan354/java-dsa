import java.util.*;

public class goodorbad{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < N; i++){
            String S = scanner.nextLine();

            if( S.contains("010") || S.contains("101")){
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
        
    }
}