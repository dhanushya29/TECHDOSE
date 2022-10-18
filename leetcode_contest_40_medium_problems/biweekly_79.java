import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class biweekly_79 {
    // class Solution {
        public int wordLen(String word){
            String [] wo=word.split(" ");
            return wo.length;
        }
        public String largestWordCount(String[] messages, String[] senders) {
            int len=messages.length;
            int[]words=new int[len];
            for(int i=0;i<len;i++){
                words[i]=wordLen(messages[i]);
            }
            Map<String,Integer>map=new TreeMap<>(Collections.reverseOrder());
            for(int i=0;i<len;i++){
                map.put(senders[i],map.getOrDefault(senders[i],0)+words[i]);
            }
            int maxValueInMap = (Collections.max(map.values()));
            for (Map.Entry<String, Integer> entry :map.entrySet()) {
     
                if (entry.getValue() == maxValueInMap) {
                    return entry.getKey();
                }
            }
            return "";
        }
    }

