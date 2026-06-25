package week4.Day25;
import java.util.Scanner;
public class q4_sortwordsLen {
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of names");
        int n=in.nextInt();
        in.nextLine(); // consume leftover newline

        String [] a = new String[n];
        System.out.println("Enter the number of names");
        for(int i=0;i<n;i++){
            a[i]=in.nextLine();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j].length()>a[j+1].length()){
                    String temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       System.out.println("Names sorted by length:");
       for(String name:a){
        System.out.println(name+"("+ name.length()+")");
       } 
       in.close();
    }
}
