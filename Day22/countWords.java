package Day22;
import java.util.Scanner;
class countWords{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        String s2=s.trim();
        int c=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch==' '){
                c++;}
        }
        System.out.println("Given sentence: "+s);
        System.out.println("Number of words in the sentence is: "+(c+1));
        }}