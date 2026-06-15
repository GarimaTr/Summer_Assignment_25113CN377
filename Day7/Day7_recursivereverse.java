import java.util.Scanner;
public class Day7_recursivereverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println("The reverse of "+n+" = "+rev(n,0));
    }
     public static int rev(int n,int r){
        if(n==0){
            return r;}
            else  {
                int digit=n%10;
                r=r*10+ digit;
                return rev(n/10,r); 
            }}
}
