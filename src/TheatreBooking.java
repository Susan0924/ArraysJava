import java.util.Scanner;

public class TheatreBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of screens: ");
        int screens = sc.nextInt();


        boolean[][] seats = new boolean[screens][];


        for (int i = 0; i < screens; i++) {
            System.out.print("Enter number of seats in screen " + (i + 1) + ": ");
            int seatCount = sc.nextInt();
            seats[i] = new boolean[seatCount];
        }


        System.out.print("Enter number of bookings: ");
        int bookings = sc.nextInt();

        for (int i = 0; i < bookings; i++) {

            System.out.print("Enter screen number: ");
            int screen = sc.nextInt() - 1;

            System.out.print("Enter seat number: ");
            int seat = sc.nextInt() - 1;

            if (screen < 0 || screen >= screens ||
                    seat < 0 || seat >= seats[screen].length) {

                System.out.println("Invalid screen or seat number!");
            }
            else if (seats[screen][seat]) {
                System.out.println("Seat already booked!");
            }
            else {
                seats[screen][seat] = true;
                System.out.println("Booking successful!");
            }
        }


        int available = 0;

        for (int i = 0; i < screens; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {
                    available++;
                }
            }
        }

        System.out.println("Total available seats: " + available);
    }
}
