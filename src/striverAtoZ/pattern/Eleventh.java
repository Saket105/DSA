package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern :
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * Above is the pattern that we have to print
 * */


public class Eleventh {
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
    public static void print(int n){
        int count=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

