package Day52.Java.Task2;

public class Application {
    public static void main(String[] args) {
        Movie superman = new Movie("The Death and Return of Superman", "01 01 2019");
        superman.setRentPrice(2.99);
        superman.setBuyPrice(19.99);

        Movie eraser = new Movie("Eraser: Reborn", "02 10 2022");
        eraser.setRentPrice(4.99);
        eraser.setBuyPrice(13.99);

        Movie maverick = new Movie("Top Gun: Maverick", "05 15 2022");
        maverick.setRentPrice(5.99);
        maverick.setBuyPrice(19.99);

        Cinema cinema = new Cinema();
        cinema.addMovie(superman);
        cinema.addMovie(eraser);
        cinema.addMovie(maverick);

        for (Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }

        cinema.removeMovie("The Death and Return of Superman");

        System.out.println("===========After removeMovie==============");

        for (Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }

    }
}
