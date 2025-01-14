package a_CodeJAVA.a751_abstraction;

public class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;

    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
