package Day52.Practice.Sebahattin.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String name;
    private LocalDate year;
    private Double rentPrice;
    private Double buyPrice;

    public Movie(String name, String year) {
        this.name = name;
        this.year = LocalDate.parse(year, DateTimeFormatter.ofPattern("MM dd yyy"));
    }

    public String getName() { return name;  }

    public LocalDate getYear() { return year;  }

    public Double getRentPrice() { return rentPrice;  }

    public void setRentPrice(Double rentPrice) { this.rentPrice = rentPrice; }

    public Double getBuyPrice() { return buyPrice; }

    public void setBuyPrice(Double buyPrice) { this.buyPrice = buyPrice; }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
