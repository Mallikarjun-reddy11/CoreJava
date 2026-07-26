package Inheritance;

public class Main3 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.start();
        v1.stop();

        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.sunRoof();

        Ev ev = new Ev();
        ev.start();
        ev.stop();
        ev.sunRoof();
        ev.chargeBatt();

        Bke b = new Bke();
        b.start();
        b.stop();
        b.helmet();
    }
}
