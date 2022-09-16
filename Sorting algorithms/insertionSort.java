import java.util.*;
public class insertionSort {
    public static void insertionSortFunc(List<Integer>list,int i){
        list.add(i);
        int len=list.size();
        for(int j=len-1;j>0;j--){
            if(list.get(j)<list.get(j-1)){
                int temp=list.get(j);
                list.set(j,list.get(j-1));
                list.set(j-1,temp);
            }
        }
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer>list=new ArrayList<Integer>();
        for(int i:arr){
            insertionSortFunc(list,i);
        }
        System.out.println(list);
    }
}