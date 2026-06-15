import java.util.Scanner;
public class Day7_recursivefibonacci {
    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n=in.nextInt();
        System.out.println("Fibonacci series up to "+n+" terms:");
        for(int i=0;i<n;i++){
        System.out.print(Fibonacci(i)+" ");
        }
    }
}
