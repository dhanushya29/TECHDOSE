class Solution {
    public String frequencySort(String s) {
       int[]freq=new int[128];
       for(char ch:s.toCharArray()){
           freq[ch]++;
       }
       PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->freq[b]==freq[a]?a-b:freq[b]-freq[a]);
       for(char ch:s.toCharArray()){
           pq.add(ch);
       }
       StringBuilder str=new StringBuilder("");
       while(!pq.isEmpty())
        str.append(pq.poll());
       return str.toString();
    }
}
