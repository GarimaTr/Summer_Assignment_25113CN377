import java.util.Scanner;
public class Day4_primeinrange {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the lower limit");
        int low=in.nextInt();
        System.out.println("enter the upper limit");
        int up=in.nextInt();
        System.out.println(" Set of prime numbers in the given range is:");
        for(int i=low;i<=up;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
