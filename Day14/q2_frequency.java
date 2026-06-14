package Day14;
import java.util.Scanner;
public class q2_frequency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element whose frequency  to be calculated");
        int temp=in.nextInt();    
        for(int i=0;i<n;i++){
            if(a[i]==temp){
                c++;
            }}
        System.out.println(temp+" is present "+c+ " times in the array");
}}
