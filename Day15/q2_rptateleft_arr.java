package Day15;
import java.util.Scanner;
public class q2_rptateleft_arr{
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the position the array to be rotated");
        int m=in.nextInt();
        for(int i=0;i<m;i++){
            temp=a[0];
            for(int j=0;j<(n-1);j++){
              a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        System.out.println("Changed array");

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
