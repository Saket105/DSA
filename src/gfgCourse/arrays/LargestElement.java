package gfgCourse.arrays;

/*
* Find the largest number from the array.
* Example : Input -> arr[] = {1,12,434,657,43,30}
*           Output -> 657
* */

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,12,434,657,43,30};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest)
                largest = arr[i];
        }
        return largest;
    }
}
