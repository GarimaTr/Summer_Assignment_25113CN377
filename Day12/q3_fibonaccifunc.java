package Day12;
import java.util.Scanner;

public class q3_fibonaccifunc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        printFibonacci(num);
        }
        public static void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series (" + terms + " terms): ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); 
    }
}
