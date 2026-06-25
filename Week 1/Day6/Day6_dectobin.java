import java.util.Scanner;
class Day6_dectobin {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n=in.nextInt();
         long binary=0;
        while(n>0){
            binary=binary*10+n%2;
            n/=2;
        }
        System.out.println("Binary representation: "+binary);
    }
}