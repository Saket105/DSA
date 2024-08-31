package striverAtoZ.sorting;

/*
 * Problem Statement: Given an array of N integers, write a program to implement the Bubble sorting algorithm.
 * Example 1:
 * Input: N = 6, arr[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52
 * In bubble sort we will swap with the adjacent element
 * but in selection sort we will swap with the 1st element and minimum element.
 * */


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        int[] ans = bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] a, int n) {
        for (int i = n - 1; i > 0; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0)
                break;
        }
        return a;
    }
}


