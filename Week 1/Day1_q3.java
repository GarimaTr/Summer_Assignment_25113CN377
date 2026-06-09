import java.util.Scanner;
public class Day1_q3 {
    public static void main(String[] args) {   
    Scanner in= new Scanner(System.in);
    System.out.println("Enter a positive number");
    int n= in.nextInt();
    if(n<0)
    {
        System.out.println("invalid number");
    }
     int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }
    System.out.println("Factorial of "+n+"="+fact);
    in.close();
}
}