import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int num=n&(n-1);
    if((n & (n-1)) == 0){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
}
