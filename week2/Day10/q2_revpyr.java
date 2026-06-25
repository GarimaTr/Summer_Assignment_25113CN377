package Day10;
import java.util.Scanner;
public class q2_revpyr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row ");
        int n=in.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
