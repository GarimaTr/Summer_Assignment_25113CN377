package Day23;
import java.util.Scanner;
public class q1_nonRepeatingChar {
 public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the string");
     String s2=in.nextLine();
     int flag=0;
    String s=s2.toLowerCase();
     for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        int c=0;
        for(int j=0;j<s.length();j++){
            if(j!=i && ch==s.charAt(j)){
                c++;
            }
        }
        if(c==0){
            System.out.println("The first non repeating character in string "+s2+" is:"+ ch);
            flag=1;
            break;
        }
     }
     if(flag==0){
         System.out.println("There are no first non repeating character in string "+s2);
    }
}
}