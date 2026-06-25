package Day13;
import java.util.Scanner;
public class q4_c_even_odd_arr {
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int c_even=0,c_odd=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c_even++;
            }
            else{
                c_odd++;
            }
        }
        System.out.println("Number of even elements in array: "+c_even);
        System.out.println("Number of odd elements in array: "+c_odd);
    }
}

