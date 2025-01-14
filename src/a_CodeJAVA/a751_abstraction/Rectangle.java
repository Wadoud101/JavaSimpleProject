package a_CodeJAVA.a751_abstraction;

public class Rectangle extends Shape {

    double width;
    double base;

    Rectangle(double width,double base){
        this.width =width;
        this.base = base;

    }

    @Override
    double area() {
        return width*base;
    }
}
