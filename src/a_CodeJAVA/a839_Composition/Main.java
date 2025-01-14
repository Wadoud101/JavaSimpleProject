package a_CodeJAVA.a839_Composition;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2010, "V8");
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.engine.type);
        car.start();
    }
}
