package a_CodeJAVA.a839_Composition;

public class Engine {

    String type;
     Engine(String type){
         this.type = type;
     }
     void start(){
         System.out.println("You start a "+ this.type + " Engine");
     }
}
