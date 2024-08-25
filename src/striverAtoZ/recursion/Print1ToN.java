package striverAtoZ.recursion;

/*
 * Print 1-N using recursion
 * Input When N=10
 * Output: 1 2 3 4 5 6 7 8 9 10
 * */

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        int i=1;
        print(n,i);
    }
    public static void print(int n, int i){
        if (i>n)
            return;
        System.out.print(i+" ");
        i++;
        print(n,i);
    }
}

