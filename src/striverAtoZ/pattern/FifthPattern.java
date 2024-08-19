package striverAtoZ.pattern;

/* Given an integer N, print the following pattern.
*   $ $ $ $ $
*   $ $ $ $
*   $ $ $
*   $ $
*   $
*  Above is the pattern that we have to print
* */
public class FifthPattern {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
