import java.util.*;

public class subsequence{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int[] arr1= new int[A];
        int B = scanner.nextInt();
        int[] arr2= new int[B];

        for(int i = 0; i < A; i++){
            arr1[i] = scanner.nextInt();
        }

        for(int i = 0; i < B; i++){
            arr2[i] = scanner.nextInt();
        }

        int i = 0;
        int j = 0;

        while (i < A && j < B){
            if(arr1[i] == arr2[j]){
                j++;
            }
            i++;
        }

        if(j == B){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

/* 

example Input :
A = [1, 8, 4, 7, 5, 2, 7]
B = [4, 5, 7, 2]


Step-by-Step Execution:

Start with i = 0, j = 0.

arr1[i] = 1, arr2[j] = 4.
They don’t match! Move i to 1 (i++).
Now i = 1, j = 0.

arr1[i] = 8, arr2[j] = 4.
They don’t match! Move i to 2 (i++).
Now i = 2, j = 0.

arr1[i] = 4, arr2[j] = 4.
They match! Move j to 1 (j++), and move i to 3 (i++).
Now i = 3, j = 1.

arr1[i] = 7, arr2[j] = 5.
They don’t match! Move i to 4 (i++).
Now i = 4, j = 1.

arr1[i] = 5, arr2[j] = 5.
They match! Move j to 2 (j++), and move i to 5 (i++).
Now i = 5, j = 2.

arr1[i] = 2, arr2[j] = 7.
They don’t match! Move i to 6 (i++).
Now i = 6, j = 2.

arr1[i] = 7, arr2[j] = 7.
They match! Move j to 3 (j++), and move i to 7 (i++).
End Condition:

i == A (pointer i reached the end of A but j < B).
Print NO.


*/