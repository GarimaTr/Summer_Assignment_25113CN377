import java.util.Scanner;
public class Day1_q4 {
    public static void main(String[] args) {   
    Scanner in= new Scanner(System.in);
    System.out.println("Enter a positive number");
    int n= in.nextInt();
    int c=0;
    int num=n;
        while(num!=0)
        {
             num/=10;
             c++;
        }
    System.out.println("Number of digits in "+n+"="+c);
    in.close();
}
}