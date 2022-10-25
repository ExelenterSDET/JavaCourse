package Day55.Practice.Andrea.Task1;

public class Book {

    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
