import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class biweekly_82 {
    // class Solution {
        public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
            int ans=0;
            Arrays.sort(buses);
            Arrays.sort(passengers);
            int lastPas=0,lastCap=0,n=buses.length,n2=passengers.length;
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n2;i++){
                set.add(passengers[i]);
            }
            int j=0;
            for(int i=0;i<n;i++){
                lastCap=0;
                while(j<n2 && passengers[j]<=buses[i] && lastCap<capacity){
                    lastCap++;
                    lastPas=passengers[j];j++;
                }
            }
            if(lastCap<capacity){
                ans=buses[n-1];
            }else ans=lastPas-1;
            // System.out.print(ans);
            while(set.contains(ans)){
                ans--;
            }
            return ans;
        }
    // }
}
