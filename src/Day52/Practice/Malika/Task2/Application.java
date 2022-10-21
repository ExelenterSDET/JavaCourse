package Day52.Practice.Malika.Task2;

public class Application {
    public static void main(String[] args) {
        Movie action = new Movie("Terminator", "01 08 1990");
        action.setRentPrice(2.99);
        action.setBuyPrice(19.99);

        Movie drama = new Movie("Romeo and Juliet", "05 11 1971");
        drama.setRentPrice(4.99);
        drama.setBuyPrice(13.99);

        Movie comedy = new Movie("Rush Hour", "06 09 2004");
        comedy.setRentPrice(5.99);
        comedy.setBuyPrice(19.99);

        Cinema cinema = new Cinema();
        cinema.addMovie(action);
        cinema.addMovie(drama);
        cinema.addMovie(comedy);

        for (Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }

        cinema.removeMovie("Terminator");

        System.out.println("===========After removeMovie==============");

        for (Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }

    }
}
