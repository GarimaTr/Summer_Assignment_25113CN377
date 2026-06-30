package Day30;
import java.util.Scanner;

public class q1_StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rollNo = new String[100];
        String[] name = new String[100];
        String[] branch = new String[100];
        int[] marks = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count >= 100) {
                        System.out.println("Record limit reached.");
                        break;
                    }

                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    branch[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();
                    sc.nextLine();

                    count++;
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\nRoll No\tName\tBranch\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(rollNo[i] + "\t" + name[i] + "\t" + branch[i] + "\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    String searchRoll = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i].equals(searchRoll)) {
                            System.out.println("Student Found:");
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name   : " + name[i]);
                            System.out.println("Branch : " + branch[i]);
                            System.out.println("Marks  : " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to update marks: ");
                    String updateRoll = sc.nextLine();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i].equals(updateRoll)) {
                            System.out.print("Enter new marks: ");
                            marks[i] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Marks updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    String deleteRoll = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i].equals(deleteRoll)) {
                            for (int j = i; j < count - 1; j++) {
                                rollNo[j] = rollNo[j + 1];
                                name[j] = name[j + 1];
                                branch[j] = branch[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;
                            System.out.println("Student deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found.");
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
}
