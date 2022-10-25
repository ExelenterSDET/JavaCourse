package Day55.Part1.Task;

public class Book {
     String Name;
     String Author;
     int YearofPublish;

    public Book(String name, String author, int yearofPublish) {
        Name = name;
        Author = author;
        YearofPublish = yearofPublish;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYearofPublish() {
        return YearofPublish;
    }

    public void setYearofPublish(int yearofPublish) {
        YearofPublish = yearofPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", YearofPublish=" + YearofPublish +
                '}';
    }
}
