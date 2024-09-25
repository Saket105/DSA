package striverAtoZ.array;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearOne {
    public static void main(String[] args) {
        int[] a = {8,8,9,9,10};
        System.out.println(appearOnce(a));
    }
    //code is correct but not work with edge cases
    public static int numberAppearOne(int[] a){
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if (max<a[i])
                max = a[i];
        }

        int[] hash = new int[max+1];

        for (int i=0;i<a.length;i++){
            hash[a[i]] +=1;
        }
        for (int i=0;i<hash.length;i++){
            if(hash[i]==1){
                return i;
            }
        }
        return -1;
    }

    //Brute force approach
    public static int numberAppearOne1(int[] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[j]==a[i]){
                    count++;
                }
            }
            if (count==1){
                return a[i];
            }
            count = 0;
        }
        return 0;
    }

    //Now code using Map data structure
    public static int numberAppearOnes(int[] a) {
        int n = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return 0;
    }

    //Optimized code: using XOR
    public static int appearOnce(int[] a){
        int xorr = 0;
        for (int i = 0; i < a.length; i++) {
            xorr = xorr ^ a[i];
        }
        return xorr;
    }
}
