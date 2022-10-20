import java.util.Arrays;

public class weekly_283 {
    // class Solution{
        public long getSum(long ni,long s){
            long temp=ni+s-1;
            return ((temp*(temp+1))/2) - ((s*(s-1))/2);
        }
        public long minimalKSum(int[] nums, int k) {
            int len=nums.length;
            Arrays.sort(nums);
            long start=1,sum=0;
            for(int i=0;i<len;i++){
                long ni=nums[i]-start;
                if(ni>=0){
                    if(k>ni){
                        k-=ni;
                    }
                    else{
                        ni=k;
                        k=0;
                    }
                sum+=getSum(ni,start);
                start=nums[i]+1;
                }
                // System.out.printf("i:%d ni:%d sum:%d k:%d start:%d\n",i,ni,sum,k,start);
                if(k==0)break;
            }
            if(k!=0){
                sum+=getSum(k,start);
            }
             // System.out.printf("sum:%d k:%d start:%d\n",sum,k,start);
            return sum;
        }
    // }
}
