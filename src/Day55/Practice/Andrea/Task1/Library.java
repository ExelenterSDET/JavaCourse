package Day55.Practice.Andrea.Task1;

import java.util.ArrayList;

public class Library {

    static final ArrayList<Book> bookList = new ArrayList<>();

    public Library() {
    }

    static {
        bookList.add(new Book("Java for Dummies", "Joe Smo", 1978));
        bookList.add(new Book("title2", "authorB", 1999));
    }

    static Book getOldest(ArrayList<Book> list){
        Book oldest = new Book();
        oldest.setYear(2022);
        for (Book book : list) {
            if (book.getYear() < oldest.getYear()) {
                oldest = book;
            }
        }
            return oldest;
    }

    public static void main(String[] args) {
        System.out.println(getOldest(bookList));
    }
}
