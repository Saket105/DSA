package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern.
 *   1 2 3 4 5
 *   1 2 3 4
 *   1 2 3
 *   1 2
 *   1
 *  Above is the pattern that we have to print
 * */

public class SixthPattern {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
