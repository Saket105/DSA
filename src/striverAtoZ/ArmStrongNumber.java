package striverAtoZ;

/*
* Given an integer N, return true it is an Armstrong number otherwise return false.
*
* Example 1:
* Input:N = 153
* Output:True
* Explanation: 13+53+33 = 1 + 125 + 27 = 153
*
* Example 2:
* Input:N = 371
* Output: True
* Explanation: 33+53+13 = 27 + 343 + 1 = 371
* */

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 371;
        System.out.println(strongNumber(n));
    }
    public static boolean strongNumber(int n){
        int ld = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            ld++;
        }
        int ans=0;
        temp = n;
        while (temp!=0){
            int last = temp%10;
            ans = (int)( ans+Math.pow(last,ld));
            temp = temp/10;
        }
        return ans==n;
    }
}
