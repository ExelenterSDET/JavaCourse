package Day52.Practice.arthur52daY.Task22;

public class Application {
    public static void main(String[] args) {
        Movie matrix = new Movie("matrix","01 01 1908");
        matrix.setBprice(5.00);
        matrix.setRprice(2.00);
        System.out.println(matrix);

        Movie  killer = new Movie("killer","01 01 1988");
        killer.setBprice(6.00);
        killer.setRprice(2.00);


        Cinema cinema = new Cinema();
        cinema.addMovie(matrix);
        cinema.addMovie(killer);

        System.out.println(cinema);

        for(Movie movie: cinema.getMl()){
            System.out.println(movie);
        }

        cinema.rmMovie("killer");

        for(Movie movie: cinema.getMl()){
            System.out.println(movie);
        }

    }

}
