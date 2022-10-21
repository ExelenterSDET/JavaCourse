package Day52.Practice.Malika.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
 /* 1 Create a class Movie
 attributes
         name
         year of release
         rent price
         buy price*/

    /*2 Make all attributes private and
    create setters and getters methods */

    /*3 You may create an overloaded constructor
     for some attributes.
if you use attributes in the constructor,
 make those attributes read only. */

    /*4 Create a toString method. */

    /* 5 Create a class Cinema.
attribute
List of Movies */

    /*6 create:
a method as addMovie
getter for the listOfMovies.
toString()*/

    /* 7 Create a class as Application
create movies, create cinema instances. etc...*/

    private String name;
    private LocalDate yearOfRelease;
    private Double rentPrice;
    private Double buyPrice;

    public Movie(String name, String yearOfRelease) {
        this.name = name;
        this.yearOfRelease = LocalDate.parse(yearOfRelease, DateTimeFormatter.ofPattern("MM dd yyy"));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }
    
}

