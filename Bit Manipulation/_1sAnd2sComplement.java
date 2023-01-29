import java.io.*;
import java.util.Scanner;

public class _1sAnd2sComplement {
    public static void main(String[] args) throws IOException {


        // BufferedReader Class for Fast buffer Input
        File inFile = new File("C:\\Coding\\input.txt");
        Scanner sc = new Scanner(inFile);

        // PrintWriter class prints formatted representations
        // of objects to a text-output stream.
        // PrintWriter pw=new PrintWriter(new
        //         BufferedWriter(new FileWriter("C:\\Coding\\output.txt")));
        // same print or println can be used
        // Your code goes Here
        int n=sc.nextInt();
        int a=(1<<Integer.toBinaryString(n).length())-1;
        System.out.println(n^a);
        System.out.print(n^a | 1);
    }
}