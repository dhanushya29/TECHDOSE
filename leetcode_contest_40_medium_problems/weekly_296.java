import java.util.Arrays;

public class weekly_296 {
    // class Solution {
        public int partitionArray(int[] nums, int k) {
            Arrays.sort(nums);
            int ans=1,min=nums[0],max=nums[0];
            // System.out.println(Arrays.toString(nums));
            for(int i=0;i<nums.length;i++){
                max=Math.max(nums[i],max);
                min=Math.min(nums[i],min);
                // System.out.println(max+" "+min);
                if(max-min>k){
                    ans++;
                    // System.out.println((max-min)+" "+ans);
                    max=min=nums[i];
                }
            }
            return ans;
        }
    // }
}
