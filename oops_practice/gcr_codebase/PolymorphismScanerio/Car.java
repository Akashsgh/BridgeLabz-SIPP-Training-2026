package oops_practice.gcr_codebase.PolymorphismScanerio;

public class Car extends Vehicle {

    public Car() {
    }

    @Override
    public void fuelCost(int km) {
        System.out.println("Car Fuel Cost = ₹" + (km * 5));
    }
}