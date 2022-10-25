package Day55.Practice.Dilnoza;

import java.util.ArrayList;

public class Library {

    static final ArrayList<Book> listOfBooks= new ArrayList<>();
    static{
        listOfBooks.add(new Book("ABC","OneAuthor",1500));
        Book book= new Book("James Bond","Author",1900);
        Book book2 = new Book("Titanic","Another Author",2005);
        Book book3 = new Book("Pride and Prejudice","Jane Austin",1800);
        listOfBooks.add(book);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

    }
    public static Book getOldestBook(ArrayList<Book>listOfBooks){
        int oldest=Integer.MAX_VALUE;
        Book name =null;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if(listOfBooks.get(i).getYear()<oldest){
                oldest=listOfBooks.get(i).getYear();
                name =listOfBooks.get(i);
            }

        }return name;
    }

    public static void main(String[] args) {
        Book oldestBook = getOldestBook(listOfBooks);
        System.out.println("oldestBook = " + oldestBook);
        System.out.println("++++++++++++++++++++++++++++++++++");

    }

}
