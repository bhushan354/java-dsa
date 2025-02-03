import java.util.*;

public class smallestPair {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        

// Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

// Initialize the minimum value to a large number
            int minValue = Integer.MAX_VALUE;


            for (int i = 0; i < N -1; i++){
                for(int j = i+1; j < N; j++){
                     int currentValue = A[i] + A[j] + (j - i);
                     if(currentValue < minValue){
                        minValue = currentValue;
                     }
                }
            }

            

            System.out.println(minValue);

        }
    }
}

//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/I

// A[i] + A[j] + (j - i )
// Note
// First Case :

// All possibles (i,j) where (1  ≤  i < j  ≤  N) are :

// i = 1 , j = 2 then result = a1 + a2 + j - i = 20 + 1 + 2-1 = 22.

// i = 1 , j = 3 then result = a1 + a3 + j - i = 20 + 9 + 3-1 = 31.

// i = 1 , j = 4 then result = a1 + a4 + j - i = 20 + 4 + 4-1 = 27.

// i = 2 , j = 3 then result = a2 + a3 + j - i = 1 + 9 + 3-2 = 11.

// i = 2 , j = 4 then result = a2 + a4 + j - i = 1 + 4 + 4-2 = 7.

// i = 3 , j = 4 then result = a3 + a4 + j - i = 9 + 4 + 4-3 = 14.