package Day24;
import java.util.Scanner;
public class q1_stringrotation {
 public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     System.out.println("Enter the first word");
     String s1=in.nextLine();
     System.out.println("Enter the second word");
     String s2=in.nextLine();
     if(s1.length()==s2.length()){
      if((s1+s1).contains(s2)){
        System.out.println(s1+" and "+s2+" strings are rotation of each other");
      }
     }
    else{
        System.out.println(s1+" and "+s2+" strings are not rotation of each other"); 
    }
 }    
}
