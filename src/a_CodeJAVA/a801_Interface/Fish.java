package a_CodeJAVA.a801_Interface;

public class Fish implements Prey, Predator{

    @Override
    public void hunt(){
        System.out.println("*The fish is Hunting*");

    }

    @Override
    public void flee(){
        System.out.println("*The is fish is swimming*");

    }
}
