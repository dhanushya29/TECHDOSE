import java.util.HashMap;
import java.util.Map;

public class weekly_289 {
    // class Solution {
        public int minimumRounds(int[] tasks) {
            int count=0;
            int len=tasks.length;
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<len;i++){
                map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> en:map.entrySet()){
                if(en.getValue()==1){
                    return -1;
                }
                count+=(en.getValue()/3);
                if(en.getValue()%3!=0)count++;
            }
            return count;
        }
    // }
}
