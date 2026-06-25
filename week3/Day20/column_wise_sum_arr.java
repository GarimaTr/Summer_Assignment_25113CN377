package Day20;
import java.util.Scanner;
public class column_wise_sum_arr {
      public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int m=in.nextInt();
       System.out.println("Enter number of columns:");
       int n=in.nextInt();
    
       int[][] a=new int[m][n];

        System.out.println("Enter elements of  matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Given Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("***********************");
        System.out.println("");
        int sum;
        for(int j=0;j<n;j++){
            sum=0;
            for(int i=0;i<m;i++){
              sum+=a[i][j];
            }
            System.out.println("Sum of column "+(j+1)+" is: "+sum);
        }
     }
}

