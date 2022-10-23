package Day54.Practice.AndreaSaturdayProject.Task2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car("Dodge", "Challenger", 2017, 12000.99, Condition.RESTORABLE);
        Car car2 = new Car("Dodge", "Challenger", 2022, 42000.99, Condition.EXCELLENT);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        //why do we need to pass Weather into both the constructor and the drive method?
        Driver driver1 = new Driver(Weather.FROST, cars);

        try {
            driver1.drive(Weather.FROST);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            driver1.buy(car1);
        } catch(NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }
}
