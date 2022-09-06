import java.util.*;
class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	public static void main(String [] args){
		int []nums={1,1,1,2};
		System.out.print(majorityElement(nums));
	}
}