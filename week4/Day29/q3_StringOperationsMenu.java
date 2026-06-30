package Day29;
import java.util.Scanner;
public class q3_StringOperationsMenu{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu Driven String Operations ---");
            System.out.println("1. Find Length of String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Concatenate Two Strings");
            System.out.println("5. Compare Two Strings");
            System.out.println("6. Copy One String to Another");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    System.out.println("Length = " + str1.length());
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String up = sc.nextLine();
                    System.out.println("Uppercase = " + up.toUpperCase());
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String low = sc.nextLine();
                    System.out.println("Lowercase = " + low.toLowerCase());
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String a = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String b = sc.nextLine();
                    System.out.println("Concatenated String = " + a.concat(b));
                    break;

                case 5:
                    System.out.print("Enter first string: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = sc.nextLine();
                    if (s1.equals(s2)) {
                        System.out.println("Strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;

                case 6:
                    System.out.print("Enter a string: ");
                    String source = sc.nextLine();
                    String copy = source;
                    System.out.println("Copied String = " + copy);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
}
