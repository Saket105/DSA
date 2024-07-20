package gfgCourse.mathematics;

/*
* Program to find the Prime Number.
* Example 1 -> number = 17
*              Output = True
*         2 -> number = 65
 *              Output = false
* */

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(121));
        System.out.println(isPrimeOptimized(1031));
    }

    //TODO: Brute Force
    public static boolean isPrime(int n){
       if (n==1)
           return false;
       for (int i=2;i*i<n;i++){
           if (n%i==0)
               return false;
       }
       return true;
    }

    //TODO: Optimized Solution
    public static boolean isPrimeOptimized(int n){
        if (n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n%2==0 || n%3==0)
            return false;
        for (int i=5;i*i<=n;i=i+6){
            if (n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
