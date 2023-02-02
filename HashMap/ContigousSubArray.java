class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int longestAns=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=-1;
            sum+=nums[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                if(sum==0){
                    longestAns=longestAns>=i+1?longestAns:i+1;
                }else{
                    int t=map.get(sum);
                    int a=i-t;
                    longestAns=longestAns>=a?longestAns:a;
                }
            }
        }
        System.out.print(map);
        return longestAns;
    }
}
