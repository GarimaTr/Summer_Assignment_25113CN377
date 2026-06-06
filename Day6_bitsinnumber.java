import java.util.Scanner;
public class Day6_bitsinnumber {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number;");
        int n=in.nextInt();
        int  num=n,bin=0,c=0;
        while(num>0){
            bin=bin*10+num%2;
            num/=2;
        }
        int b=bin;
        while(bin>0){
            if(bin%10==1){
                c++;}
            bin/=10;
            }
        System.out.println("The binary representation of " + n + " is: " + b);
        System.out.println("The number of bits in " + n + " is: " + c);
    }
}
