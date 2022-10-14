import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class weekly_302 {
    // class Solution {
        public int digitSum(int n){
            int sum=0;
            while(n>0){
                sum+=(n%10);
                n/=10;
            }
            return sum;
        }
        public int maximumSum(int[] nums) {
            int len=nums.length;
            Map<Integer,List<Integer>> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int sum=digitSum(nums[i]);
                if(!map.containsKey(sum)){
                    map.put(sum,new ArrayList<>());
                }
                List <Integer> list=map.get(sum);
                list.add(nums[i]);
                map.put(sum,list);
            }
            int ans=-1;
            for(Integer val:map.keySet()){
                List <Integer>list1=map.get(val);
                // list1=map.get(val);
                if(list1.size()<2){
                    continue;
                }
                Collections.sort(list1);
                ans=Math.max(ans,list1.get(list1.size()-1)+list1.get(list1.size()-2));
            }
            return ans;
        }
    // }
}
