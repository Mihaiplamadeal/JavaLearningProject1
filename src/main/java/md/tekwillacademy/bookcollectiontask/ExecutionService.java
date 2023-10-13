package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic habits", "James C. ");
        Book alexBook = new Book("Crime and Punishment", "Dostoievsi F.");
        Book ruxandaBook = new Book("Karamazov Brothers", "Dostoievski F.");
        Book veronicaBook = new Book("To Kill a Mockingbird", "Harper L.");
        Book mihais2book = new Book("1984", "George O.");

        mihais2book.printTheBookDetails();
        mihaisBook.printTheBookDetails();
        alexBook.printTheBookDetails();
        ruxandaBook.printTheBookDetails();
        veronicaBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicaBook);
        carturestiLibrary.addBook(ruxandaBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexBook));
        carturestiLibrary.addBook(alexBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexBook));

        carturestiLibrary.deleteABookIfExists(alexBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());


        carturestiLibrary.printAllTheBooks();


        Library victorsLibrary = new Library("Cartier");
        victorsLibrary.addBook(alexBook);
        victorsLibrary.addBook(ruxandaBook);
        victorsLibrary.addBook(veronicaBook);
        System.out.println(victorsLibrary.getTheStockStatusNumber());

        victorsLibrary.printAllTheBooks();

        Map<String,Library> librariesMap = new HashMap<>();

        librariesMap.put("Str. Stefan cel Mare 136", carturestiLibrary);
        librariesMap.put("Str. Dacia 24/3, ap.1", victorsLibrary);
        librariesMap.get("Str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Str. Dacia 24/3, ap.1").isThereSuchABookInTheStock(veronicaBook));


        int[] dataTable = new int[6];
        dataTable [1] =65;
         dataTable[2] = 12;
         dataTable [3] = 52;
         dataTable[4] = 5;
         dataTable[5] = 1;
         dataTable[0] = 9;

        System.out.println(IntNumberArrayService.findMin(dataTable));

        System.out.println(IntNumberArrayService.getAvg(dataTable));
    }
}
