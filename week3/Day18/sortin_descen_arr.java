package Day18;
import java.util.Scanner;
public class sortin_descen_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to sort: ");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter "+n+" integers:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }   
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
