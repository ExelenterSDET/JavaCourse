package Day52.Practice.Andrea.Task2;

public class Application {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Goonies", "01 01 2019");
        movie1.setRentalPrice(2.99);
        movie1.setBuyPrice(4.99);
        System.out.println(movie1);

        Cinema cinema1 = new Cinema();

        cinema1.addMovie(movie1);
        System.out.println(cinema1);
}
}
