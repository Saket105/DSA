package striverAtoZ.array;

import java.util.Arrays;

/*
* Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N),
* that is not present in the given array.
*
* Example 1:
* Input Format: N = 5, array[] = {1,2,4,5}
* Result: 3
* Explanation:  In the given array, number 3 is missing. So, 3 is the answer.
* */

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8};
        int[] b = {2,19,10,1,5,3,13,18,24,23,9,22,28,25,6,27,4,20,21,26,11,8,17,15,16,12,7,14};
        Arrays.sort(b);
//        missingNumber1(b);
        System.out.println(missingNumberOptimal(b, b.length));
    }
    //Brute force approach not optimized
    public static int missingNumber(int[] a){
        int idx = 1;
        for (int i=0;i<a.length;i++){
            if (a[i]==idx){
                idx++;
            }else {
                return idx;
            }
        }
        return -1;
    }


    public static void missingNumber1(int[]a){
        int ans = 0;
        int[] hash = new int[a.length+1];
        for (int i=0;i<a.length-1;i++){
            hash[a[i]] += 1;
        }
        for (int i=1;i<hash.length;i++){
            if (hash[i]==0){
                ans = i+1;
            }
        }
        System.out.println(ans);
    }

    //Optimal Solution:
    public static int missingNumberOptimal(int[] a, int n){
        int sum = (n*(n+1))/2;
        int s2 = 0;
        for (int i = 0; i < n - 1; i++) {
            s2 += a[i];
        }
        return sum - s2;
    }
}
