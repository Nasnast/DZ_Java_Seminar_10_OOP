/*Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.
Каждая книга должна содержать параметр типа T для ее названия.

Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. 
Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.

Создайте класс Library, который будет представлять библиотеку. 
У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.

Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками. */
package temp3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Library library = new Library();

    Book<String> book1 = new Book<>("Мцыри");
    library.addBook(book1, 1, "Лермонтов", "1800");
    Book<String> book2 = new Book<>("На дне");
    library.addBook(book2, 2, "Горький", "1905");
    Book<String> book3 = new Book<>("1984");
    library.addBook(book3, 3, "Оруэл", "2022");
    Book<String> book4 = new Book<>("Банальность зла");
    library.addBook(book4, 4, "Арендт", "2020");
    System.out.println("Список карточек");
    System.out.println(library);
    System.out.println();
    System.out.println("Выдача: " + library.readBook(1));
    System.out.println("Выдача: " + library.readBook(2));
    System.out.println();
    System.out.println("Выданные книги и карточки:");
    library.displayBooks();
  }
}
