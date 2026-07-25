package Overriding;

public class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Starts with Push Button");
    }
}