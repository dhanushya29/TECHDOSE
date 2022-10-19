public class biweekly_76 {
    // class Solution {
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            long count=0;
            if(total<cost1 && total<cost2)return 1;
            int ind=0;
            while(total-(ind*cost1)>=0){
                count+=(total-(ind*cost1))/cost2+1;ind++;
            }
            return count;
        }
    // }
}
