package striverAtoZ.array;

/*
 * Problem: You are given an array of integers,
 * your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
 * Example 1:
 * Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
 * Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 * */

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        int n = arr.length;
        moveZerosOptimal(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Brute force approach
    private static void moveAllZeros(int[] arr, int n) {
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = temp[i];
        }
        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }
    }

    //Optimal Approach
    public static void moveZerosOptimal(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        int idx = j+1;
        while (idx<n)
            if(arr[idx]!=0){
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
                j++;
                idx++;
            }else{
                idx++;
        }
    }
}
