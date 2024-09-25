package striverAtoZ.array;

/*
* Given an array of N integers, left rotate the array by one place.
* Example 1:
* Input: N = 5, array[] = {1,2,3,4,5}
* Output: 2,3,4,5,1
* */

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        int[] ans = rotateArray(arr);

//        for (int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }

        rotateArrayByK(arr,3);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] rotateArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int count = 0;
        for(int i=1;i<n;i++){
            ans[count] = arr[i];
            count++;
        }
        ans[count] = arr[0];

        return ans;
    }

    public static void rotateArrayByK(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        if(k<0){
            k = k+n;
        }
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);

    }
    public static void reverseArray(int[]arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
