import java.util.Scanner;
public class Day3_GCD {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=in.nextInt(); 
        System.out.println("Enter the second number:");
        int b=in.nextInt();
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
         }System.out.println("The GCD of "+a+" and "+b+" is: "+gcd);
            in.close();
        }
    }
