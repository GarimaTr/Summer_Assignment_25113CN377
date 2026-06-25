 import java.util.Scanner;
 public class Day5_largprimefactor {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int max=-1;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                max=i;
                n/=i;
            }
        }
        if(max==-1){
            System.out.println("No prime factor found.");
        }else{
            System.out.println("Largest prime factor is: "+max);
        }
    }
}
