package Day11;
import java.util.Scanner;
public class q2_findmax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
         int m=max(a,n);
         System.out.println("Maximum number:"+m);
      }
    public static int max(int b[],int n){
        int m=-1;
        for(int i=0;i<n;i++){
            if(b[i]>m){
              m=b[i];
            }
        }
        return m;
    }
}
