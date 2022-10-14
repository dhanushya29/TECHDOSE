
import java.util.*;
public class binarySearchBinarySearch {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5};
        int low=0,high=4,search=1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<search){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        if(arr[low]==search || arr[high]==search){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
