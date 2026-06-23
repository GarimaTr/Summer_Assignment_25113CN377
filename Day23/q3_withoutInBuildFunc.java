package Day23;

import java.util.Scanner;

public class q3_withoutInBuildFunc {
      public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the first word");
     String s1=in.nextLine();
     System.out.println("Enter the second word");
     String s2=in.nextLine();
    int l1=s1.length();
    int l2=s2.length();
    boolean flag=false;
    int check=0;
     if(l1==l2){
       for(int i=0;i<l1;i++){
         char ch=s1.charAt(i);
         int c1=0,c2=0;
         for(int j=0;j<l1;j++){
           if(ch==s1.charAt(j)){
            c1++;
           }
         }
         for(int k=0;k<l2;k++){
            if(ch==s2.charAt(k)){
                c2++;
            }
        }
        if(c1==c2){
            flag=true;
        }
         
       }
       if(flag){
        System.out.println(s1+" and "+s2+" are  Anagram String");
        check=1;

       }
     }
    if(check==0){
        System.out.println(s1+" and "+s2+" are not Anagram String");

    }
}}
