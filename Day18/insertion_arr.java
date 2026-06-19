package Day18;
import java.util.Scanner;
public class insertion_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n=in.nextInt();
        int [] a= new int [n];

        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
