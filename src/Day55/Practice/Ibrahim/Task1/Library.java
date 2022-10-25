package Day55.Practice.Ibrahim.Task1;

import java.util.ArrayList;

public class Library {
    public static final  ArrayList<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book("Harry Potter3", "J. K. Rowling", 2000));
        bookList.add(new Book("LOTR", "J. R. R. Tolkien", 1954));
        bookList.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        bookList.add(new Book("Harry Potter2", "J. K. Rowling", 1998));
    }

    public static Book oldestBook(){
        Book oldestBook = bookList.get(0);

        for (Book book : bookList) {
            oldestBook = oldestBook.getYear() > book.getYear() ? book : oldestBook;
        }
        return oldestBook;
    }

    public static void main(String[] args) {

        System.out.println(oldestBook());
    }
}
