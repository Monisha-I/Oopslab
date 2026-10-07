import java.util.Scanner;

// Parent Class
class Taxi {
    double distance;

    Taxi(double distance) {
        this.distance = distance;
    }

    double calculateFare() {
        return 0;
    }
}

// Child Class - Car
class Car extends Taxi {

    Car(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 15;
    }
}

// Child Class - Auto
class Auto extends Taxi {

    Auto(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 10;
    }
}

// Child Class - Premium Taxi
class PremiumTaxi extends Taxi {

    PremiumTaxi(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 25;
    }
}

// Main Class
public class TaxiFareManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TAXI FARE MANAGEMENT SYSTEM =====");

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Auto");
        System.out.println("2. Car");
        System.out.println("3. Premium Taxi");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Taxi taxi;

        if (choice == 1) {
            taxi = new Auto(distance);
        }
        else if (choice == 2) {
            taxi = new Car(distance);
        }
        else if (choice == 3) {
            taxi = new PremiumTaxi(distance);
        }
        else {
            System.out.println("Invalid Vehicle Type!");
            sc.close();
            return;
        }

        double fare = taxi.calculateFare();

        System.out.println("\n===== FARE DETAILS =====");
        System.out.println("Distance     : " + distance + " km");

        if (choice == 1)
            System.out.println("Vehicle Type : Auto");
        else if (choice == 2)
            System.out.println("Vehicle Type : Car");
        else
            System.out.println("Vehicle Type : Premium Taxi");

        System.out.println("Fare         : Rs." + fare);
        System.out.println("Total Amount : Rs." + fare);

        sc.close();
    }
}