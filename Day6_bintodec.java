import java.util.Scanner;
public class Day6_bintodec {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        long binary=in.nextLong();
        long decimal=0;
        long base=1;
        while(binary>0){
            decimal=decimal+(int)(binary%10)*base;
            binary=binary/10;
            base=base*2;
        }
        System.out.println("Decimal representation: "+decimal);
    }
}
