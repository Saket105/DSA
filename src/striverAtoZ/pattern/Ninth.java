package striverAtoZ.pattern;

/*
 * Given an integer N, print the following pattern :
 *  1
 *  0 1
 *  1 0 1
 *  0 1 0 1
 * Above is the pattern that we have to print
 * */
public class Ninth {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
    public static void print(int n){
        int start = 1;
        for (int i=0;i<n;i++){
            if (i%2==0) start=1;
            else start = 0;
            for (int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}

