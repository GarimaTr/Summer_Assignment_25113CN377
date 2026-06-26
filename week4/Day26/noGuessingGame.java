package week4.Day26;
import java.util.Scanner;
public class noGuessingGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=(int)(Math.random()*101);
         System.out.println("Enter a number between 0  and 100");
        int num=in.nextInt();
        
        do{
            if(num>r){
                System.out.println("choose a lower number");} 
            else if(num<r){
                System.out.println("Choose a higher number");
            }
            else{
            System.out.println("You guessed the number!!!!");
            break;}
    
            num=in.nextInt();
    }while(true);
}
}