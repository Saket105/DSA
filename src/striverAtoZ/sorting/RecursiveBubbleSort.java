package striverAtoZ.sorting;

/*
* Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.
* Example 1:
* Input: N = 6, array[] = {13,46,24,52,20,9}
* Output: 9,13,20,24,46,52
* Explanation: After sorting we get 9,13,20,24,46,52
* */

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive Bubble Sort function
    public static void bubbleSort(int[] a, int n) {
        // Base case: If there's only one element left, no need to sort
        if (n == 1) {
            return;
        }
        int didSwap = 0;
        // Perform a pass of bubble sort for the first n elements
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                // Swap the elements
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                didSwap = 1;
            }
        }
        // if no swapping happens.
        if (didSwap == 0) return;
        // Recursively call bubbleSort for the remaining n-1 elements
        bubbleSort(a, n - 1);
    }
}

