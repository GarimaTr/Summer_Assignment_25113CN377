package Day19;
import java.util.Scanner;
public class transpose_arr {
      public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int m=in.nextInt();
       System.out.println("Enter number of columns:");
       int n=in.nextInt();
    
       int[][] a=new int[m][n];
       int[][] b=new int[n][m];

        System.out.println("Enter elements of  matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j]=a[j][i];
            }
        }
         System.out.println("TGiven Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transposed Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

