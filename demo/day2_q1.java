import java.util.Scanner;
public class day2_q1 {
 public static void main(String args[])
 {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=in.nextInt();
    int num=n,sum=0;
    while(num!=0)
    {
        int r=num%10;
        sum+=r;
        num/=10;
    }
    System.out.println("Sum of digits of "+n+" is:"+sum);
    in.close();
 }
}
