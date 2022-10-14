public class weekly_307 {
    // class Solution {
        public String largestPalindromic(String num) {
            int len=num.length();
            int[]freq=new int[10];
            for(int i=0;i<len;i++){
                freq[num.charAt(i)-'0']++;
            }
            int odd=-1;
            for(int i=9;i>=0;i--){
                if((freq[i]&1)==1){
                    odd=i;
                    break;
                }
            }
            String ans="";
            for(int i=9;i>=0;i--){
                int ct=freq[i]/2;
                if(ans.length()==0 && i==0){
                    return (odd==-1?"0":odd+"");
                }
                ans=(i+"").repeat(ct)+ans;
            }
            String res=new StringBuilder(ans).reverse().toString();
            return res+(odd!=-1?odd+"":"")+ans;
        }
    // }
}
