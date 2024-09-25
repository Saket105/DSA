package striverAtoZ.array;

/*
* Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
* Example 1:
* Input: prices = {1, 1, 0, 1, 1, 1}
* Output: 3
* Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
*
* Example 2:
* Input: prices = {1, 0, 1, 1, 0, 1}
* Output: 2
* Explanation: There are two consecutive 1's in the array.
* */
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1};
        consecutiveOne(a);
    }

    private static void consecutiveOne(int[] a) {
        int n = a.length;
        int count = 0;
        int max = 0;
        for (int i=0;i<n;i++){
            if(a[i]==1){
                count++;
            }else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
