package a_CodeJAVA.a751_Abstraction;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(10);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());
        circle.display();
        String a = circle.display2;
        System.out.println(a);
    }
}
