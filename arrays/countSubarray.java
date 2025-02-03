import java.util.*;

public class countSubarray{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        
        int[] subArrCount = new int[testCases];
         
        for(int t = 0; t < testCases; t++){
            int arrNum = scanner.nextInt();

            int[] subArr = new int[arrNum];

            for (int i =0; i < arrNum; i++){
                subArr[i] = scanner.nextInt();
            }
            
            subArrCount[t] = 0;

            for (int start = 0; start < subArr.length; start++){
               for(int end = start; end < subArr.length; end++){
                  boolean isNonDecreasing = true;

                  for(int k = start; k < end; k++){
                    if(subArr[k] > subArr[k+1]){
                        isNonDecreasing = false;
                        break;
                    }
                  }

                  if(isNonDecreasing){
                    subArrCount[t]++;
                  }
                 
               }
            }
        }

        for (int i = 0; i < testCases; i++){
             System.out.println(subArrCount[i]);
        }

    }
}

/* 
Step-by-Step Explanation:

Outer Loop 1: for (int start = 0; start < subArr.length; start++)
The start loop defines the starting index of the subarray.
For the first iteration, start = 0, which means we'll check subarrays starting at index 0.
Inner Loop 2: for (int end = start; end < subArr.length; end++)
The end loop defines the ending index of the subarray.
It iterates over all valid subarrays starting at start and ending at end.
Example: If start = 0, the end loop will iterate through:
end = 0 (subarray = [1])
end = 1 (subarray = [1, 4])
end = 2 (subarray = [1, 4, 2])
end = 3 (subarray = [1, 4, 2, 3])
end = 4 (subarray = [1, 4, 2, 3, 5])
Non-Decreasing Check Loop 3: for (int k = start; k < end; k++)
For each subarray defined by (start, end), check if it's non-decreasing.
A subarray is non-decreasing if:
Every element at index k is less than or equal to the next element k + 1.
Example Walkthrough:
Start = 0, End = 0:

Subarray: [1]
Non-decreasing check: No need to check, single-element arrays are always non-decreasing.
isNonDecreasing = true, so increment the count.
Start = 0, End = 1:

Subarray: [1, 4]
Non-decreasing check:
Compare subArr[0] and subArr[1] → 1 ≤ 4 → true.
isNonDecreasing = true, so increment the count.
Start = 0, End = 2:

Subarray: [1, 4, 2]
Non-decreasing check:
Compare subArr[0] and subArr[1] → 1 ≤ 4 → true.
Compare subArr[1] and subArr[2] → 4 > 2 → false.
isNonDecreasing = false, so don't increment the count.
Start = 0, End = 3:

Subarray: [1, 4, 2, 3]
Non-decreasing check:
Compare subArr[0] and subArr[1] → 1 ≤ 4 → true.
Compare subArr[1] and subArr[2] → 4 > 2 → false.
isNonDecreasing = false, so don't increment the count.


Final Result for the Example:
For the array [1, 4, 2, 3, 5], the non-decreasing subarrays are:

[1], [1, 4], [4], [2], [3], [5], [2, 3], [3, 5], [2, 3, 5]
Total Count: 9

*/
