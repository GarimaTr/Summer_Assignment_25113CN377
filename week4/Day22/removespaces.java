package Day22;
import java.util.Scanner;
class removespaces{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        String s2="";
        s2=s.replaceAll("\\s","");
        System.out.println("Given String: "+s);
        System.out.println("String without space: "+s2);
    }
}