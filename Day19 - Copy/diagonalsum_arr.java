package Day19;
import java.util.Scanner;
public class diagonalsum_arr {
      public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
       System.out.println("Enter number of rows:");
       int m=in.nextInt();
       System.out.println("Enter number of columns:");
       int n=in.nextInt();
    
       int[][] a=new int[m][n];
       int[][] b=new int[n][m];
       int sum=0;
      System.out.println("Enter elements of  matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal: "+sum);
            }
        }

