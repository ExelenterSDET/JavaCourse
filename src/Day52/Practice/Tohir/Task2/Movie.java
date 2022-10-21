package Day52.Tohir.Task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String Name;
    private LocalDate yearOfRelease;
    private double rentPrice;
    private double buyPrice;

    public Movie(String name, String yearOfRelease) {
        Name = name;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-dd-MM");
        this.yearOfRelease = LocalDate.parse(yearOfRelease,dateTimeFormatter);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDateOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
