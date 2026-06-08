import java.util.Scanner;
public class Day8_chartriangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=in.next().charAt(0);
        for(char i='A';i<=ch;i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
