package dataStructure800;

import java.util.HashMap;
import java.util.Map;

public class GetPairCount_1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int k = 2;
        System.out.println(getPairCount(arr,k));
        System.out.println(getPairCounts(arr,k));
    }
    //TODO: Brute force approach
    public static int getPairCount(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }

    //TODO: Optimized approach
    public static int getPairCounts(int[] a, int k){
        int n = a.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int ans = k-a[i];
            if(map.containsKey(ans))
            {
                count+=map.get(ans);
            }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

       return count;
    }
}
