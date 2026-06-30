package week4.Day28;
import java.util.Scanner;


class TicketBookingSystem {
    int totalSeats = 50;
    int bookedSeats = 0;

    void bookTicket(int seats) {
        if (seats <= 0) {
            System.out.println("Enter a valid number of seats.");
        } else if (seats <= (totalSeats - bookedSeats)) {
            bookedSeats += seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }

    void cancelTicket(int seats) {
        if (seats <= 0) {
            System.out.println("Enter a valid number of seats.");
        } else if (seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println(seats + " ticket(s) cancelled successfully.");
        } else {
            System.out.println("You cannot cancel more tickets than booked.");
        }
    }

    void displayStatus() {
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Available Seats: " + (totalSeats - bookedSeats));
    }
}

public class q3_ticketbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBookingSystem t = new TicketBookingSystem();
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int bookSeats = sc.nextInt();
                    t.bookTicket(bookSeats);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancelSeats = sc.nextInt();
                    t.cancelTicket(cancelSeats);
                    break;

                case 3:
                    t.displayStatus();
                    break;

                case 4:
                    System.out.println("Thank you for using the ticket booking system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 4.");
            }
        }

        sc.close();
    }
}

    

