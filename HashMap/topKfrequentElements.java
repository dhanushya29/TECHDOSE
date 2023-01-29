class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]ans=new int[k];
        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]==a[1]?0:(b[1]>a[1])?-1:1);
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            pq.add(new int[]{en.getKey(),en.getValue()});
            while(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
