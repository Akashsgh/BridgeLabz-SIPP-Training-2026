package oops_practice.gcr_codebase.PolymorphismScanerio;
public class Bus extends Vehicle {

    public Bus() {
    }

    @Override
    public void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = ₹" + (km * 10));
    }
}

