package Day11;
import java.util.Scanner;
public class q3_primefunc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        primecheck(n);
    }
    static void primecheck(int a)
    {
        int c=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                c++;
                System.out.println(a+" is not a prime number");
                break;
            }
        }
        if(c==0){
         System.out.println(a+" is a prime number");
    }
}}
