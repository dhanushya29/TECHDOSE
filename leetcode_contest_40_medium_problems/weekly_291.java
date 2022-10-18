import java.util.HashMap;
import java.util.Map;

public class weekly_291 {
    // class Solution {
        public int minimumCardPickup(int[] cards) {
            // int count=0;
            int len=cards.length;
            int min=Integer.MAX_VALUE;
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<len;i++){
                if(map.containsKey(cards[i])){
                    min=Math.min(min,i-map.get(cards[i])+1);
                }
                map.put(cards[i],i);
            }
            System.out.print(map);
            return min==Integer.MAX_VALUE?-1:min;
        }
    // }
}
