public class permutation {
    class Solution {
        public void func(int ind,int[]nums,List<List<Integer>> ans){
            if(ind==nums.length){
                List<Integer> list=new ArrayList<>();
                for(int i=0;i<nums.length;i++){
                    list.add(nums[i]);
                }
                ans.add(list);
                return;
            }
            for(int i=ind;i<nums.length;i++){
                swap(i,ind,nums);
                func(ind+1,nums,ans);
                swap(i,ind,nums);
            }
        }
        public void swap(int i,int j,int []nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans=new ArrayList<>();
            func(0,nums,ans);
            return ans;
        }
    }
}
