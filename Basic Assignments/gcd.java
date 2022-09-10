import java.util.*;
public class gcd{
    public static int gcdFunc(int a,int b){
        if(b==0)return a;
        else return gcdFunc(b, a%b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(gcdFunc(m, n));
    }
}