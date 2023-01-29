class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int left=0,sum=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i+1-left);
                sum-=nums[left++];
            }
        }
        return ans!=Integer.MAX_VALUE?ans:0;
    }
}
