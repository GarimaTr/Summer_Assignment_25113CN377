package Day12;
import java.util.Scanner;
public class q2_armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        if(isArmstrong(num)==true){
            System.out.println(num+" is an Armstrong number");
        }
        else{
              System.out.println(num+" is not an Armstrong number");
        }
        }
        public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int tempNumber = number;
        int digitsCount = 0;
        int sum = 0;

        while (tempNumber != 0) {
            digitsCount++;
            tempNumber /= 10;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            sum += Math.pow(lastDigit, digitsCount);
            tempNumber /= 10;
        }

        return sum == originalNumber;
    }
}
