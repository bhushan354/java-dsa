import java.util.*;

public class maxSubarray{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        int[][] arr = new int[testCases][];
//this loop only for input
        for(int t  = 0; t < testCases; t++){ 
            // size of current inner array
            int num = scanner.nextInt();
            // Initialize the inner array for this testcase
            arr[t] = new int[num];

            for (int i = 0; i < num; i++){
                arr[t][i] = scanner.nextInt(); 
            }
         }

        // for (int t = 0; t < testCases; t++) { 
        //     for (int i = 0; i < arr[t].length; i++) {
        //         System.out.print(arr[t][i] + " "); 
        //     }
        //     System.out.println();
        // }


// THIS FOR LOOP WILL ONLY PRINT
    for (int t = 0; t < testCases; t++){
        List<Integer> maxInSubArray = new ArrayList<>();

        for (int start = 0; start < arr[t].length; start++){
            int maximumValue = Integer.MIN_VALUE;
            for(int end = start; end < arr[t].length; end++){
                maximumValue = Math.max(maximumValue, arr[t][end]);
                maxInSubArray.add(maximumValue); 
            }
        }
            
        // here in below loop i is not index it is the element
        for (int i : maxInSubArray){
            System.out.print(i + " ");
        }

        System.out.println();
       }

    }
}