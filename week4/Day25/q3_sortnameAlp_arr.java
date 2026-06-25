package week4.Day25;
import java.util.Arrays;
import java.util.Scanner;
public class q3_sortnameAlp_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of names");
        int n=in.nextInt();
        in.nextLine(); // consume leftover newline

        String [] a = new String[n];
        System.out.println("Enter the number of names");
        for(int i=0;i<n;i++){
            a[i]=in.nextLine();
        }

        Arrays.sort(a);

        System.out.println("Sorted names:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}
