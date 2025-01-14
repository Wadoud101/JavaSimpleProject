package a_CodeJAVA.a829_Agregation;

public class Library {

    String name;
    int year;
    Books[] book;

    Library(String name, int year, Books[] book){
        this.name = name;
        this.year = year;
        this.book = book;
    }
    void libraryInfos(){
        System.out.println(this.name + " established at " + this.year  );
        System.out.println("Books are available");
        for (Books boo : book){
            boo.bookInformation();
        }
    }
}
