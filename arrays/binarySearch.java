import java.util.*;

public class binarySearch {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0 ; i < N; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        
        for(int i = 0; i < Q; i++){
            int target = scanner.nextInt();

            int left = 0;
            int right = N-1;
            boolean found = false;

            while(left <= right){

                int mid = (left + right)/2 ;

                if(target == arr[mid]){
                    found = true;
                    break;
                } else if (target > arr[mid]){
                    left = mid + 1;
                } else if (target < arr[mid]){
                    right = mid - 1;
                }
                
            }

            System.out.println(found ? "found" : "not found");
        }

    }
}