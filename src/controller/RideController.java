package controller;

import model.Ride;
import service.RideService;

import java.util.List;
import java.util.Scanner;

public class RideController {

    private RideService rideService = new RideService();

    public void bookRide() {
        Scanner sc = new Scanner(System.in);
        List<Ride> rides = rideService.getAvailableRides();

        Ride selectedRide = null;

        while (true) {
            System.out.println("\n🚲 Available Rides:");
            for (int i = 0; i < rides.size(); i++) {
                System.out.println((i + 1) + ". " + rides.get(i).getName());
            }

            System.out.print("Choose ride (enter number): ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input! Please select a number to continue.");
                sc.next(); // clear invalid input
                continue;
            }

            int choice = sc.nextInt();

            if (choice < 1 || choice > rides.size()) {
                System.out.println("❌ Invalid choice! Please select a valid number.");
                continue;
            }

            selectedRide = rides.get(choice - 1);
            break;
        }

        double distance;

        while (true) {
            System.out.print("Enter distance (km): ");

            if (!sc.hasNextDouble()) {
                System.out.println("❌ Invalid input! Distance must be a number.");
                sc.next();
                continue;
            }

            distance = sc.nextDouble();

            if (distance <= 0) {
                System.out.println("❌ Distance must be greater than 0.");
                continue;
            }

            break;
        }

        double fare = selectedRide.calculateFare(distance);

        System.out.println("\n✅ Ride Booked Successfully!");
        System.out.println("Ride Type: " + selectedRide.getName());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + fare);
    }
}
