package striverAtoZ.recursion;

/*
 * Print name N times using recursion
 * Input When N=5
 * Output: GFG GFG GFG GFG GFG
 * */

public class PrintName {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
        if (n==0)
            return;
        System.out.print("GFG ");
        n--;
        print(n);
    }
}

