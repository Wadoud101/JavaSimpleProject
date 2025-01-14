package a_CodeJAVA.a1020_AnonymousClass;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Ruh*");
            }
        };

        dog.speak();
        dog1.speak();
    }
}
