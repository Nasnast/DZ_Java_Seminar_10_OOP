package temp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCard<K extends Number, V> {
    protected V bookInfo;
    protected V year;
    protected K cardNumber;

    Map<Integer, V> mapLCard;
    List<V> listInfo;

    public LibraryCard(
            V bookInfo, V year,
            K cardNumber) {
        this.bookInfo = bookInfo;
        this.year = year;
        this.cardNumber = cardNumber;
        mapLCard = new HashMap<>();
        listInfo = new ArrayList<>();

    }

    public K getCardNumber() {
        return cardNumber;
    }

    // public void setCardNumber(K cardNumber) {
    // this.cardNumber = cardNumber;
    // }

    public V getBookInfo() {
        return bookInfo;
    }

    public V getYear() {
        return year;
    }

    public void addListInfo(V bookInfo, V year) {
        listInfo.add(bookInfo);
        listInfo.add(year);
    }

    // public void setBookInfo(V bookInfo) {
    // this.bookInfo = bookInfo;
    // }

    @Override
    public String toString() {
        return "Карточкa №: " + cardNumber + ", " + bookInfo + ", " + year;
    }

}
