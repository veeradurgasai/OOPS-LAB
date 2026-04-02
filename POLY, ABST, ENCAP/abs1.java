abstract class Vehicle {
    protected String brand;
    protected int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();
    abstract void stop();

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int fuelLevel;

    Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    void start() {
        if (fuelLevel > 0)
            System.out.println("Car started");
        else
            System.out.println("No fuel");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

class Bike extends Vehicle {
    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void start() {
        System.out.println("Bike started with kick");
    }

    void stop() {
        System.out.println("Bike stopped");
    }
}

public class abs1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", 120, 10);
        Vehicle v2 = new Bike("Yamaha", 80);

        v1.start();
        v1.displayInfo();

        v2.start();
        v2.displayInfo();
    }
}