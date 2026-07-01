package oops_practice.gcr_codebase.PolymorphismScanerio;

public class TransportCompany {
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.fuelCost(100);

        Vehicle car = new Car();
        car.fuelCost(100);

        Vehicle electricCar = new ElectricCar();
        electricCar.fuelCost(100);

        Vehicle bus = new Bus();
        bus.fuelCost(100);
    }
}



    