

import java.util.Arrays;

public class weekly_293 {
    // class Solution {
        public int maxConsecutive(int bottom, int top, int[] special) {
            int count=0,max=0;
            int len=special.length;
            Arrays.sort(special);
            max=Math.max(special[0]-bottom,max);
            for(int i=1;i<len;i++){
                max=Math.max(max,special[i]-special[i-1]-1);
            }
            max=Math.max(max,top-special[len-1]);
            return max;
        }
    // }
}
