package week4.Day25;
import java.util.Scanner;
public class q2_commonchar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=in.nextLine();
        System.out.println("Enter the second string");
        String s2=in.nextLine();

        String common= "";
     
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
           
            if(ch!=' ' && s2.indexOf(ch)!=-1 && common.indexOf(ch)==-1 ){
                common +=ch;
            }
        }
        if(common.length()==0){
            System.out.println("-1");
        } else{
            System.out.println("Common characters: "+ common);
        }
        in.close();
    }
}
