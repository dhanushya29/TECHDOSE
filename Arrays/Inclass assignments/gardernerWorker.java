public class gardernerWorker {
    public static boolean check(int[]arr,int w,int a){
        int temp=a;
        for(int n:arr){
            if(temp<n){
                if(w==1)return false;
                temp=a;
                w--;
            }
            if(temp>=n)temp-=n;
            // else return false;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=0,max=0;
        for(int i=0;i<n;i++){
            min=Math.max(min,arr[i]);
            max+=arr[i];
        }
        int low=min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,w,mid)){
                high=mid-1;
            }else low=mid+1;
        }
        System.out.println(low);
        // end of the code
        // pw.flush();

    }
}