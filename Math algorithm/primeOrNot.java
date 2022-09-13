import java.util.*;
class primeOrNot{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean temp=true;
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        temp=false;
      }
    }
    System.out.print(temp);
  }
}
