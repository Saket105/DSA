package striverAtoZ.recursion;

/*
* You are given an array. The task is to reverse the array and print it using recursion
* Example 1:
* Input: N = 5, arr[] = {5,4,3,2,1}
* Output: {1,2,3,4,5}
 * */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = reverseArray(arr);
        for (int a: res){
            System.out.print(a+" ");
        }
    }
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        revArray(start,end,arr);
        return arr;
    }
    public static void revArray(int start, int end, int[] arr){
        if(start>end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        revArray(start+1,end-1,arr);
    }
}

