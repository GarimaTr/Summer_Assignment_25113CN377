import java.util.Scanner;
public class Day9_repeatedcharpattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size in alphabet");
        char ch=in.next().charAt(0);
        for(char i='A';i<=ch;i++){
            for(char j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    } 
}
