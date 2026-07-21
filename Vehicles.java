interface Vehicles {
    void go();
}

class Car implements Vehicles {
    @Override
    public void go() {
        System.out.println("You Drive the Car.");
    }
}

class Bike implements Vehicles {
    @Override
    public void go() {
        System.out.println("You Ride the Bike.");
    }
}

class Boat implements Vehicles {
    @Override
    public void go() {
        System.out.println("You Ride the Boat.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicles[] vehicles = {car, bike, boat};

        for (Vehicles vehicle : vehicles) {
            vehicle.go();
        }
    }
}