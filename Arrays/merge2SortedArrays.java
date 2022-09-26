
import java.util.*;
public class merge2SortedArrays {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,5,7,8};
        int []arr2={2,4,6,9,99};
        int[]arr3=new int[9];
        int i=0,j=0,k=0;
        while(i<4 && j<5){
            if(arr[i]<arr2[j]){
                arr3[k++]=arr[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }
        for(;i<4;i++){
            arr3[k++]=arr[i];
        }
        for(;j<5;j++){
            arr3[k++]=arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
