package Day16;
import java.util.Scanner;
public class q1_missingele_arr{
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int sum=0,actualsum=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
          actualsum+=a[i];
    }
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    System.out.println("Missing term in array: "+(actualsum-sum));
}
}