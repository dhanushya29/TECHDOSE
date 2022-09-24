package TECHDOSE.Arrays;
import java.util.*;
public class binarySearchRotatedArray {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int []arr={5,6,1,2,3,4};
        int low=0,high=4,search=1,index=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==search)index=mid;
            if(arr[low]<=arr[mid]){
                if(arr[low]<=search && arr[mid]>=search){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=arr[high]){
                    if(arr[mid]<=search && arr[high]>=search){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
        }
        System.out.println(index);
    }
}
