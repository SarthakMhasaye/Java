
class TrainReservation {
    int availableSeats = 5;
    synchronized void bookTicket(String userName) {
        if (availableSeats > 0) {
            System.out.println(userName + " booked a ticket.");

            availableSeats--;

            System.out.println("Seats remaining: "+ availableSeats);
        } else {
            System.out.println(userName + " failed to book. No seats available.");
        }
    }
}

class User extends Thread {

    TrainReservation reservation;
    String userName;

    User(TrainReservation reservation, String userName) {
        this.reservation = reservation;
        this.userName = userName;
    }

    public void run() {
        reservation.bookTicket(userName);
    }
}

public class ThreadingB {
    public static void main(String[] args) {
        TrainReservation reservation = new TrainReservation();

        User u1 = new User(reservation, "User 1");
        User u2 = new User(reservation, "User 2");
        User u3 = new User(reservation, "User 3");
        User u4 = new User(reservation, "User 4");
        User u5 = new User(reservation, "User 5");
        User u6 = new User(reservation, "User 6");
        User u7 = new User(reservation, "User 7");

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
        u6.start();
        u7.start();
    }
}
