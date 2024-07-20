package gfgCourse.mathematics;

/*
* Given an integral number N. The task is to find the count of digits present in this number.
* Let's Say:
*   N = 2019
* Number of digits in N here is 4 and,
* the digits are: 2, 0, 1, 9.
* */
public class CountNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(numberOfDigits(256487456));

        //TODO: Do it using log so complexity will be constant time.
        int a = (int) Math.floor(Math.log10(123456)+1);
        System.out.println(a);
    }

    public static int numberOfDigits(int n){
        int count = 0;
        if(n==0)
            return count;
        while (n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}
