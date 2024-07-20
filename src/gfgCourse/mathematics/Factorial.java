package gfgCourse.mathematics;

/*
* Given a number N, find the factorial of that number N.
* Example: 1 Input: N = 4
*            Output : 24
* Example: 2 Input: N = 6
*            Output : 720
* */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(fact(5));
    }

    //TODO: Iterative Solution
    public static int factorial(int n){
        if(n==0)
            return 1;
        int res = 1;
        while (n!=0){
            res = res*n;
            n--;
        }
        return res;
    }

    //TODO: Recursive Method
    public static int fact(int n){
        if (n==0)
            return 1;
        return n* fact(n-1);
    }
}
