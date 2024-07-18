package gfgCourse;

/*
* Program to find the Prime Number.
* Example 1 -> number = 17
*              Output = True
*         2 -> number = 65
 *              Output = false
* */

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }

    public static boolean isPrime(int n){
       if (n==1)
           return false;
       for (int i=2;i*i<n;i++){
           if (n%i==0)
               return false;
       }
       return true;
    }
}
