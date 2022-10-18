public class biweekly_78 {
    // class Solution {
        public int waysToSplitArray(int[] nums) {
            int count=0;
            long sum=0;
            int len=nums.length;
            for(int i=0;i<len;i++){
               sum+=nums[i];
            }
            long s=0;
            for(int i=0;i<len-1;i++){
               s+=nums[i];
               long sa=sum-s;
               if(s>=sa)count++;
            }
            return count;
        }
    // }
}
