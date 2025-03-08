package Homework;

public class Person {
    String name;
    Vehicle vehicle;
    int[] arr = { 1, 2, 3, 4, 5 };

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void Common() {
        if (!(vehicle instanceof Horse)) {
            vehicle = VehicleFactory.getHorse();
        }
        vehicle.work();
    }

    public void River() {
        if (!(vehicle instanceof Boat)) {
            vehicle = VehicleFactory.getBoat();
        }
        vehicle.work();
    }
}
