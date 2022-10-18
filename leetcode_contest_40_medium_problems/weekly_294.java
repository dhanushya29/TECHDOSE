import java.util.Arrays;

public class weekly_294 {
    // class Solution {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            int count=0,max=0;
            int len=rocks.length;
            int[]diff=new int[len];
            for(int i=0;i<len;i++){
                diff[i]=capacity[i]-rocks[i];
            }
            Arrays.sort(diff);
            for(int i=0;i<len;i++){
                if(diff[i]==0){count++;continue;}
                if(additionalRocks>=diff[i]){
                    additionalRocks-=diff[i];
                    count++;
                if(additionalRocks<diff[i]){
                    break;
                }
            }
            return count;
        }
    // }
            // return len;
}
}
