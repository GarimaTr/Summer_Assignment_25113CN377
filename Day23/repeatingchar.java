package Day23;
import java.util.Scanner;
public class repeatingchar {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the string");
     String s2=in.nextLine();
     int flag=0;
     String s=s2.toLowerCase();

     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int c=0;
        for(int j=0;j<s.length();j++){
            if(ch==s.charAt(j)){
                c++;
            }
        }
        if(c>1){
            System.out.println("The first repeating character in the string "+s2+" is: "+ ch);
            flag=1;
            break;
        }
     }
   if(flag==0){
         System.out.println("There are no first repeating character in string "+s2);
    }
}
}
