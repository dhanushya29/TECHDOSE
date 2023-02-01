class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int slen=s.length(),plen=p.length();
        char[]c=p.toCharArray();
        Arrays.sort(c);
        String temp=new String(c);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<slen;i++){
            int l=i+plen;
            if(l>slen)break;
            String str=s.substring(i,l);
            char[]ch=str.toCharArray();
            Arrays.sort(ch);
            str=new String(ch);
            if(str.equals(temp)){
                list.add(i);
            }
        }
        return list;
    }
}
