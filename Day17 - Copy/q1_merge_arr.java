package Day17;
import java.util.Scanner;
public class q1_merge_arr
{
public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        System.out.println("Enter size of second array");
        int m=in.nextInt();
        int [] b=new int[m];
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }

        int [] c=new int[n+m];
    System.arraycopy(a, 0, c,0 ,n);   
    System.arraycopy(b, 0, c, n, m);
        System.out.println("Merger array:");
        for(int i=0;i<(n+m);i++){
            System.out.print(c[i]+" ");
        }
}
}