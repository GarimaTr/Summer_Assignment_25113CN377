import java.util.Scanner;
public class Day7_recursivefact {
    public static long calculate(int n){
        if(n==0||n==1){
            return 1;
        }        return n*calculate(n-1);
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n=in.nextInt();
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result=calculate(n);
            System.out.println("Factorial of "+n+" is: "+result);
        }
    }
}

