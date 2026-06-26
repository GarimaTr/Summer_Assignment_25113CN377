package week4.Day26;
import java.util.Scanner;
public class votingelegibility {
     public static void main(String args[]){
     Scanner in=new Scanner(System.in);
     System.out.println("Enter your age");
     int n=in.nextInt();
     if(n>=18){
        System.out.println("You are eligible");
     }
     else{
        System.out.println("You are not eligible");
     }
     in.close();
}
}
