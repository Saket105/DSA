package fraz;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = -2147483412;
        System.out.println(reverse(n));
    }

    public static int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int ld = x%10;
            rev = rev*10+ld;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            x = x/10;
        }
        return rev;
    }
}
