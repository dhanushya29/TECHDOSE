import java.util.*;
public class transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose:");
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
