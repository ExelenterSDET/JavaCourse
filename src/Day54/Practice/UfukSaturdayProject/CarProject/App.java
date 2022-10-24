package Day54.Practice.UfukSaturdayProject.CarProject;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1=new Car("Toyota","Corolla",2017,25000,Condition.VERY_GOOD);
        Car car2=new Car("KIA","Sedona",2019,32000,Condition.FINE);
        Car car3=new Car("Ford","Focus",2014,12000,Condition.RESTORABLE);

        ArrayList<Car> cars=new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Driver driver=new Driver(Weather.RAIN,cars);
        try {
            driver.buy(car1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            driver.buy(car2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            driver.buy(car3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }



        try {
            driver.drive(Weather.RAIN);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            driver.drive(Weather.FROST);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
