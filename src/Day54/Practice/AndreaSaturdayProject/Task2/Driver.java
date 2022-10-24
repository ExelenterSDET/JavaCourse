package Day54.Practice.AndreaSaturdayProject.Task2;

import java.util.ArrayList;

import static Day54.Practice.AndreaSaturdayProject.Task2.Condition.*;
import static Day54.Practice.AndreaSaturdayProject.Task2.Weather.*;

public class Driver {

    Weather weather;
    ArrayList<Car> carList;

    public Driver(Weather weather, ArrayList<Car> carList) {
        this.weather = weather;
        this.carList = carList;
    }

    public void buy(Car car) throws NoSuchMethodException{ //checked
        if (car.getCondition() == RESTORABLE || car.getCondition() == PARTS_CAR){
            throw new NoSuchMethodException("Car is not in good enough condition to buy.");
        }
    }

    public void drive(Weather weather){  //unchecked
        if (weather == SNOW || weather == FROST || weather == FOG){
            throw new RuntimeException("Weather is not good for driving.");
        }
    }
}
