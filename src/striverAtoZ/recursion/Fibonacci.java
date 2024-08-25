package striverAtoZ.recursion;

/*
* Given an integer N. Print the Fibonacci series up to the Nth term.
* Example 1:
* Input: N = 5
* Output:  5
*
* Example 2:
* Input: 6
* Output: 8
* */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}

