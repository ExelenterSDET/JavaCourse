package Day52.Practice.Andrea.Task2;

import java.util.ArrayList;

public class Cinema {

    private final ArrayList<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        this.movieList.add(movie);
    }

    public void removeMovie(Movie movie){
        movieList.remove(movie);
    }

    public void removeMovie(String movieName){
        for (Movie movie : movieList) {
            if(movie.getName().equals(movieName)){
                movieList.remove(movie);
            }
        }
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieList=" + movieList +
                '}';
    }
}
