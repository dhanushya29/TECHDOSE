public class biweekly_74 {
    // class Solution {
        public long maximumSubsequenceCount(String text, String pattern){
            long res = 0,one = 0, two = 0;
            for(char c: text.toCharArray()){
                if(pattern.charAt(1)==c){
                  res+= one;
                    two++;
                }
                if(pattern.charAt(0)==c) one++;
            }
            return Math.max(res+one,res+two);
        }
    // }
}
