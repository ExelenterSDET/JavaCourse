package Day55.Part1.Task;

import java.util.ArrayList;

public class Library {
    public static ArrayList<Book> listofBooks = new ArrayList<>();
    static {
        Book AnimalFarm = new Book("Animal Farm","George Orwell",1955);
        listofBooks.add(AnimalFarm);
        Book Shahname = new Book("Shahname","Firdousi",995);
        listofBooks.add(Shahname);
        Book AtlasShrugged = new Book("Atlas Shrugged","Ayn Rend",1943);
        listofBooks.add(AtlasShrugged);
    }
    public static Book GetOldestBook(ArrayList<Book> listofbooks){
        int oldest = 2020;
        Book book = new Book("", "",0);
        for (Book listofbook : listofbooks) {
            if(listofbook.getYearofPublish()<oldest){
                oldest = listofbook.getYearofPublish();
                book.setName(listofbook.getName());
                book.setAuthor(listofbook.getAuthor());
                book.setYearofPublish(listofbook.getYearofPublish());
            }
        }
        return book;
    }

    public static void main(String[] args) {
        System.out.println(GetOldestBook(listofBooks));
    }
}
