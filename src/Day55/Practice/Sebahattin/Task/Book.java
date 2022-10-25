package Day55.Practice.Sebahattin.Task;

public class Book {
    private String name;
    private String authour;
    private int year;

    public String getName() {
        return name;
    }

    public String getAuthour() {
        return authour;
    }

    public int getYear() {
        return year;
    }

    public Book(String name, String authour, int year) {
        this.name = name;
        this.authour = authour;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authour='" + authour + '\'' +
                ", year=" + year +
                '}';
    }
}
