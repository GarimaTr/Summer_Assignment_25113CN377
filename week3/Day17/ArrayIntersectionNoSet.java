 package Day17;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersectionNoSet {
    public static void main(String[] args) {
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
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.print("The intersection of the two arrays is: [ ");
        
        int i = 0; 
        int j = 0;
        
        // Track the last printed element to skip duplicates in the output
        // Using Long.MIN_VALUE as a placeholder to safely identify the first element
        long lastPrinted = Long.MIN_VALUE; 

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++; // Move the first pointer if its value is smaller
            } else if (a[i] > b[j]) {
                j++; // Move the second pointer if its value is smaller
            } else {
                // If values match, check if it's a duplicate of the last printed intersection
                if (lastPrinted == Long.MIN_VALUE || a[i] != lastPrinted) {
                    System.out.print(a[i] + " ");
                    lastPrinted = a[i];
                }
                i++;
                j++;
            }
        }
        System.out.println("]");

        in.close();
    }
}
