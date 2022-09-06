import java.util.*;
class SingleNumber1 {
    public static int singleNumber(int[] nums) {
        int size=nums.length,res=0;
        for(int i=0;i<size;i++){
            res^=nums[i];
        }
        return res;
    }
	public static void main(String[]args){
        int[]nums={2,3,3};
        System.out.print(singleNumber(nums));
	}		
}
