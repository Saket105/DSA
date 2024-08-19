package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern.
 *       $
 *     $ $ $
 *   $ $ $ $ $
 *  Above is the pattern that we have to print
 * For this problem the approach that we use is:
 * 1st we have some space.
 * 2nd then we have some $ printed
 * 3rd then again we have some space
 * So logic is N-i-1 is space then we have 2*i+1 ($) then again N-i-1 space write 3 loops for these 3 cases
 * and we will get the pyramid.
 */
public class SeventhPattern {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
    public static void print(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k = 0;k< 2*i+1;k++){
                System.out.print("*");
            }
            for (int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

