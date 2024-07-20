package gfgCourse.mathematics;

/*
* Print all the prime numbers smaller than or equal to N.
* Example 1: N = 10
*            Output: 2,3,5,7
* Example 2: N = 23
*            Output: 2,3,5,7,11,13,17,19,23
* */

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int n = 10;
        printPrime(n);
    }

    public static void printPrime(int n){
        for (int i=1;i<=n;i++){
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n%2==0 || n%3==0)
            return false;
        for (int i=5;i*i<=n;i=i+6){
            if ((n%i==0) || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
