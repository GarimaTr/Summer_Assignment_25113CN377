package Day24;
import java.util.Scanner;
public class q4_removeduplicateStr {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = in.nextLine();
        String s2="";
        String s=s1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++){
                char bh=s.charAt(j);
                if(ch==bh && j!=i){
                    s=s.replace(bh,' ');
                }
            }}
            for(int i=0;i<s.length();i++){
                char ah=s.charAt(i);
            if(ah!=' '){
                s2=s2+ah;
            }         
           }
           System.out.println(s2);

        }
}
