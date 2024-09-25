package striverAtoZ.array;

/*
 * Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
 * If the array is sorted then return True, Else return False.
 * Example 1:
 * Input:
 * N = 5, array[] = {1,2,3,4,5}
 * Output: True.
 * */

public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }

    public static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }
}
