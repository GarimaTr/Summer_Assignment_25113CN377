import java.util.Arrays;
import java.util.Scanner;

public class q2_ArrayOperationsMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;
        int choice;

        do {
            System.out.println("\n--- Menu Driven Array Operations ---");
            System.out.println("1. Insert elements");
            System.out.println("2. Display array");
            System.out.println("3. Search element");
            System.out.println("4. Sort array");
            System.out.println("5. Delete element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many elements do you want to insert? ");
                    int n = sc.nextInt();
                    if (size + n > arr.length) {
                        System.out.println("Array is full. Cannot insert more elements.");
                        break;
                    }
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[size++] = sc.nextInt();
                    }
                    System.out.println("Elements inserted successfully.");
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    Arrays.sort(arr, 0, size);
                    System.out.println("Array sorted successfully.");
                    break;

                case 5:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == del) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Element not found.");
                    } else {
                        for (int i = index; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element deleted successfully.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}