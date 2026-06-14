package Day14;
import java.util.Scanner;
public class duplicates_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c,temp,temp2=0;
        System.out.println("Enter size of array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Duplicates in the array is:");
        for(int i=0;i<n;i++){
            c=0;
            temp=a[i];
            for(int j=0;j<n;j++){
                if(a[j]==temp){
                    c++;
                }
            }
            if(c==2 && (temp2!=temp)){
             temp2=temp;
            System.out.println(temp);
            }
        }}}
