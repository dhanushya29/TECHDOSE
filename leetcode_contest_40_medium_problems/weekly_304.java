public class weekly_304 {
    // class Solution {    
        public int maximumGroups(int[] grades) {         
            int res=-1,n=grades.length;         
            int low=0,high=n;         
            while(low<=high){             
                long mid=low+(high-low)/2;            
                if((mid*(mid+1)/2 ) <= n){             
                    res=(int)mid;                
                    low=(int)mid+1;             
                }else{                 
                    high=(int)mid-1;           
                }
            }
            return res;
        }
    // }
}
