public class bestTimeToBuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int min=Integer.MAX_VALUE,len=prices.length,maxPro=0;
            for(int i=0;i<len;i++){
                if(min>prices[i]){
                    min=prices[i];
                }
                if(maxPro<prices[i]-min){
                    maxPro=prices[i]-min;
                }
            }
            return maxPro;
        }
    }
}
