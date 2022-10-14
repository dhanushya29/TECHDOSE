import java.util.*;
public class weekly_305{
    // class Solution {
        public int reachableNodes(int n, int[][] edges, int[] restricted) {
            Map<Integer,List<Integer>> map=new HashMap<>();
            Set<Integer>visited=new HashSet<>();
            for(int[]node:edges){
               int from=node[0],to=node[1];
               List<Integer> list=map.getOrDefault(from,new ArrayList<Integer>());
                list.add(to);
                map.put(from,list);
                
                List<Integer> list1=map.getOrDefault(to,new ArrayList<Integer>());
                list1.add(from);
                map.put(to,list1);
                 // System.out.println(map);
            }
            // System.out.println(map);
            Set<Integer>restrict =new HashSet<>();
            for(int i=0;i<restricted.length;i++){
                restrict.add(restricted[i]);
            }
            Queue<Integer> q=new LinkedList<>();
            int count=0,front=0;
            q.add(0);
            visited.add(0);
            
            int ind=0;
            while(!q.isEmpty()){
                front=q.poll();
                 count++;
                for(int child:map.getOrDefault(front,new ArrayList<>())){
                    if(!restrict.contains(child) && !visited.contains(child)){
                        q.add(child);visited.add(child);
                    }
                }
            }
            return count;
        }
    // }
}