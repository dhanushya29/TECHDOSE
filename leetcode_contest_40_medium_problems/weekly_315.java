public class weekly_315 {
    // class Solution {
        public int rev(int n){
            int res=0;
            while(n>0){
                res=res*10+(n%10);
                n/=10;
            }
            return res;
        }
       public boolean sumOfNumberAndReverse(int num) {
           int i=0;
           for(;i<=num;i++){
               if(rev(i)+i==num){
                   return true;
               }
           }
           return false;
       }
//    }
}