import java.util.*;
public class NCR {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int[][] arr=new int[1001][1001];
        for(int i=0;i<=1001;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.println(arr[n][r]);
    }
}