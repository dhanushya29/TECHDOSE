import java.util.*;
public class areaOfTriangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        System.out.println((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2);
    }
}
