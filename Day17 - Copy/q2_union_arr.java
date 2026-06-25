package Day17;
import java.util.Scanner;
public class q2_union_arr {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        System.out.println("Enter size of second array");
        int m=in.nextInt();
        int [] b=new int[m];
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }

        int [] c=new int[n+m];
        int [] d=new int[n+m];
    System.arraycopy(a, 0, c,0 ,n);   
    System.arraycopy(b, 0, c, n, m);
    for(int i=0;i<(n+m);i++){
        for(int j=i+1;j<n+m;j++){
            if(c[i]==c[j]){
                c[j]=0;
            }
        }
    }
    int count=0;
        for(int i=0;i<n+m;i++){
           if(c[i]!=0){
            d[count]=c[i];
            count++;
        }
    }
        System.out.println("Union of the Sets:");
        for(int i=0;i<n+m;i++){
            if(d[i]==0){
                System.out.println(" ");
            }
            else{
            System.out.print(d[i]+" ");
        }
         }
        }
}
