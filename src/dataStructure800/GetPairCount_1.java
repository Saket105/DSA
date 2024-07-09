package dataStructure800;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.

Examples:

Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
*
* */

public class GetPairCount_1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int k = 2;
        System.out.println(getPairCount(arr,k));
        System.out.println(getPairCounts(arr,k));
    }
    //TODO: Brute force approach
    public static int getPairCount(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }

    //TODO: Optimized approach
    public static int getPairCounts(int[] a, int k){
        int n = a.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int ans = k-a[i];
            if(map.containsKey(ans))
            {
                count+=map.get(ans);
            }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

       return count;
    }
}
