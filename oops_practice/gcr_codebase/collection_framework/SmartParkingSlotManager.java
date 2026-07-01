package oops_practice.gcr_codebase.collection_framework;

import java.util.*;

public class SmartParkingSlotManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    public static void addVehicle(String vehicleNumber) {
        vehicles.add(vehicleNumber);
        System.out.println(vehicleNumber + " Entered Parking.");
    }

    public static void removeVehicle(String vehicleNumber) {

        if (vehicles.remove(vehicleNumber)) {
            System.out.println(vehicleNumber + " Exited Parking.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    public static void searchVehicle(String vehicleNumber) {

        if (vehicles.contains(vehicleNumber)) {
            System.out.println("Vehicle is Currently Parked.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    public static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots : " + vehicles.size());
    }

    public static void main(String[] args) {

        addVehicle("UP85AB1234");
        addVehicle("DL10XY5678");
        addVehicle("HR26AA9999");

        searchVehicle("DL10XY5678");

        removeVehicle("UP85AB1234");

        displayVehicles();
    }
}