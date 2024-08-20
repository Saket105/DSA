package striverAtoZ.pattern;

/*
 * Given an integer N, print the following pattern :
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * */


public class Fourteen {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        int last = 65+n;
        for (int i=65;i<last;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}

