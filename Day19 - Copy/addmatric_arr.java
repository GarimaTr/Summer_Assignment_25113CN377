package Day19;
import java.util.Scanner;
public class addmatric_arr {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int m=in.nextInt();
       System.out.println("Enter number of columns:");
       int n=in.nextInt();
    
       int[][] a=new int[n][m];
       int[][] b=new int[n][m];
       int[][] c=new int[n][m];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }  System.out.println("Enter elements of second matrix:");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                b[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
          System.out.println("Added matrix: ");
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
     }
     System.out.println("");
            }
}}
