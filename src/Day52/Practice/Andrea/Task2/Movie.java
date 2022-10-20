package Day52.Practice.Andrea.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {

    private String name;
    LocalDate releaseYear;
    private Double rentalPrice;
    private Double buyPrice;

    public Movie(String name, String year) {
        this.name = name;
        this.releaseYear = releaseYear = LocalDate.parse(year, DateTimeFormatter.ofPattern("MM dd yyy"));
    }

    public String getName() {
        return name;
    }

   public LocalDate getReleaseYear() {
        return releaseYear;
    }


    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
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
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", rentalPrice=" + rentalPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
