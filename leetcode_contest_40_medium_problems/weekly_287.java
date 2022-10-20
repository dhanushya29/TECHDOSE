import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class weekly_287 {
    // class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            Map<Integer,Integer> map=new TreeMap<>();
            for(int[] temp:matches){
                map.put(temp[0],map.getOrDefault(temp[0],0));
                map.put(temp[1],map.getOrDefault(temp[1],0)+1);
            }
            
            // list[] -> 0 no
            // list [[],[]] ->0 th index add(9)
            List<List<Integer>> res =new ArrayList<>();
            res.add(new ArrayList<>()); res.add(new ArrayList<>());
            for(Integer i:map.keySet()){
                if(map.get(i)<=1){
                    // 0 losses -> 0th index
                    // 1 losses -> 1th index
                    res.get(map.get(i)).add(i);
                }
            }
            return res;
        }
    // }
}
