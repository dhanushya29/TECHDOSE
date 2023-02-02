class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int prefix=0,count=0;
        for(int i=0;i<len;i++){
            prefix+=nums[i];
            if(prefix==k)count++;
            if(map.containsKey(prefix-k))count=count+map.get(prefix-k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
