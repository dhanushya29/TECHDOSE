import java.util.Arrays;

public class biweekly_80 {
    // class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            Arrays.sort(potions);
            int len=spells.length;
            int[]res=new int[len];
            for(int i=0;i<len;i++){
                int l=0,r=potions.length-1,ans=0;
                while(l<=r){
                    int m=l+(r-l)/2;
                    long prod=((long)spells[i]*potions[m]);
                    if(prod>=success){
                        r=m-1;
                        ans=potions.length-m;
                    }else l=m+1;
                }
                res[i]=ans;
            }
            return res;
        }
    // }
}
