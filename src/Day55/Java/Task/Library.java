package Day55.Java.Task;

import Day54.Practice.Andrea.Practice.AccessModifiers.Example1.A;

import java.util.ArrayList;

public class Library {
    /*
    - create a final List of Books.
     */

    public static final ArrayList<Book> listOfBooks = new ArrayList<>();
    /*
    - create static block. In the static block add couple of books into the list.
     */
    static{
        listOfBooks.add(new Book("It Starts with Us: A Novel (It Ends with Us)", "Colleen Hoover", 2022));
        listOfBooks.add(new Book("Charming Falls Apart: A Novel", " Angela Terry", 2020));
        listOfBooks.add(new Book("The Redo", "The Redo", 1990));
    }

    /*
    create a method which will return the oldest book.
     */

    public static Book oldestBook(){
        Book oldestBook = listOfBooks.get(0);
        for (Book book : listOfBooks) {
            oldestBook = oldestBook .getYear() > book.getYear() ? book : oldestBook;
        }
        return oldestBook;
    }

    /*
    in the main method print the oldest book.
     */
    public static void main(String[] args) {
        System.out.println(oldestBook());
    }
}
