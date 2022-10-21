package Day52.Tohir.Task2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
   private final ArrayList<Day52.Tohir.Task2.Movie> list = new ArrayList<>();

    public void addMovie(Day52.Tohir.Task2.Movie movie) {
        if (this.list.contains(movie))
        {
            throw new RuntimeException("Film already exists");

            }
        this.list.add(movie);
        }


    public void removeMovie(Day52.Tohir.Task2.Movie movie) {
        this.list.remove(movie);
    }

    public List<Day52.Tohir.Task2.Movie> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "list=" + list +
                '}';
    }
}
