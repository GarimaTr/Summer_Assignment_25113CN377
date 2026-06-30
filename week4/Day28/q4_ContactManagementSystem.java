import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    int id;
    String name;
    String phone;
    String email;

    Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

public class q4_ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(id, name, phone, email));
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (Contact c : contacts) {
                            c.display();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(searchName)) {
                            c.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;

                    for (Contact c : contacts) {
                        if (c.id == updateId) {
                            System.out.print("Enter new Name: ");
                            c.name = sc.nextLine();

                            System.out.print("Enter new Phone: ");
                            c.phone = sc.nextLine();

                            System.out.print("Enter new Email: ");
                            c.email = sc.nextLine();

                            System.out.println("Contact updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = false;

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).id == deleteId) {
                            contacts.remove(i);
                            System.out.println("Contact deleted successfully.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Contact not found.");
                    }
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