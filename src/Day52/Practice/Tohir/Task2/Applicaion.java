package Day52.Tohir.Task2;

public class Applicaion {
    public static void main(String[] args) {
        Day52.Tohir.Task2.Movie batman1 = new Day52.Tohir.Task2.Movie("Batman Begins","2006-21-03");
        batman1.setBuyPrice(12.99);
        batman1.setRentPrice(1.99);
        System.out.println(batman1);
        Day52.Tohir.Task2.Movie batman2 = new Day52.Tohir.Task2.Movie("Batman Rises","2008-21-04");
        batman1.setBuyPrice(19.99);
        batman1.setRentPrice(2.99);
        System.out.println(batman2);
        Day52.Tohir.Task2.Cinema Vatan = new Day52.Tohir.Task2.Cinema();
        Vatan.addMovie(batman1);
        Vatan.addMovie(batman2);
        System.out.println(Vatan);
        //Vatan.addMovie(batman2);
        System.out.println(Vatan);
    }
}
