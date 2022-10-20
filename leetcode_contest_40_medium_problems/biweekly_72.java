public class biweekly_72 {
    // class Solution {
        public long[] sumOfThree(long num) {
            if((num-3)%3!=0){
                long []arr=new long[0];
                return arr;
            }
            long[] ans=new long[3];
            ans[0]=(num-3)/3;
            ans[1]=ans[0]+1;
            ans[2]=ans[0]+2;
            return ans;
        }
    // }
}
