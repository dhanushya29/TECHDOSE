import java.util.*;
public class climbingStairs {
    public static int climbStairs(int n){
        int []f=new int[n+2];;
        f[1]=1;
        f[2]=2;
        for(int i=3;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
}
