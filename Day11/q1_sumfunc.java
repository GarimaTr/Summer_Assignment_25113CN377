package Day11;
import java.util.Scanner;
public class q1_sumfunc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        int sum=sumofdigits(a,b);
        System.out.println("Sum of digits: "+sum);
    }
    public static int sumofdigits(int a,int b){
        return a+b;
    }
}
