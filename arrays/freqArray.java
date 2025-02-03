import java.util.*;

public class freqArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] frequency = new int[num2 + 1]; //1 based indexing

        for (int i = 0; i < num1; i++){
            int input = scanner.nextInt();
            frequency[input]++;
        }

        for (int i = 1; i <= num2; i++){
            System.out.println(frequency[i]);
        }
        
    }
}


/*

Example Walkthrough:

Input:

10 5
1 2 3 4 5 3 2 1 5 3

Execution:

num1 = 10, num2 = 5.
frequency array: [0, 0, 0, 0, 0, 0].
Frequency Calculation:

Process each number in the array A:
1: frequency[1]++ → [0, 1, 0, 0, 0, 0]
2: frequency[2]++ → [0, 1, 1, 0, 0, 0]
3: frequency[3]++ → [0, 1, 1, 1, 0, 0]
4: frequency[4]++ → [0, 1, 1, 1, 1, 0]
5: frequency[5]++ → [0, 1, 1, 1, 1, 1]
3: frequency[3]++ → [0, 1, 1, 2, 1, 1]
2: frequency[2]++ → [0, 1, 2, 2, 1, 1]
1: frequency[1]++ → [0, 2, 2, 2, 1, 1]
5: frequency[5]++ → [0, 2, 2, 2, 1, 2]
3: frequency[3]++ → [0, 2, 2, 3, 1, 2].

 */