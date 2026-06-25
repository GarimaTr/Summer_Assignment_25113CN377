package Day12;
import java.util.Scanner;
public class q1_palindfunc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the(n) ");
        int num=in.nextInt();
        if(ispalin(num)==true){
            System.out.println(num+" is palindrome number");
        }
        else{
                        System.out.println(num+" is not a palindrome number");

        }
    }
    static boolean ispalin(int n){
        if (n < 0) {
            return false;
        }

        int originalNumber =(n);
        int reversedNumber = 0;

        // Reverse the(n) mathematically
        while (n != 0) {
            int lastDigit =n % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            n/=10;
        }
        return originalNumber == reversedNumber;
    }
    }
