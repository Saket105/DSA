package striverAtoZ.pattern;

/*
 * Given Integer N, print the following pattern:
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 * */
public class Sixteen {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }


    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){


                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

