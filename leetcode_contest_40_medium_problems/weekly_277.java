public class weekly_277 {
    // class Solution {
        public int[] rearrangeArray(int[] nums) {
            int len=nums.length;
            int[] positive=new int[len/2];
            int[] negative=new int[len/2];
            int ind=0,ind1=0;
            for(int i=0;i<len;i++){
                if(nums[i]<0){
                    negative[ind++]=nums[i];
                }
                if(nums[i]>=0){
                    positive[ind1++]=nums[i];
                }
            }
            ind=0;ind1=0;
            int [] res=new int[len];
            for(int i=0;i<len;i+=2){
                res[i]=positive[ind++];
            }
            for(int i=1;i<len;i+=2){
                res[i]=negative[ind1++];
            }
            return res;
        }
    // }
}
