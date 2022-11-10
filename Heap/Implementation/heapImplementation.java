package TECHDOSE.Heap.Implementation;

import java.util.Arrays;

public class heapImplementation {
    public static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void heapify(int[]arr,int i,int N){
        int l=2*i;
        int r=2*i+1;
        int largest=i;
        if(l<N && arr[l]>arr[largest]){largest=l;}
        if(r<N && arr[r]>arr[largest]){largest=r;}
        if(largest!=i){
            swap(i,largest,arr);
            heapify(arr, largest, N);
        }
    }
    public static void buildHeap(int[]arr,int N){
        int mid=(N>>1) + (N&1);
        for(int i=mid;i>=1;i--){
            heapify(arr,i,N);
        }
    }
    public static int heap_pop(int[]arr,int N){
        int max=arr[1];
        arr[1]=arr[N-1];
        N--;
        heapify(arr,1,N);
        // System.out.println(max);
        return max;
    }
    public static void perculateUp(int[]arr,int N,int i){
        while(i>1 && arr[i/2]<arr[i]){
            swap(i,i/2,arr);
            i/=2;
        }
    }
    public static void heap_push(int[]arr,int N,int val){
        arr[N++]=val;
        perculateUp(arr, N, N-1);
    }
    public static void increaseKey(int[]arr,int N,int i,int diff){
        if(diff<0)return;
        arr[i]+=diff;
        perculateUp(arr,N,i);
    }
    public static void decreaseKey(int[] arr,int N,int i,int diff){
        if(diff>=0)return;
        arr[i]+=diff;
        heapify(arr,i,N);
    }
    public static int[] heapSort(int[]arr,int N){
        buildHeap(arr,N);
        int heapsize=N;
        int [] res=new int[N-1];
        for(int i=1;i<N;i++){
            res[i-1]=heap_pop(arr,heapsize);
            heapsize--;
        }
        return res;
    }
    public static void main(String[]args){
        int[]arr={0,8,6,7,2,10,5};
        int N=arr.length;
        arr=heapSort(arr,N);
        System.out.print(Arrays.toString(arr));
    }
}
