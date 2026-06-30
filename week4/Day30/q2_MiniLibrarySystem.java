package week4.Day30;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Status: " + (issued ? "Issued" : "Available"));
    }
}

public class q2_MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.add(new Book(id, title, author));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (library.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        System.out.println("Book List:");
                        for (Book b : library) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : library) {
                        if (b.getId() == searchId) {
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean issued = false;

                    for (Book b : library) {
                        if (b.getId() == issueId) {
                            if (!b.isIssued()) {
                                b.issueBook();
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean returned = false;

                    for (Book b : library) {
                        if (b.getId() == returnId) {
                            if (b.isIssued()) {
                                b.returnBook();
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < library.size(); i++) {
                        if (library.get(i).getId() == deleteId) {
                            library.remove(i);
                            System.out.println("Book deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Book not found.");
                    }
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