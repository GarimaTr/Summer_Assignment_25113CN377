package Day13;
import java.util.Scanner;
public class q3_larg_small_est_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
    System.out.println("Largest number in the array: "+max);
    System.out.println("Smallest number in the array: "+min);
}
}