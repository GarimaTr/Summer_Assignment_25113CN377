package Day10;
import java.util.Scanner;
public class q3_numpyr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
              int c=(i-1);
            for(int k=1;k<=(2*i-1);k++)
            {
                if(k<=i)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print(c--);
                }
            }
            System.out.println();
        }
    }
}
