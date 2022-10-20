import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class biweekly_73 
 {
    public int newNum(int[]mapping,int nums){
        String str=Integer.toString(nums);
        char[]ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            sb.append(mapping[ch[i]-'0']);
        }
        String res=sb.toString();
        return (Integer.parseInt(res));
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(nums[i],newNum(mapping,nums[i]));
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(nums[i]);
        }
        Collections.sort(list,(a,b)->map.get(a)-map.get(b));
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}