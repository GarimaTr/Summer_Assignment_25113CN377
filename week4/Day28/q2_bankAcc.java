package week4.Day28;
import java.util.Scanner;
 
class account{
    int accNo;
    double balance;
    String name;

    void input(Scanner in){
        System.out.println("Enter your Account number");
        accNo=in.nextInt();
        in.nextLine();

        System.out.println("Enter Account holder Name:");
        name=in.nextLine();

        System.out.println("Enter initial Balance:");
        balance=in.nextDouble();
        in.nextLine();
    }

    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawn Successfully!");
        }
    }
    void depoist(double amountdes){
       balance=balance+amountdes;
       System.out.println("Depoisted Successfully");
    }

    void display(){
        System.out.println("Account number: "+accNo);
        System.out.println("Account holder Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
public class q2_bankAcc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice=0;
        account a=new account();
        a.input(in);
        while(choice!=4){
        System.out.println("======BANK MENU=======");
        System.out.println("1.Depoist\n 2.Withdraw\n 3.Display\n 4.Exit");
        System.out.println("Enter your choice");
        choice=in.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Enter depoist amount");
                double depAmount=in.nextDouble();
                a.depoist(depAmount);
                break;
            case 2 :
                System.out.println("Enter Withdraw amount");
                double withAmount=in.nextDouble();
                a.withdraw(withAmount);
                break;
            case 3:
                 a.display();
                break;
            case 4:
                System.out.println("Thank You for using Bank"); 
                break;
            default:
                throw new AssertionError();
        }
    }
}
}