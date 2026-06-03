import java.util.Scanner; 
public class Day2_q2 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int revnum=0,num=n;
        while(num!=0)
        {
            revnum=(revnum+(num%10))*10;
            num/=10;
        }
        System.out.println("The reverse of "+n+" is:"+(revnum/10));
        in.close();
    }
}
