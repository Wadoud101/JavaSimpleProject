package a_CodeJAVA.a807_polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        System.out.println("***********");

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
