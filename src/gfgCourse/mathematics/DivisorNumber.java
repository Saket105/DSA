package gfgCourse.mathematics;

/*
* Program to print divisor of a number.
* Example 1: num = 15
*            Output: 1,3,5,15
* Example 2: num = 100
*            Output: 1,2,4,5,10,20,25,50,100
* Example 3: num = 7
*            Output: 1,7
* */

public class DivisorNumber {
    public static void main(String[] args) {
        int n = 7;
        divisorOfNumber(n);
    }

    //TODO: Brute force method
    public static void divisorOfNumber(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
