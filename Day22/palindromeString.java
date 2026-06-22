package Day22;
import java.util.Scanner;
class palindromeString{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        if((s.equals(s2))){
            System.out.println("Given String "+s+ " is an palindrome String");
        } 
        else{
            System.out.println("Given String "+s+ " is not an palindrome String");
        }
         in.close();
    }
}