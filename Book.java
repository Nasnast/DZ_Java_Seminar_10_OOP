package temp3;

public class Book<T> {
    private T bookName;

    public Book(T bookName) {
        this.bookName = bookName;
    }

    public T getBookName() {
        return bookName;
    }

    public void setBookName(T bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName;
    }
}
