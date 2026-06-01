import java.util.Scanner;
public class day1_q2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n=scan.nextInt();
        int multiply=1;
          System.out.println("Multiplication table for"+n+" is:");
            System.out.println("*********************************");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
        scan.close();
    }
}