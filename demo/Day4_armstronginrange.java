import java.util.Scanner;
public class Day4_armstronginrange {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the lower limit:");
    int low=in.nextInt();
    System.out.println("Enter the upper limit:");
    int up=in.nextInt();
    System.out.println("Armstrong numbers between "+low+" and "+up+" are:");
    for(int i=low;i<=up;i++){
        int n=i,c=0,sum=0;
        while(n>0){
            c++;
            n/=10;
        }
        n=i;
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,c);
            n/=10;
        }
        if(sum==i){
            System.out.print(i+" ");
        }
    }
}    
}
