package Day52.Practice.arthur52daY.Task22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String name;
    private LocalDate year;
    private Double rprice;
    private Double bprice;

    public Movie(String name, String year){
        this.name = name;
        LocalDate year1 = LocalDate.parse(year, DateTimeFormatter.ofPattern("MM dd yyyy"));
        this.year = year1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }


    public Double getRprice() {
        return rprice;
    }

    public void setRprice(Double rprice) {
        this.rprice = rprice;
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", rprice=" + rprice +
                ", bprice=" + bprice +
                '}';
    }
}
