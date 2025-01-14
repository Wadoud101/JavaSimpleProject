package a_CodeJAVA.a751_Abstraction;

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
