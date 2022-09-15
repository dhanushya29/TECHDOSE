import java.util.Scanner;
public class palindromeNum {
    public static boolean isPalindrome(int x) {
        int sum=0,temp;      
        temp=x;    
        while(x>0){
            sum=(sum*10)+(x%10);
            x/=10;
        }
        if(temp==sum)
            return true;
        else
            return false;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(isPalindrome(x)==true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
