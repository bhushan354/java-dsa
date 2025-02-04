import java.util.*;

public class newString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();

        System.out.println(firstLine.length() + " " + secondLine.length());
        System.out.println(firstLine + " " + secondLine);
    }
}