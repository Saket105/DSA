package striverAtoZ.array;

import java.util.*;

/*
* Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
* Example 1:
* Input: n = 5,m = 5.
* arr1[] = {1,2,3,4,5}
* arr2[] = {2,3,4,4,5}
* Output: {1,2,3,4,5}
* Explanation:
* Common Elements in arr1 and arr2  are:  2,3,4,5
* Distnict Elements in arr1 are : 1
* Distnict Elemennts in arr2 are : No distinct elements.
* Union of arr1 and arr2 is {1,2,3,4,5}
* */

public class UnionArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 4, 5};
        int m = a.length;
        int n = b.length;
        unionArrayOptimal(a, m, b, n);
    }

    //Brute Force approach using HashMap
    private static void unionArray(int[] a, int m, int[] b, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }

        for (int it : map.keySet())
            union.add(it);

        System.out.println(union);
    }

    //Optimal Approach using HashSet
    private static void unionArrayOptimal(int[] a, int m, int[] b, int n) {
        Set<Integer> hasSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            hasSet.add(a[i]);
        }
        for (int j = 0; j < n; j++) {
            hasSet.add(b[j]);
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for (int k: hasSet){
            arr.add(k);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }

    //Best Approach using 2 pointers
    public static void unionArrayBest(int[] a, int m, int[] b, int n) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > arr =new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (a[i] <= b[j]) // Case 1 and 2
            {
                if (arr.isEmpty() || arr.getLast() != a[i])
                    arr.add(a[i]);
                i++;
            } else // case 3
            {
                if (arr.isEmpty() || arr.getLast() != b[j])
                    arr.add(b[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (arr.getLast() != a[i])
                arr.add(a[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (arr.getLast() != b[j])
                arr.add(b[j]);
            j++;
        }
        System.out.println(arr);
    }
}
