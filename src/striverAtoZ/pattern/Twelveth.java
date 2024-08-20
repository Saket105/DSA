package striverAtoZ.pattern;

/*
 * Given an integer N, print the following pattern :
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * */


public class Twelveth {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        int last = 65+n;
        for (int i=65;i<last;i++){
            for (int j =65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}

