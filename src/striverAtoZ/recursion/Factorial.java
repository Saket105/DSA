package striverAtoZ.recursion;

import java.util.ArrayList;

/*
* Given a number X,  print its factorial.
* Example 1:
* Input: X = 5
* Output: 120
* Explanation: 5! = 5*4*3*2*1

* Example 2:
* Input: X = 3
* Output: 6
* Explanation: 3!=3*2*1
* */

public class Factorial {
    static long i = 1;
    static long fact = 1;
    static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        long n = 2;
        int res = 1;
        System.out.println(factNumber(n));
    }

    //normally printing Factorial
    public static int printFact(int n) {
        if (n == 0)
            return 1;
        return n * printFact(n - 1);
    }

    //GFG question code
    public static ArrayList<Long> factNumber(long n) {
        if (n == 1) {
            list.add(1l);
            if (list.size() == 1)
                return list;
        }
        if (fact >= n) {
            return list;
        }
        fact = fact * i;
        if (fact <= n)
            list.add(fact);
        i++;
        return factNumber(n);
    }
}
