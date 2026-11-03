
import java.util.*;

public class Collection {
    public static void main(String[] args) {

        System.out.println("=== Order Management System ===");

        List<String> orders = new ArrayList<>();
        orders.add("Laptop");
        orders.add("Mobile");
        orders.add("Headphones");

        System.out.println("Order List: " + orders);

        Map<Integer, String> orderMap = new HashMap<>();
        orderMap.put(101, "Laptop");
        orderMap.put(102, "Mobile");
        orderMap.put(103, "Headphones");

        System.out.println("Order Details: " + orderMap);
        System.out.println("Order 101: " + orderMap.get(101));

        System.out.println("\n=== Movie Ticket Booking System ===");

        Set<Integer> bookedSeats = new HashSet<>();
        bookedSeats.add(1);
        bookedSeats.add(2);
        bookedSeats.add(3);
        bookedSeats.add(2);  

        System.out.println("Booked Seats: " + bookedSeats);

        Queue<String> waitingQueue = new LinkedList<>();
        waitingQueue.add("Rahul");
        waitingQueue.add("Amit");
        waitingQueue.add("Priya");

        System.out.println("Waiting Queue: " + waitingQueue);

        System.out.println("Next Customer: "
                + waitingQueue.poll());

        System.out.println("Updated Queue: "
                + waitingQueue);

        System.out.println("\n=== Team Management System ===");

        List<String> teamMembers = new ArrayList<>();
        teamMembers.add("Sameer");
        teamMembers.add("Sahil");
        teamMembers.add("Yashwant");
        teamMembers.add("Bajrang");

        System.out.println("Team Members: " + teamMembers);

        Set<String> uniqueMembers = new HashSet<>(teamMembers);
        uniqueMembers.add("Sameer");  

        System.out.println("Unique Members: " + uniqueMembers);

        Map<String, String> teamRoles = new HashMap<>();
        teamRoles.put("Sameer", "Team Leader");
        teamRoles.put("Sahil", "Developer");
        teamRoles.put("Yashwant", "Tester");
        teamRoles.put("Bajrang", "Database Manager");

        System.out.println("Team Roles: " + teamRoles);
    }
}
