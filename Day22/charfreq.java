package Day22;
import java.util.Scanner;
public class charfreq {
       public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        int c=0;
        System.out.println("Enter the character whoese frequency need to be calculated");
        char fh=in.next().charAt(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(fh==ch){
                c++;
            }
        }
        System.out.println("Frequency of character "+fh+" is:"+ c);

}}
