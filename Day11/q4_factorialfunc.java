package Day11;
import java.util.Scanner;
public class q4_factorialfunc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int result=primecheck(n);
        System.out.println("Factorial of "+n+ " is: "+result);
    }
    static int primecheck(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    
}
