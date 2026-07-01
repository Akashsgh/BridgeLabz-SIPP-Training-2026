package oops_practice.gcr_codebase.PolymorphismScanerio;

public class ElectricCar extends Vehicle {

    public ElectricCar() {
    }

    @Override
    public void fuelCost(int km) {
        System.out.println("Electric Car Fuel Cost = ₹" + (km * 2));
    }       
    
}
