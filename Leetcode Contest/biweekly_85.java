public class biweekly_85 {
    // class Solution {
        public int secondsToRemoveOccurrences(String s) {
            int count=0;
            while(s.indexOf("01")>=0){
                s=s.replace("01","10");
                ++count;
            }
            return count;
        }
    // }
}
