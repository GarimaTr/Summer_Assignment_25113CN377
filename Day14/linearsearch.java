package Day14; 
import java.util.Scanner;
public class linearsearch{
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
        System.out.println("Enter the number to be found");
        int temp=in.nextInt();    
        for(int i=0;i<n;i++){
            if(a[i]==temp){
                c++;
                System.out.println(temp+ " is founded at location "+(i+1)+" in the array");
                break;
            }
        }
            if(c==0){
                System.out.println(temp+" is not founded in the array");
            }
    }
}