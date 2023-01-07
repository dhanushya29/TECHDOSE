public class combinationSum {
    class Solution {
        public void findCom(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
            if(ind==arr.length){
                if(target==0){
                    ans.add(new ArrayList<>(ds));
                }
                return;
            }
            if(arr[ind]<=target){
                ds.add(arr[ind]);
                findCom(ind,arr,target-arr[ind],ans,ds);
                ds.remove(ds.size()-1);
            }
            findCom(ind+1,arr,target,ans,ds);
        }
        public List<List<Integer>> combinationSum(int[] arr, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            findCom(0,arr,target,ans,new ArrayList<Integer>());
            return ans;
        }
    }
}
