public class weekly_282 {
    // class Solution {
        public int[] frequency(String str,int n){
            int[] freq=new int[26];
            for(int i=0;i<n;i++){
                freq[str.charAt(i)-'a']++;
            }
            return freq;
        }
        public int minSteps(String s, String t) {
            int [] freq1=new int[26];
            int [] freq2=new int[26];
            int count=0;
            int len=s.length();
            int len2=t.length();
            freq1=frequency(s,len);
            freq2=frequency(t,len2);
            for(int i=0;i<26;i++){
                    count+=Math.abs(freq1[i]-freq2[i]);
            }
            return count;
        }
    // }
}
