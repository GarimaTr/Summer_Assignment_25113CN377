package Day16;
import java.util.Scanner;
public class q3_pairwithsum_arr{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the sum for whom pair to be founded:");
        int s=in.nextInt();
        System.out.println("Pairs who provide given sum in the array: ");
        for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<n;j++)
                {
                if((a[i]+a[j])==s)
                {
                    System.out.println(a[i]+" & "+a[j]);
                }
            }
        }
        in.close();
    }
}