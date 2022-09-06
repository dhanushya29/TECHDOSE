import java.util.*;
class SingleNumber2 {
    public static int singleNumber(int[] nums) {
        int i = 0, j=0;
        for(int curr : nums){
            i = (i^curr) & (~j);
            j = (j^curr) & (~i);
        }
        return i;
    }
    public static void main(String[]args){
        int[] nums={2,2,2,3};
		System.out.print(singleNumber(nums));
	}		
}