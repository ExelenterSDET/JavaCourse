package Day54.Practice.arthur54day.Task2;

public class App {
    public static void main(String[] args) {
//        Car toyotaCamry = new Car("toyota", "camry", "2010", 15000, Condition.EXCELLENT);
        Car toyotaHighland = new Car("toyota", "camry", "2004", 3000, Condition.PARTS_CAR);
        Driver mike = new Driver();
        try {

            mike.drive(Weather.FROST);
            mike.buy(toyotaHighland);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}