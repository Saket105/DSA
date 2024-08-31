package striverAtoZ.hashing;

/*
* Given an array, we have found the number of occurrences of each element in the array.
* Example 1:
* Input: arr[] = {10,5,10,15,10,5};
* Output: 10  3
*          5  2
*         15  1
Explanation: 10 occurs 3 times in the array 5 occurs 2 times in the array 15 occurs 1 time in the array
*
* Here we have code for String also
* */


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstProblem {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int[] q = {1,4,2,3,12};
//        numberHash(arr,q);
//        byUsingHashMap(arr,q);




        String s = "geeksforgeeks";
        char[] c = {'q','g','e','c','t','f'};
//        byUsingHashMap(s,c);
//        stringHash(s,c);
        int[] arr1 = {2,3,2,3,5};
        frequencyCount(arr,5,5);
    }
    public static void numberHash(int[] arr, int[] q){
        int[] hash = new int[13];
        Arrays.fill(hash,0);


        //pre-compute the hash array
        for (int i=0;i<arr.length;i++){
            hash[arr[i]] +=1;
        }


        //fetch the queries
        for(int i=0;i<q.length;i++){
            System.out.println(q[i]+" --> "+ hash[q[i]]);
        }
    }
    public static void stringHash(String s, char[] c){
        int[] hash = new int[256]; // if I have only small letters
        Arrays.fill(hash,0);
        //pre-compute the hash array
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)] +=1;
        }
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]+" --> "+ hash[c[i]]);
        }
    }
    public static void byUsingHashMap(int[] a, int[] q){
        Map<Integer, Integer> hash = new HashMap<>(); // to maintain the order of insertion,
        // if we are using hashMap it is Unordered map from c++
        for (int i=0;i<a.length;i++){
            hash.put(a[i], hash.getOrDefault(a[i],0)+1); // if key is not present then put 0
        }
        for(int i=0;i<q.length;i++){
            System.out.println(q[i]+" --> "+ hash.getOrDefault(q[i],0));
        }
    }


    public static void byUsingHashMap(String s, char[] c){
        Map<Character,Integer> hash = new LinkedHashMap<>(); // to maintain the order of insertion,
        // if we are using LinkedHashMap it is ordered map from c++
        for (int i=0;i<s.length();i++){
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]+" --> "+ hash.getOrDefault(c[i],0));
        }
    }


    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        int[] hash = new int[P];
        Arrays.fill(hash,0);


        for(int i=0;i<N;i++){
            hash[arr[i]] += 1;
        }
        for(int i=0;i<hash.length;i++){
            System.out.print(hash[arr[i]]+" ");
        }
    }


}
