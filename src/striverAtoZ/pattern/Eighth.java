package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern.
 *  $ $ $ $ $ $ $
 *    $ $ $ $ $
 *      $ $ $
 *        $
 *
 *  Above is the pattern that we have to print
 * For this problem the approach that we use is:
 * 1st we have some space.
 * 2nd then we have some $ printed
 * 3rd then again we have some space
 * So logic is N-i-1 is space then we have 2*i+1 ($) then again N-i-1 space write 3 loops for these 3 cases
 * and we will get the pyramid.
 */
public class Eighth {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("$");
            }
            for(int m=0;m<n-i;m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

