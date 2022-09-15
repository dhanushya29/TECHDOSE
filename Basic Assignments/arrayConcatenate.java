import java.util.*;
public class arrayConcatenate {
        public static int[] array(int[] nums) {
            int len=nums.length;
            int[]res=new int[len+len];
            for(int i=0;i<len+len;i++){
                res[i]=nums[i%len];
            }
            return res;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[]res=new int[n+n];
        res=array(nums);
        for(int i=0;i<n+n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
