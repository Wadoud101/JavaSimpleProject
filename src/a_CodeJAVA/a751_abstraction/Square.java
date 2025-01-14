package a_CodeJAVA.a751_abstraction;

public class Square extends Shape {

    double base;

    Square(double base){
        this.base = base;

    }

    @Override
    double area() {
        return base*base;
    }
}
