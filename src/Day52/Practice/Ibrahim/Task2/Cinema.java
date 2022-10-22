package Day52.Practice.Ibrahim.Task2;

import java.util.ArrayList;

public class Cinema {
    private final ArrayList<Movie> listOfMovies = new ArrayList<>();


    public void addMovie(Movie movie){
        listOfMovies.add(movie);

    }

    public void removeMovie(Movie movie){
        listOfMovies.remove(movie);
    }

    public void removeMovie(String movieName){
        for (Movie movie : listOfMovies){
            if (movie.getName().equals(movieName)){
                listOfMovies.remove(movie);
            }
        }
    }

    public ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "listOfMovies=" + listOfMovies +
                '}';
    }
}
