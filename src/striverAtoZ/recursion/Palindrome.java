package striverAtoZ.recursion;

/*
* Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.
*Examples:
* Example 1:
* Input: Str =  “ABCDCBA”
* Output: Palindrome
* Explanation: String when reversed is the same as string.
* */

public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    //Leet code problem 125
    public static boolean isPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch = str.toCharArray();
        isPalindrome(ch,0,ch.length-1);
        return str.equals(new String(ch));
    }
    public static void isPalindrome(char[] ch, int start, int end){
        if(start>=end){
            return;
        }
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        start++;
        end--;
        isPalindrome(ch,start,end);
    }
}

