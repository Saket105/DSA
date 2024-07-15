package gfgCourse;
/*
* Given a number find the Trailing Zeros in the factorial of a number.
* Example 1: I/P: N = 5
*            O/P: 1
*            I/P: N = 10
*            O/P: 2
*            I/P: N = 100
*            O/P: 24
*
* */
public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(100));
    }
    //TODO: Brute Force Approach
    public static int trailingZeroes(int n){
        int fact = 1;
        while (n!=0){
            fact = fact*n;
            n--;
        }
        int res = 0;
        while(fact%10==0){
            res++;
            fact = fact/10;
        }
        return res;
    }
}
