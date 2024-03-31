package temp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    protected List<LibraryCard<Integer, String>> listOfAllBook;
    List<String> listInfo = new ArrayList<>();
    Map<Integer, Book> mapBook;

    public Library() {
        this.listOfAllBook = new ArrayList<>();
        this.mapBook = new HashMap<>();
    }

    // public <T> void addListInfo()
    // добавление
    public <T> void addBook(Book<T> book, int cardNumber, String author, String year) {
        LibraryCard<Integer, String> card = new LibraryCard<Integer, String>(author, year, cardNumber);
        listOfAllBook.add(card);
        mapBook(book, cardNumber);
    }

    public <T> void mapBook(Book<T> book, int cardNumber) {
        mapBook.put(cardNumber, book);
        // System.out.println(mapBook);
    }

    // выдача

    public LibraryCard<Integer, String> readBook(int cardNumber) {
        for (LibraryCard<Integer, String> card : listOfAllBook) {
            if (card.getCardNumber() == cardNumber) {
                // listOfAllBook.remove(card);
                return card;
            }
        }
        return null;
    }

    public <T> void mapBook(String book, int cardNumber) {
        Map<Integer, String> books = new HashMap<>();
        books.put(cardNumber, book);
        // System.out.println(books);
    }

    public void displayBooks() {
        for (LibraryCard<Integer, String> card : listOfAllBook) {
            System.out.println(mapBook.get(card.getCardNumber()));
            System.out.println(card);
        }
    }

    @Override
    public String toString() {
        return listOfAllBook.toString();
    }

}
