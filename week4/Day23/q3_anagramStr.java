package Day23;
import java.util.Arrays;
import java.util.Scanner;
public class q3_anagramStr {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the first word");
     String s1=in.nextLine();
     System.out.println("Enter the second word");
     String s2=in.nextLine();

     char[] a1=s1.toCharArray();
     char[] a2=s2.toCharArray();

     Arrays.sort(a1);
     Arrays.sort(a2);

     if(Arrays.equals(a1,a2)){
        System.out.println(s1+" and "+s2+" are Anagram String");
     }
     else{
        System.out.println(s1+" and "+s2+" are Anagram String");
     }
    }
}
