package striverAtoZ;

import java.util.ArrayList;


/*
* Given an integer N, return all divisors of N.
*
* Example 1:
* Input:N = 36
* Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
* Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
*
* Example 2:
* Input:N =12
* Output: [1, 2, 3, 4, 6, 12]
* Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
* */

public class AllDivisor {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(allDivisors(n));
        System.out.println(allDivisors1(n));
        System.out.println(allDivisors2(n));
    }

    //TODO: Brute Force
    public static ArrayList<Integer> allDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }

    //TODO: Optimized approach but not in sorted order
    public static ArrayList<Integer> allDivisors1(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 1;
        int end = n;
        while (start<end){
            if (n%start==0){
                list.add(start);
            }
            if (n%end==0){
                list.add(end);
            }
            start++;
            end--;
        }
        return list;
    }

    //TODO: Optimal Solution but not in sorted order
    public static ArrayList<Integer> allDivisors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i!=(n/i))
                    list.add(n/i);
            }
        }
        return list;
    }
}
