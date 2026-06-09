import java.util.Scanner;
public class Day2_q4 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int num=n,revnum=0;
        while(num!=0)
        {
            int r=num%10;
            revnum=revnum*10+r;
            num/=10;
        }
        if(n==revnum)
        {
            System.out.println(n+" is a palindrome number");
        }
        else
        {
            System.out.println(n+" is not a palindrome number");
        }
        in.close();
    }
}