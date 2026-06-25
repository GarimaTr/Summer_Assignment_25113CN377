package Day20;
import java.util.Scanner;
public class multiply_arr {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("Enter number of rows for first matrice:");
       int m1=in.nextInt();
       System.out.println("Enter number of columns for second matrice:");
       int n1=in.nextInt();
       int[][] a=new int[m1][n1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter number of rows for second matrice:");
       int m2=in.nextInt();
       System.out.println("Enter number of columns for second matrice:");
       int n2=in.nextInt();
       int[][] b=new int[m2][n2];
       System.out.println("Enter elements of second matrix:");
        for (int i = 0; i<m2 ; i++) {
            for (int j = 0; j<n2; j++) {
                b[i][j] = in.nextInt();
            }}
        int [][]c=new int[m1][n2];
        
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                   c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Resultant   Matrix:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
