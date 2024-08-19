package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern :
 *  1
 *  2 2
 *  3 3 3
 *  4 4 4 4
 * Above is the pattern that we have to print
 * */
public class Fourth {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
