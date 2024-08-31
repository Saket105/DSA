package striverAtoZ.sorting;

/*
 * Problem Statement: Given an array of N integers, write a program to implement the Quick sort algorithm.
 * Example 1:
 * Input: N = 6, arr[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52
 * */


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {14, 8, 65, 54, 8, 92, 1};
        int n = arr.length;
        quickSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void quickSort(int[] a, int n) {
        int low = 0;
        int high = n - 1;
        qs(a, low, high);
    }


    public static void qs(int[] a, int low, int high) {
        if (low < high) {
            int pIndex = partition(a, low, high);
            qs(a, low, pIndex - 1);
            qs(a, pIndex + 1, high);
        }
    }


    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (a[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (a[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //swap a[low] and a[j]
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }

}
