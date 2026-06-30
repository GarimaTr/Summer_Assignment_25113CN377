package week4.Day30;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

public class q3_EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Mini Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    employees.add(new Employee(id, name, department, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("Employee List:");
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            emp.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == updateId) {
                            System.out.print("Enter new name: ");
                            emp.setName(sc.nextLine());

                            System.out.print("Enter new department: ");
                            emp.setDepartment(sc.nextLine());

                            System.out.print("Enter new salary: ");
                            emp.setSalary(sc.nextDouble());
                            sc.nextLine();

                            System.out.println("Employee updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).getId() == deleteId) {
                            employees.remove(i);
                            System.out.println("Employee deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found.");
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
