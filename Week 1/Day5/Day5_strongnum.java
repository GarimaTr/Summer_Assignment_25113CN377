 import java.util.Scanner;
 public class Day5_strongnum {
    
}
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=in.nextInt();
    int sum=0,temp=n;
    while(temp>0){
        int r=temp%10;
         int f=1;
    for(int i=1;i<=r;i++){
        f*=i;}
        sum+=f;
        temp/=10;
    }
    if(sum==n){
        System.out.println(n+" is a strong number.");
    }else{
        System.out.println(n+" is not a strong number.");   
    }
}
