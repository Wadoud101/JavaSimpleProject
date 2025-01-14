package a_CodeJAVA.a801_Interface;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Hawk hawk1 = new Hawk();
        Fish fish1= new Fish();

        fish1.hunt();
        fish1.flee();
        hawk1.hunt();
        rabbit.flee();

    }
}
