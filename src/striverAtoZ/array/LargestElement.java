package striverAtoZ.array;

/*
 * Given an array, we have to find the largest element in the array.
 * Example 1:
 * Input:
 * arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 *
 * Example 2:
 * Input:
 * arr[] = {8,10,5,7,9};
 * Output: 10
 * Explanation: 10 is the largest element in the array.
 * */
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 25, 5, 9, 5};
        int n = arr.length;
        System.out.println(largestElement(arr, n));
    }


    public static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

