package week4.Day25;
import java.util.Arrays;
import java.util.Scanner;
public class q1_merge_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();}
        System.out.println("Enter the size of second array");
        int m=in.nextInt();
        int []b=new int[m];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
           b[i]=in.nextInt();
        }
    int []c=new int[n+m];
    for(int i=0;i<n;i++){
        c[i]=a[i];
    }
    for(int i=0;i<m;i++){
        c[n+i]=b[i];
    }
    Arrays.sort(c);
    for(int i=0;i<(m+n);i++){
        System.out.print(c[i]+" ");
    }
    in.close();
}}

