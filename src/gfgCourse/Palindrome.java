package gfgCourse;

/*
* Find a number is Palindrome or not.
* Example: 1.  N = 78987
*              Output: Yes
*          2. N = 123
*             Output = false
* */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(78987));
    }

    public static boolean isPalindrome(int n){
        int rev = 0;
         int temp = n;
        if(n<10)
            return true;
        while (temp!=0){
            int last_digit = temp%10;
            rev = rev*10+last_digit;
            temp = temp/10;
        }
        return n == rev;
    }
}
