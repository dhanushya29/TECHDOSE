class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        list.addAll(map.values());
        return list;
    }
}
