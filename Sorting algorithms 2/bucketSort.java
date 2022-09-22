import java.util.*;
public class bucketSort {
    public static int[]bucketSort(int[]arr,int n){
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i], min);
        }
        int range=max-min+1;
        double loadFactor=3.0;
        int bucketSize=(int)Math.ceil(range/loadFactor);
        List<Integer>[]hash=new ArrayList[bucketSize];
        for(int i=0;i<bucketSize;i++){
            hash[i]=new ArrayList<>();
        }
        for(int i:arr){
            int val=(i-min)/(int)loadFactor;
            insert(hash[val],i);
        }
        int ind=0;
        for(int i=0;i<bucketSize;i++){
            for(int val:hash[i]){
                arr[ind++]=val;
            }
        }
        return arr;
    }
    public static void insert(List<Integer>list,int i){
        list.add(i);
        int j=list.size()-1;
        while(j>0 && list.get(j-1)>list.get(j)){
              swap(list,j,j-1);
              j--;
        }
    }
    public static void swap(List<Integer> list,int a,int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]res=new int[n];
        res=bucketSort(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
