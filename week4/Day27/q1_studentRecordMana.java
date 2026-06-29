package week4.Day27;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    void input(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
    }
}

public class q1_studentRecordMana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details of Student " + (i + 1));
            s[i] = new Student();
            s[i].input(sc);
        }

        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}