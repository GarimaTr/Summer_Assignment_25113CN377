import java.util.Scanner;
public class Day4_Armstrongnum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=in.nextInt();
        int n=num,c=0,sum=0;
        while(n>0){
            c++;
            n/=10;
        }
        n=num;
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,c);
            n/=10;
        }
        if(sum==num){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }
        }
    }

