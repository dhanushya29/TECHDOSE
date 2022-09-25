package TECHDOSE.Arrays;

public class mergeWithoutExtraSpace {
        public static void swap(int[]nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public void merge(int[] nums, int m, int[] nums2, int n) {
            int gap=(m+n)/2 + (m+n)%2;
            for(int i=m;i<m+n;i++){
                nums[i]=nums2[i-m];
            }
            int low=0,high=low+gap;
            while(gap>=1){
                //System.out.println(gap);
                low=0;high=low+gap;
                while(high<m+n){
                    if(nums[low]>=nums[high]){
                       swap(nums,low,high);
                    }
                    low++;high++;
                }
                 if(gap==1)break;
                gap=gap/2 + gap%2;
            }
        }
    }
