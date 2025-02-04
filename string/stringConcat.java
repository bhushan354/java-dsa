import java.util.*;

public class stringConcat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        System.out.println(A.length() + " " + B.length());
        String C = A + B;
        System.out.println(C);

        if(A.length() > 0 && B.length() > 0){
            String SwappedA = B.charAt(0) + A.substring(1);
            String SwappedB = A.charAt(0) + B.substring(1);
            System.out.println(SwappedA + " " + SwappedB);
        }
       
    }
}