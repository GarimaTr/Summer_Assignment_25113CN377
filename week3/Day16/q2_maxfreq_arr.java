package Day16;
import java.util.Scanner;
public class q2_maxfreq_arr {
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int max=0,flag=0,c=0;
         System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
                if(c>max){
                    max=c;
                    flag=a[i];
                }
            }
        }
        System.out.println(flag+" is with maximun frequency of: "+max);
    }
}
