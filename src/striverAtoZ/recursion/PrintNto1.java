package striverAtoZ.recursion;
/*
 * Print N-1 using recursion
 * Input When N=10
 * Output: 10 9 8 7 6 5 4 3 2 1
 * */

public class PrintNto1 {
    public static void main(String[] args) {
        int n =10;
        print(n);
    }
    public static void print(int n){
        if (n==0)
            return;
        System.out.print(n+" ");
        n--;
        print(n);
    }
}

