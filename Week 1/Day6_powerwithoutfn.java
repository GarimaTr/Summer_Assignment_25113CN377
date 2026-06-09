import java.util.Scanner;
public class Day6_powerwithoutfn {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=in.nextInt();
        System.out.println("Enter the exponent:");
        int exp=in.nextInt();
        long result=1;
        for(int i=1;i<=exp;i++){
            result=result*base;
        }
        System.out.println(base+" raised to the power "+exp+" is: "+result);
    }
}
