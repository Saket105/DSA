package striverAtoZ.math;

/*
* Given an integer N, return the number of digits in N.
* Example 1:
* Input:N = 12345
* Output:5
* Explanation:  The number 12345 has 5 digits.
*
* Example 2:
* Input:N = 7789
* Output: 4
* Explanation: The number 7789 has 4 digits.
* */

public class CountDigits {
    public static void main(String[] args) {
        int n = 7789;
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        int count = 0;
        while (n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}
