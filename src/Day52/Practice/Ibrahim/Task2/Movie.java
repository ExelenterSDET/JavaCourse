package Day52.Practice.Ibrahim.Task2;

public class Movie {
    private String name;
    private String releaseDate;
    private Double buyPrice;
    private Double rentPrice;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Movie(String name, String releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", buyPrice = $" + buyPrice +
                ", rentPrice = $" + rentPrice +
                '}';
    }
}
