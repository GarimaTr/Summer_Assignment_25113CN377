
package Day24;
import java.util.Scanner;

public class q2_compressStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int c = 1;
            while((i+1<s.length()) &&(ch==s.charAt(i+1))){
                c++;
                i++;
            }
           System.out.print(ch+""+c);
        }
    }
}
         

