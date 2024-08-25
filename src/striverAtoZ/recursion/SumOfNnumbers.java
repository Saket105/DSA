package striverAtoZ.recursion;

/*
 * Given a number ‘N’, find out the sum of the first N natural numbers.
 * Input:  N = 5
 *Output: 15
 * */

public class SumOfNnumbers {
    static long res=0;
    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        System.out.println(printSum(n, res));
        System.out.println(sumOfSeries(n));
    }
    public static int printSum(int n, int res){
        if (n==0)
            return res;
        res = res+n;
        n--;
        return printSum(n,res);


    }
    //GFG question
    public static long sumOfSeries(long n){
        if (n==0)
            return res;
        res = res+ (n*n*n);
        n--;
        return sumOfSeries(n);
    }
}

