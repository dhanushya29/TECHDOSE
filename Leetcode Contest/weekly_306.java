public class weekly_306{
    // class Solution {
        public int edgeScore(int[] edges) {
            long max=Integer.MIN_VALUE;
            int ans=0,len=edges.length;
            long[]res=new long[len];
            for(int i=0;i<len;i++){
                res[edges[i]]+=i;
            }
            for(int i=0;i<len;i++){
                if(max<res[i]){
                    max=res[i];
                    ans=i;
                }
            }
            return ans;
        }
    // }
}