package Day21;
import java.util.Scanner;
public class reverse {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        String revS="";
        for(int i=s.length()-1;i>=0;i--){
           revS+=s.charAt(i);
        }
        System.out.println("Reverse String= "+revS);
}
}