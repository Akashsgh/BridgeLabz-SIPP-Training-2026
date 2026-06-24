package oops_practice.gcr_codebase.inheritance;

public class VehicleManagement {

    public static void main(String[] args) {

        ElectricVehicle tesla =
                new ElectricVehicle(
                        "Tesla Model 3",
                        250);

        PetrolVehicle honda =
                new PetrolVehicle(
                        "Honda City",
                        180);

        tesla.charge();
        honda.refuel();
    }
}

interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model,
                           int maxSpeed) {

        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle
        implements Refuelable {

    public PetrolVehicle(String model,
                         int maxSpeed) {

        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}