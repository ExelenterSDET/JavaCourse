package Day52.Practice.Malika.Task2;

import java.util.ArrayList;

public class Cinema {
    private final ArrayList<Movie> listOfMovies = new ArrayList<>();

    public ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }

    public void addMovie(Movie movie){
        listOfMovies.add(movie);
    }

    public void removeMovie(Movie movie){
        listOfMovies.remove(movie);
    }

    public void removeMovie(String movieName){
        listOfMovies.removeIf(movie -> movie.getName().equals(movieName));
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "listOfMovies=" + listOfMovies +
                '}';
    }
}

