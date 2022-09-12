import java.util.*;
public class pascalTriangle {
    public static int fact(int n){
        // int facto=1;
        // for(int i=2;i<=n;i++){
        //     facto*=i;
        // }
        // return facto;
        if(n==0)return 1;
        return n*fact(n-1);
    }
    static int res(int n,int r){
        return fact(n)/fact(n-r)*fact(r);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int f=fact(n);
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+res(i,j));
            }
            System.out.println();
        }
    }
}
