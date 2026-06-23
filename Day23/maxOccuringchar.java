package Day23;
import java.util.Scanner;
public class maxOccuringchar {
      public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the  word");
      String s1=in.nextLine();
      String s=s1.toLowerCase();
      int max=-1;
      char maxch = ' ';
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int c=0;
        for(int j=0;j<s.length();j++){
            if(ch==s.charAt(j)){
                c++;
            }
        }
        if(c>max){
            max=c;
            maxch=ch;
        }
      }
      System.out.println("Maximum occuring character in String "+s1+" is "+maxch+" occuring "+max+" times");

}}
