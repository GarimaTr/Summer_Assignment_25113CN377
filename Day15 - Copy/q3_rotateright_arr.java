package Day15;
import java.util.Scanner;
public class q3_rotateright_arr {
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int temp;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the position the array to be rotated(right)");
        int m=in.nextInt();
        for(int i=0;i<m;i++)
        {
            temp=a[n-1];
            for(int j=n-1;j>0;j--)
            {
              a[j]=a[j-1];
            }
            a[0]=temp;
        }
        System.out.println("Changed array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

