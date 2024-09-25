package striverAtoZ.array;

/*
 * Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
 *  The relative order of the elements should be kept the same.
 * Example 1:
 * Input: arr[1,1,2,2,2,3,3]
 * Output: arr[1,2,3,_,_,_,_]
 * */

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int n = arr.length;
        removeDuplicates(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        System.out.println(lengthOfNew_array);
    }

    //Brute Force approach
    public static int removeDuplicate(int[] a, int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(a[i]);
        }
        int k = hashSet.size();
        int j = 0;
        for (int x : hashSet) {
            a[j] = x;
            j++;
        }
        while (j < n) {
            a[j] = 0;
            j++;
        }
        return k;
    }

    //Optimal approach
    public static void removeDuplicates(int[] arr, int n){
        int i=0;
        for (int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k=i+1;k<n;k++){
            arr[k] = 0;
        }
    }
}
