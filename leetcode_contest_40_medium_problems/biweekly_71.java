public class biweekly_71 {
    // class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            int len=nums.length;
            int[]ans=new int[len];
            int preFreq=0,ind=0;
            for(int i=0;i<len;i++){
                if(nums[i]<pivot){
                    ans[ind++]=nums[i];
                }
                if(nums[i]==pivot)preFreq++;
            }
            while(preFreq-->0){
                ans[ind++]=pivot;
            }
            for(int i=0;i<len;i++){
                if(nums[i]>pivot){
                    ans[ind++]=nums[i];
                }
            }
            return ans;
        }
    // }
}
