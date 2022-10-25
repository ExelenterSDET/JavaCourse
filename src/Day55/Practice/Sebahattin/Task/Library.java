package Day55.Practice.Sebahattin.Task;


import java.util.ArrayList;

public class Library {
    public static final ArrayList<Book> listOfBooks = new ArrayList<>();


    static{
        listOfBooks.add(new Book("Sefiller","Victor Hugo",1862));
        listOfBooks.add(new Book("Boşluk","Ahmed Günbay Yıldız",2016));
        listOfBooks.add(new Book("Cezasız eğitim", "Adem Güneş",1999));
    }
        public static Book oldestBook(){
            Book oldestBook = listOfBooks.get(0);
            for(Book book : listOfBooks){
                oldestBook = oldestBook.getYear() > book.getYear() ? book : oldestBook;
            }
            return oldestBook;
        }

    public static void main(String[] args) {
        System.out.println(oldestBook());
    }
}
