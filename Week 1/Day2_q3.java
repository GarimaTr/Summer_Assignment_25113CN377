import java.util.Scanner;
public class Day2_q3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int num=n,prod=1;
        while(num!=0)
        {
            int r=num%10;
            prod*=r;
            num/=10;
        }
        System.out.println("Product of digits of "+n+" is:"+prod);
        in.close();
    }
}