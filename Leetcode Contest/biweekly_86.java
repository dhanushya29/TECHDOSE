public class biweekly_86 {
    // class Solution {
        public String baseRep(int n,int i){
            String res="";
            while(n!=0){
                int temp=n%i;
                res+=temp;
                n/=i;
            }
            return res;
        }
        public boolean isPalindrome(String n){
            int len=n.length();
            String rev="";
            while(len>0){
                rev+=n.charAt(len-1);
                len--;
            }
            if(n.equals(rev)){
                return true;
            }
            return false;
        }
        public boolean isStrictlyPalindromic(int n) {
            String res="";
            for(int i=2;i<=n-2;i++){
                res=baseRep(n,i);
                if(!isPalindrome(res)){
                    return false;
                }
            }
            return true;
        }
    // }
}
