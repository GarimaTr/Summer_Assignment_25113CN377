package Day21;
import java.util.Scanner;
public class lowertoupper {
  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();  
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
            s2+=(char)(ch-32);
        }
        else{
            s2+=ch;
        }
    }
        System.out.println("Given String: "+ s);
        System.out.println("Changed String: "+s2);
        }  
}

