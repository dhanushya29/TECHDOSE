public class weekly_298 {
    // class Solution {
        public int minimumNumbers(int num, int k) {
                    if(num==0)return 0;
           int i=1,sum=k;
            while(i<=10){
               if(sum%10==num%10)return i;
               if(sum>num)return -1;
               sum+=k;i++;
           }
            return -1;
        }
    // }
}
