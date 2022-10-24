package Day54.Practice.DilnozaSP.Task1.Task2;

import java.util.List;

import static Day54.Practice.DilnozaSP.Task1.Task2.Condition.PARTS_CAR;
import static Day54.Practice.DilnozaSP.Task1.Task2.Condition.RESTORABLE;

public class Driver {
    Weather weather;
    List<Car> listOfCars;

    public Driver(Weather weather, List<Car> listOfCars) {
        this.weather = weather;
        this.listOfCars = listOfCars;
    }

    public void buy(Condition condition) throws Exception {
        switch (condition) {
            case RESTORABLE:
                throw new Exception("Can can be restored");
            case PARTS_CAR:
                throw new Exception("Only for parts");

        }
    }
public void buy(Car car) throws Exception {


    if (car.getCondition()== RESTORABLE||car.getCondition()==PARTS_CAR) {
        throw new Exception("Can can be restored or only for Parts");
    }
    }

    public void drive(Weather weather) {
        switch (weather) {
            case SNOW:
                throw new RuntimeException("It is snowing, better to stay home");
            case FROST:
                throw new RuntimeException("The roads are slippery. Too Frosty");
            case FOG:
                throw new RuntimeException("The Fog is too thing. Zero visibility");
        }
        System.out.println("test");

    }


}