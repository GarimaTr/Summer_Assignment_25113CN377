package Day24;
import java.util.Scanner;
public class q3_longestwrd {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        s=s+" ";
        int max=-1;
        String s2="";
        String str="";
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                str+=ch;
                c++;
            }
            else{
                if(c>max){
                    max=c;
                    s2=str;
                }
                str="";
                c=0;
            }
        }
        System.out.println("Sentence:"+s);
        System.out.println(" Longest word in sentence: "+s2);
}}
