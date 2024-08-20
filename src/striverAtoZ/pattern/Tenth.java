package striverAtoZ.pattern;

/*
 * Given an integer N, print the following pattern :
 * 1         1
 * 1 2     2 1
 * 1 2 3 3 2 1
 *
 * Above is the pattern that we have to print
 * */
public class Tenth {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
    }
}
