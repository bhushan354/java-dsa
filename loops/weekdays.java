import java.util.Scanner;

public class weekdays {
    public static void main(String args[]) {
        solution("Sun", 1);
    }

    public static void solution(String S, int K) {
        Scanner scanner = new Scanner(System.in);

        String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int currentIndex = 0;

        for (int i =0; i < weekdays.length; i++){
             if(weekdays[i].equals(S)){
                currentIndex = i;
                break;
             }
        }

        int newIndexOfDay = (currentIndex + K) % 7; //here the modulo will give us the index at which the next day will be there after K days

        System.out.println(weekdays[newIndexOfDay]);
    }
}