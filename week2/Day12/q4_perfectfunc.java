package Day12;
import java.util.Scanner;

public class q4_perfectfunc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
      if(isPerfect(num)==true){
        System.out.println(num+" is a perfect number");
      }
      else{
                System.out.println(num+" is not  a perfect number");

      }
        }
      public static boolean isPerfect(int number) {
        // Perfect numbers must be positive integers greater than 1
        if (number <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i; 
                
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }
}

