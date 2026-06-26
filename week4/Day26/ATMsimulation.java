package week4.Day26;
import java.util.Scanner;
class BankAccount{
    private double balance;
    private int pin;

    public BankAccount(double balance,int pin){
        this.balance=balance;
        this.pin=pin;
    }
    public boolean validatePin(int enteredPIN){
        return this.pin == enteredPIN;
    }
    public double displayBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("✅ Deposited ₹ " + amount);
            System.out.println( "New balance: ₹ " + balance);
        }
        else{
            System.out.println("Invalid amount ❌ ");
        }
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("*INVALID AMOUNT*");
        }else if(amount>balance){
            System.out.println("**INSUFFICIENT BALANCE**");
        }else{
            balance-=amount;
            System.out.println("Withdrew ₹"+amount);
            System.out.println("Remaining balance: ₹"+balance);
        }
    }
    public void changePin(int newPin){
        pin=newPin;
        System.out.println("✅ PIN changed successfully");
    }
}


 class ATMsimulation {
     static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount account= new BankAccount(10000,1234);
       
        System.out.println("=== Welcome to ATM ===");
        int attempt=3;
        boolean flag=false;

        while(attempt>0){
        System.out.println("Enter PIN:");
        int enteredPIN=in.nextInt();
        if(account.validatePin(enteredPIN)){
            flag=true;
            break;
        }else{
            attempt--;
            System.out.println("❌ Wrong PIN. Attempts left: " + attempt);
        }
        }
        if(!flag){
            System.out.println(" Too many wrong attempts \n🔒 Card blocked.");
        }
        int choice =0;
        while(choice!=5){
            System.out.println("\n--- ATM OPTION ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Depoist");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.println("Choose option: ");
            choice=in.nextInt();

            switch(choice){
                case 1:
                    System.out.println("💰 Balance: ₹" + account.displayBalance());
                    break;
                case 2:
                    System.out.println("Enter depoist amount: ");
                    double dep=in.nextDouble();
                    account.withdraw(dep);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double wd=in.nextDouble();
                    account.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Enter new PIN: ");
                    int newPin=in.nextInt();
                    account.changePin(newPin);
                    break;
                case 5:
                    System.out.println("***Thank you for using ATM***");        
                    break;
                default:
                    System.out.println("❌ Invalid option.");         
            }
        }
    }
}
 
