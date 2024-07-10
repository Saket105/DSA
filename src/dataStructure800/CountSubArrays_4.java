package dataStructure800;

import java.util.HashMap;

/*
* Examples:

Input: n = 6, arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
Input: n = 10, arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4], [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
* */

public class CountSubArrays_4 {
    public static void main(String[] args) {
        long[] arr = {0,0,5,5,0,0};
        int n = arr.length;
        System.out.println(findSubarrayBruteForce(arr,n));
        System.out.println(findSubarrayOptimized(arr,n));
    }

    //TODO: Brute Force approach
    public static long findSubarrayBruteForce(long[] arr ,int n)
    {
        //Your code here
        long count = 0;
        for(int i=0;i<n;i++){
            long sum = 0;
            for(int j=i;j<n;j++){
                sum +=arr[j];
                if(sum==0){
                    count++;
                }
            }
        }
        return count;
    }

    //TODO: Optimized approach
    public static long findSubarrayOptimized(long[] arr ,int n)
    {
        HashMap<Integer, Integer> sumFreqMap = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (long l : arr) {
            sum +=  l;
            if (sum == 0)
                count++;
            if (sumFreqMap.containsKey(sum))
                count += sumFreqMap.get(sum);
            // Increment the frequency of the sum in the map
            sumFreqMap.put(sum, sumFreqMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
