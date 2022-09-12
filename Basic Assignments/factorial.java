import java.math.BigInteger;
import java.util.*;
public class factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger facto=new BigInteger("1");
        for(int i=2;i<=n;i++){
            facto=facto.multiply(BigInteger.valueOf(i));
        }
        System.out.println(facto);
    }
}
