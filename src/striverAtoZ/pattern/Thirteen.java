package striverAtoZ.pattern;
/*
 * Given an integer N, print the following pattern :
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 * */


public class Thirteen {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        int last = 65+n;
        for (int i=last-1;i>=65;i--){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}

