package week4.Day27;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSal, hra, da, netSal;

    void input(Scanner in) {
        System.out.println("Enter Employee Id");
        id = in.nextInt();
        in.nextLine(); // flush

        System.out.println("Enter your name");
        name = in.nextLine();

        System.out.println("Enter your salary");
        basicSal = in.nextDouble();
        in.nextLine(); // flush
    }

    void calSalary() {
        hra = basicSal * 0.20;
        da  = basicSal * 0.10;
        netSal = basicSal + hra + da;
    }

    void display() {
        System.out.println();
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSal);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA  (10%)     : " + da);
        System.out.println("Net Salary    : " + netSal);
    }
}

public class q3_salaryMana {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {

        System.out.println("Enter the number of employees");
        int n = in.nextInt();
        in.nextLine(); // flush after reading n

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Employee " + (i + 1));
            e[i] = new Employee();
            e[i].input(in);
            e[i].calSalary();
        }

        System.out.println("\n-----Salary Report-----");
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
    }
}}