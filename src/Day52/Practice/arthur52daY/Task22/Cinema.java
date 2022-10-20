package Day52.Practice.arthur52daY.Task22;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Movie> ml = new ArrayList<>();

    public void addMovie(Movie movie){
        ml.add(movie);
    }

    public void rmMovie(Movie movie){
        ml.remove(movie);
    }

    public void rmMovie(String movie){
        ml.removeIf(m->m.getName().equals(movie));
    }


    public ArrayList<Movie> getMl() {
        return ml;
    }



    @Override
    public String toString() {
        return "Cinema{" +
                "ml=" + ml +
                '}';
    }
}
