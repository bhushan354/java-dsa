import java.util.*;

public class mergeSortArray{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        long[] preSum = new long[N + 1];
        preSum[0] = 0;
        for(int i = 0; i < N; i++){
            preSum[i+1] = preSum[i] + A[i];
        }

        for(int i = 0; i < Q; i++){
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            long rangeSum = preSum[R] - preSum[L-1];

            System.out.println(rangeSum);
        }
    }
}



// this solution is exceeding time limit 

// import java.util.*;

// public class mergeSortArray{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         int Q = scanner.nextInt();

//         int[] A = new int[N];
//         for(int i = 0; i < N; i++){
//             A[i] = scanner.nextInt();
//         }

//         for (int q = 0; q < Q; q++){
//             int L = scanner.nextInt() - 1;
//             int R = scanner.nextInt() - 1;

//             int sum = 0;

//             for(int i = L; i <= R; i++){
//                 sum += A[i];
//             }

//             System.out.println(sum);

//         }

//     }
// }