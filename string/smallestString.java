import java.util.*;

public class smallestString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.compareTo(str2) <= 0){
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }
}