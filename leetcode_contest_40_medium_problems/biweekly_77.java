public class biweekly_77 {
    // class Solution {
        public int minimumAverageDifference(int[] nums) {
            int len=nums.length;
            if(len==0)return nums[0];
            long sum=0;
            for(int i=0;i<len;i++){
                sum+=nums[i];
            }
            long ls=0,rs=0,min=Integer.MAX_VALUE;
            int res=0;
            for(int i=0;i<len;i++){
                ls+=nums[i];
                rs=sum-ls;
                long diff=Math.abs(ls/(i+1) - (len-i==1?0: rs/(len-i-1)));
                if(diff<min){
                    min=diff;
                    res=i;
                }
            }
            return res;
        }
    // }
}
