package gfgCourse.mathematics;

/*
* Find GCD of two numbers:
* Example:1  -> num1 = 2, num2 = 4 then GCD will be 2
*         2  -> num1 = 100, num2 = 200 then GCD will be 100
*         3  -> num1 = 7, num2 = 13 then GCD will be 1
* */

public class GcdOfNumber {
    public static void main(String[] args) {
        System.out.println(gcd(13,7));
    }

    public static int gcd(int a, int b){
        if(a==0)
            return b;

        return gcd(b%a,a);
    }
}
