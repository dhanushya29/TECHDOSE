public class weekly_312 {
    public int longestSubarray(int[] nums) {
        int max=0,len=nums.length,maxLen=0;
        for(int i=0;i<len;i++){
            int j=i,count=0;
            while(j<len && nums[j]==nums[i]){
                count++;j++;
            }
            i=j-1;
            if(max<nums[i]){
                maxLen=count;
                max=nums[i];
            }
            if(max==nums[i]){
                maxLen=Math.max(maxLen,count);
            }
        }
        return maxLen;
    }
}