import java.util.*;

public class subString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int index = str.indexOf('\\');

        System.out.println(str.substring(0, index));
    }
}