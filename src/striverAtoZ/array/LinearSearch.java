package striverAtoZ.array;

/*
* Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not.
*  If present print the index of the element or print -1.
* Example 1:
* Input: arr[]= 1 2 3 4 5, num = 3
* Output: 2
* Explanation: 3 is present in the 2nd index
*
* Example 2:
* Input: arr[]= 5 4 3 2 1, num = 5
* Output: 0
* Explanation: 5 is present in the 0th index
* */


public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,5,7,4,10};
        int n = 23;
        System.out.println(findElement(a,n));
    }

    private static int findElement(int[] a, int n) {
        for (int i=0;i<a.length;i++){
            if (a[i]==n){
                return i;
            }
        }
        return -1;
    }
}
