package oops_practice.gcr_codebase.polymorphism;

class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Swift"),
                new Bus("Volvo"),
                new Bike("Pulsar"),
                new ElectricCar("Tesla")
        };

        int km = 100;

        for (Vehicle v : fleet) {

            if (v instanceof Car)
                System.out.println("Car Cost = " + v.fuelCost(km));

            else if (v instanceof Bus)
                System.out.println("Bus Cost = " + v.fuelCost(km));

            else if (v instanceof Bike)
                System.out.println("Bike Cost = " + v.fuelCost(km));

            else if (v instanceof ElectricCar)
                System.out.println("Electric Car Cost = " + v.fuelCost(km));
        }
    }
}