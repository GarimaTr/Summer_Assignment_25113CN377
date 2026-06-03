import java.util.Scanner;
public class Day3_primeinrange
{
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start=in.nextInt();
        System.out.println("Enter the ending number:");
        int end=in.nextInt();
         System.out.println("Prime numbers between "+start+" and "+end+" are:");
         System.out.println("*********************************");

        for(int i=start;i<=end;i++)
        {
           if(isprime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isprime(int n)
    {
        boolean isprime=true;
        if(n<=1)
        {
         isprime=false;   
        } else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {isprime=false;
                    break;
                }
            }
        }
         return isprime;
    }
}