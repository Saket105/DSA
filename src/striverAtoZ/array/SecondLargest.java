package striverAtoZ.array;

/*
 * Given an array, find the second smallest and second largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2, Second Largest : 5
 *
 * Example 2:
 * Input: [1]
 * Output: Second Smallest : -1 , Second Largest : -1
 * */

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10};
        int n = arr.length;
//        System.out.println(secondSmallestOptimal(arr, n));
        System.out.println(secondLargest(arr, n));
    }

    //Optimal approach
    public static int secondLargest(int[] a, int n) {
        int secondLargest = 0;
        int largest = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= largest) {
                secondLargest = largest;
                largest = a[i];
            }
            if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        if(largest==secondLargest){
            return -1;
        }
        return secondLargest;
    }

    //Better Approach
    public static int secondSmallest(int[] a, int n) {
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > smallest && a[i] < secondSmallest) {
                secondSmallest = a[i];
            }
        }

        return secondSmallest;
    }
    public static int secondSmallestOptimal(int[] a, int n){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]<smallest){
                secondSmallest = smallest;
                smallest = a[i];
            }
            else if (a[i]<secondSmallest && a[i]>smallest){
                secondSmallest = a[i];
            }
        }
        return secondSmallest;
    }
}
