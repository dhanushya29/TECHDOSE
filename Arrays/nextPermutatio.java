public class nextPermutatio {
    class Solution {
        public int breakPoint(int[]nums,int n){
            int result=0;
            for(int i=n-1;i>0;i--){
                if(nums[i-1]<nums[i]){
                   return i-1;
                }
            }
            return -1;
        }
        public void swap(int[]nums,int a,int b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
        public int nextMax(int []nums,int bp,int n){
            int res=0;
            for(int i=bp;i<n;i++){
                int diff=nums[i]-nums[bp-1],min=Integer.MAX_VALUE;
                // System.out.println(diff);
                if(diff<=0){
                    continue;
                }else{
                    if(min>=diff){
                        min=diff;
                        res=i;
                    }
                }
            }
            return res;
        }
        public void reverse(int[]nums,int bp,int n){
            int i=bp+1,j=n-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }
        }
        public void nextPermutation(int[] nums) {
            int len=nums.length;
            int bp=breakPoint(nums,len);
            if(bp==-1)reverse(nums,bp,len);
            // System.out.println(nums[bp]);
            else{
                int nm=nextMax(nums,bp+1,len);
                swap(nums,bp,nm);
                reverse(nums,bp,len);
            }
        }
    }
}
