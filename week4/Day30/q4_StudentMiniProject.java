package Day30;

import java.util.Scanner;

public class q4_StudentMiniProject {
    static Scanner sc = new Scanner(System.in);

    static String[] rollNo = new String[100];
    static String[] name = new String[100];
    static String[] branch = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    public static void addStudent() {
        if (count >= 100) {
            System.out.println("Record limit reached.");
            return;
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
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nRoll No\tName\tBranch\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t" + branch[i] + "\t" + marks[i]);
        }
    }

    public static void searchStudent() {
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
    }

    public static void updateMarks() {
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
    }

    public static void deleteStudent() {
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
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Mini Project ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
