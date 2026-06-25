package Day21;
import java.util.Scanner;
public class strlen {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        String senti=s.trim()+" ";
        int i=0;
        while(senti.charAt(i)!=' '){
         i++;
        }
        System.out.println("Length of string "+s+" :"+(i));
    }
}
