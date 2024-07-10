package dataStructure800;
/*
*3rd Question: Given an array arr[] of size n, the task is to print all subarrays in the array which has sum 0.
* Examples:

Input: arr = [6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7]
Output:

Subarray found from Index 2 to 4
Subarray found from Index 2 to 6
Subarray found from Index 5 to 6
Subarray found from Index 6 to 9
Subarray found from Index 0 to 10
Input: arr = [1, 2, -3, 3, -1, -1]
Output:

Subarray found from Index 0 to 2
Subarray found from Index 2 to 3
Subarray found from Index 3 to 5
* */

import java.util.ArrayList;
import java.util.HashMap;

class Pair {
    int first, second;
    Pair(int a, int b)
    {
        first = a;
        second = b;
    }
}

public class SubArrayZeroSum_3 {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = arr.length;
        ArrayList<Pair> ans =  findSubArraysOptimizedSolution(arr,n);
        for (Pair p : ans) {
            System.out.println(p.first + " -> " + p.second);
        }
    }

    //TODO: Brute Force Method
    public static ArrayList<Pair> findSubArrays(int[] arr, int n) {
        ArrayList<Pair> out = new ArrayList<Pair>();
        for (int i=0;i<n;i++){
            int sum = 0;
            for (int j=i;j<n;j++){
                sum +=arr[j];
                if(sum==0){
                    out.add(new Pair(i,j));
                }
            }
        }
        return out;
    }

    //TODO: Optimized solution
    public static ArrayList<Pair> findSubArraysOptimizedSolution(int[] arr, int n) {
        HashMap<Integer, ArrayList<Integer> > map = new HashMap<>();
        ArrayList<Pair> out = new ArrayList<>();
        int sum = 0;
        for (int i=0;i<n;i++){
            sum +=arr[i];
            if(sum==0)
                out.add(new Pair(0,i));
            ArrayList<Integer> al = new ArrayList<>();
            if (map.containsKey(sum)){
                al = map.get(sum);
                for (int it = 0;it<al.size();it++){
                    out.add(new Pair(al.get(it)+1,i));
                }
            }
            al.add(i);
            map.put(sum,al);
        }
        return out;
    }
}
