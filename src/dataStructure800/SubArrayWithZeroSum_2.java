package dataStructure800;

import java.util.HashSet;
import java.util.Set;

/*
*
* Given an array of positive and negative numbers, the task is to find if there is a subarray (of size at least one) with 0 sum.

Examples:

Input: {4, 2, -3, 1, 6}
Output: true
Explanation:
There is a subarray with zero sum from index 1 to 3.

Input: {4, 2, 0, 1, 6}
Output: true
Explanation: The third element is zero. A single element is also a sub-array.

Input: {-3, 2, 3, 1, 6}
Output: false
*
* */

public class SubArrayWithZeroSum_2 {
    public static void main(String[] args) {
//        int[] arr = {4,2,-3,1,6};
        int[] arr = {0,3,6,5,1};
        int n = arr.length;
        System.out.println(subArrayExists(arr,n));
        System.out.println(subArrayWithZeroSumExist(arr,n));
    }

    //TODO: Brute force approach
    public static boolean subArrayExists(int[] a, int n){
        for(int i=0;i<n;i++){
            int sum = a[i];
            if(sum==0)
                return true;
            for (int j=i+1;j<n;j++){
                sum += a[j];
                if(sum==0)
                    return true;
            }
        }
        return false;
    }

    //TODO: Optimized approach using Hashing (HashSet)
    public static boolean subArrayWithZeroSumExist(int[] arr, int n){
        int sum=0;
        Set<Integer> map = new HashSet<>();
        for (int i=0;i<n;i++){
            sum +=arr[i];
            if(sum==0){
                return true;
            }
            if(map.contains(sum))
                return true;
            map.add(sum);
        }
        return false;
    }
}
