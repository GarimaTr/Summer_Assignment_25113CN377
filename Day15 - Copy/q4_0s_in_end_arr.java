package Day15;
import java.util.Scanner;
public class q4_0s_in_end_arr {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                b[c]=a[i];
                c++;
            }
        }
        System.out.println("Array with zeros in the end:");
        for(int i=0;i<n;i++){
                    System.out.print(b[i]+" ");
        }
}
}