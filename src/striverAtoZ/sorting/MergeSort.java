package striverAtoZ.sorting;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array of size n, sort the array using Merge Sort.
 * Example 1:
 * Input: N= 5, arr[]={4,2,1,6,7}
 * Output: 1,2,4,6,7,
 *
 * Example 2:
 * Input: N=7,arr[]={3,2,8,5,1,4,23}
 * Output: 1,2,3,4,5,8,23
 * */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 6, 7};
        int n = arr.length;
        mergeSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergeSort(int[] a, int n) {
        int low = 0;
        int high = n - 1;
        mS(a, low, high);
    }


    public static void mS(int[] a, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        mS(a, low, mid);
        mS(a, mid + 1, high);


        List<Integer> list = merge(a, low, mid, high);


        for (int i = 0; i < list.size(); i++) {
            a[low + i] = list.get(i); // Adjust the index to properly update the original array
        }
    }


    public static List<Integer> merge(int[] a, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }
        while (right <= high) {
            temp.add(a[right]);
            right++;
        }
        return temp;
    }
}


