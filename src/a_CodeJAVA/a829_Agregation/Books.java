package a_CodeJAVA.a829_Agregation;

public class Books {

    String name;
    int pages;

    Books(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void bookInformation(){
        System.out.println( this.name + " (" + this.pages + ")");
    }
}
