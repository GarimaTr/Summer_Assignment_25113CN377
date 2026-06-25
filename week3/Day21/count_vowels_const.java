package Day21;
import java.util.Scanner;
public class count_vowels_const {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
       String s2=s.toLowerCase();
       int v=0,c=0;
        for(int i=0;i<s.length();i++){
        char ch=s2.charAt(i);
         if(ch >= 'a' && ch <= 'z'){      
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
        }
        else{
            c++;
        }
}
}
System.out.println("Given String: "+s);
System.out.println("Number of vowles: "+v);
System.out.println("Number of consonats: "+c);
     }
    }