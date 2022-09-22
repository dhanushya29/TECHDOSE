import java.util.*;
public class quickSort{
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void qsort(int []arr,int i,int j,int pivot){
        while(i<pivot){
        if(arr[j]<arr[pivot]){
            i++;
            swap(arr[i],arr[j]);
            j++;
        }else if(arr[j]>arr[pivot]){
            j++;
        }else{
            break;
        }
      }
    }
    static void quickSort(int []arr,int low,int high){
        if(low<high){
            int partite=partition(arr,low,high);
            quickSort(arr,low,partite-1);
            quickSort(arr,partite+1,high);
        }
    }
    static int partition(int[]arr,int low,int high){
        int i=low-1,pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}