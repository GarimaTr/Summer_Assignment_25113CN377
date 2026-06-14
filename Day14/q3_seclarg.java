package Day14;
import java.util.Scanner;
public class q3_seclarg {
 public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int max2=-1,max=-1,c=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }}
        for(int i=0;i<n;i++){
            if(a[i]>max2 && a[i]!=max){
                max2=a[i];
                c=i;
            }
        } 
        System.out.println("Second largest number in the array is: "+max2+" at location "+(c+1));   
    } 
}
