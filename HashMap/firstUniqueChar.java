class Solution {
    public int firstUniqChar(String s) {
        int len=s.length();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<len;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i))==1)return i;
        }
        return -1;
    }
}
