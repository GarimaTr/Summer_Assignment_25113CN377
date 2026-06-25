package Day16;
import java.util.Scanner;
public class q4_removeduplicates_arr {
     public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int c,d=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Given array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        for(int i=0;i<n;i++){
            c=0;
           for(int j=0;j<n;j++){
            if(a[i]==a[j]){
                c++;
            }
            if(c==2){
                for(int k=0;k<n;k++){
                    if(a[i]==a[j]){
                        a[j]=0;
                        a[i]=0;
                    }
                }
            }}
           }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                b[d]=a[i];
                d++;
            }
        }
        System.out.println("");
        System.out.println("Array after removal of duplicates elements:");
        for(int i=0;i<n;i++){
            if(b[i]==0){
                System.out.print("");
            }
            else{
                System.out.print(b[i]+", ");
            }
        }
        }
        }
