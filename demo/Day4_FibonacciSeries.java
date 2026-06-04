import java.util.Scanner;
public class Day4_FibonacciSeries {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=in.nextInt(); 
        int a=0,b=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        in.close();
    }
}