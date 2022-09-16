import java.util.*;
public class xPowerY {
    static long binaryExponentation(int x,int y){
        if(y==0)return 1;
        long res=binaryExponentation(x, y/2);
        return res*res*(y%2==1?x:1);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int x= 5;
        int y= 3;
        System.out.println(binaryExponentation(x,y));
    }
}
