import java.util.Scanner;
public class Day7_recursivesumofdigit {
   
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.println("sum of digits of "+n+" = "+sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;}
            else  {
                return (n%10)+sum(n/10); 
            }
    }
}
