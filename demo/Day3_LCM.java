import java.util.Scanner;
public class Day3_LCM {
    public static long gcd(long a,long b)
    {
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
         }return gcd;
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=in.nextInt(); 
        System.out.println("Enter the second number:");
        int b=in.nextInt();
        long lcm=(a*b)/gcd(a,b);
        System.out.println("The LCM of "+a+" and "+b+" is: "+lcm);
            in.close();
        }
}
