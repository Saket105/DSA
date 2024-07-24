package fraz;

/*
* Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
* In one move, you can increment n - 1 elements of the array by 1.
*
* Example 1:
* Input: nums = [1,2,3]
* Output: 3
* Explanation: Only three moves are needed (remember each move increments two elements):
* [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*
* Example 2:
* Input: nums = [1,1,1]
* Output: 0
* */

import java.util.Arrays;

public class MinimumMoves {
    public static void main(String[] args) {
        int[] arr = {-1,1};
        int[] arr1 = {1,7,8,3,11};
        int[] arr2 = {1,2,3};
        System.out.println(minMoves(arr1));
    }

    public static int minMoves(int[] a) {
        int ans = 0;
        Arrays.sort(a);
        int min = a[0];
        for (int i=0;i<a.length;i++){
            ans = ans+(a[i]-min);
        }
        return ans;
    }
}
