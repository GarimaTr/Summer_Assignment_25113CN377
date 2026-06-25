package Day17;
import java.util.Arrays;
import java.util.Scanner;

public class q4_common_arr{
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.print("Common elements (including duplicates): ");
        boolean foundCommon = false;

        // Initialize pointers for both arrays
        int p1 = 0;
        int p2 = 0;

        // Traverse through both arrays simultaneously
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                // Found a match
                System.out.print(a[p1] + " ");
                foundCommon = true;
                // Move both pointers forward to process the next elements
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) {
                // Element in array1 is smaller, move its pointer forward
                p1++;
            } else {
                // Element in array2 is smaller, move its pointer forward
                p2++;
            }
        }

        if (!foundCommon) {
            System.out.print("None");
        }

        System.out.println();
        in.close();
    }
}



