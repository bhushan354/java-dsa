import java.util.*;

public class conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        S = S.replace(',' , ' ');

        StringBuilder newString = new StringBuilder();

        for(char c : S.toCharArray()){
            if(Character.isLowerCase(c)){
                newString.append(Character.toUpperCase(c));
            } else if(Character.isUpperCase(c)){
                newString.append(Character.toLowerCase(c));
            } else {
                newString.append(c);
            }
        }

        System.out.println(newString);
    }
}