package oops_practice.gcr_codebase.polymorphism;
class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }

    void display() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Owner      : " + ownerName);
    }
}

class Car extends Vehicle {

    Car(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 400;
    }
}

public class SmartVehicleTollManagementSystem {

    static void calculateTotalRevenue(Vehicle[] vehicles) {

        double total = 0;

        for (Vehicle v : vehicles)
            total += v.calculateToll();

        System.out.println("Total Revenue = " + total);
    }

    static void searchVehicle(Vehicle[] vehicles, String number) {

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equals(number)) {

                System.out.println("\nVehicle Found");
                v.display();
                System.out.println("Toll = " + v.calculateToll());
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    static void highestToll(Vehicle[] vehicles) {

        Vehicle max = vehicles[0];

        for (Vehicle v : vehicles)

            if (v.calculateToll() > max.calculateToll())
                max = v;

        System.out.println("\nHighest Toll Paid");
        max.display();
        System.out.println("Toll = " + max.calculateToll());
    }

    static void countTypes(Vehicle[] vehicles) {

        int car = 0, bus = 0, truck = 0;

        for (Vehicle v : vehicles) {

            if (v instanceof Car)
                car++;
            else if (v instanceof Bus)
                bus++;
            else if (v instanceof Truck)
                truck++;
        }

        System.out.println("\nCars   : " + car);
        System.out.println("Buses  : " + bus);
        System.out.println("Trucks : " + truck);
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("UP32AA1010", "Akash"),
                new Bus("UP65BB2020", "Rahul"),
                new Truck("UP70CC3030", "Riya"),
                new Car("UP90DD4040", "Aman")
        };

        calculateTotalRevenue(vehicles);
        searchVehicle(vehicles, "UP70CC3030");
        highestToll(vehicles);
        countTypes(vehicles);
    }
}