package Day13;
import java.util.Scanner;
public class q2_sum_avg_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        double avg=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=(double)sum/n;
        System.out.println("Sum of elements of array: "+sum);
        System.out.println("Average of elements of array: "+avg);
    }
}
