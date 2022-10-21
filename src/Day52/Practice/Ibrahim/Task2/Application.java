package Day52.Practice.Ibrahim.Task2;

public class Application {

    public static void main(String[] args) {
        Movie movie = new Movie("12 Angry Man", "1957");
        movie.setBuyPrice(13.99);
        movie.setRentPrice(4.99);

        Movie movie1 = new Movie("Avatar", "2009");
        movie1.setBuyPrice(15.99);
        movie1.setRentPrice(6.99);

        Movie movie2 = new Movie("Matrix", "1999");
        movie2.setBuyPrice(14.99);
        movie2.setRentPrice(5.99);




        Cinema cinema = new Cinema();
        cinema.addMovie(movie);
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        cinema.getListOfMovies().forEach(m -> System.out.println(m));

        cinema.removeMovie(movie);
        cinema.removeMovie("Avatar");

        cinema.getListOfMovies().forEach(m -> System.out.println(m));


    }
}
