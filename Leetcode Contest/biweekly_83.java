public class biweekly_83{
    // class Solution {
        public long zeroFilledSubarray(int[] nums) {
            long count=0,local=0;
            for(int n:nums){
                if(n==0){
                    count+=++local;
                }
                else{
                    local=0;
                }
            }
            return count;
        }
    // }
}