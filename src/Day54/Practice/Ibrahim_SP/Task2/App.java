package Day54.Practice.Ibrahim_SP.Task2;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<Car> listOfCar = new ArrayList<>();
        Car toyota = new Car("Toyota", "RAV4", 2021, 50000, Condition.EXCELLENT);
        Car tesla = new Car("Tesla", "Model X", 2019, 99000, Condition.RESTORABLE);

        listOfCar.add(toyota);
        listOfCar.add(tesla);


        Driver dr = new Driver(Weather.SNOW, listOfCar);
        try{
            dr.drive(Weather.SNOW);
        }catch (Exception e){
            System.out.println("e = " + e);
        }

        try{
            dr.buy(tesla);
        }catch (Exception e){
            System.out.println("e = " + e);
        }
    }
}
