package a_CodeJAVA.a829_Agregation;

public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("Atomic Habit", 420);
        Books book2 = new Books("Rich Dad", 444);
        Books book3 = new Books("Poor Dad", 230);

        Books[] bo = {book1, book2, book3};

//        for (Books b : bo){
//            b.bookInformation();
//        }
        Library library1 = new Library("NYC Library", 1888, bo);

        library1.libraryInfos();

    }
}
