package Day18;
import java.util.Scanner;
public class binarysearch_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n=in.nextInt();
        int [] a= new int [n];

        System.out.println("Enter "+n+" integers in ascending order: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        System.out.println("Enter the search value:");
        int item=in.nextInt();

        int beg=0,end=n-1;
        int mid=(beg+end)/2;
        boolean found=false;

        while(beg<=end){
            if(a[mid]== item){
                found=true;
                System.out.println(item+" found at location "+(mid+1));
                break;
            }
            else if(a[mid]<item){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(beg+end)/2;
        }
        if(!found){
            System.out.println(item+" is not found.");
        }
        in.close();
    }}