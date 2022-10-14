import java.util.HashMap;

public class biweekly_84 {
    // class Solution {
        public long countBadPairs(int[] nums) {
            int n=nums.length;
            long size=(long)n*((long)n-1)/2;
            int len=nums.length;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<len;i++){
                int diff=i-nums[i];
                size-=map.getOrDefault(diff,0);
                map.put(diff,map.getOrDefault(diff,0)+1);
            }
            return size;
        }
    // }
}
