package Day54.Practice.Ibrahim_SP.Task2;

import java.util.ArrayList;

public class Driver {
    Weather weather;
    ArrayList<Car> listOfCar;


    public Driver(Weather weather, ArrayList<Car> listOfCar) {
        this.weather = weather;
        this.listOfCar = listOfCar;
    }

    public void buy(Car car) throws Exception {
        switch (car.condition){
            case PARTS_CAR, RESTORABLE -> throw new Exception("This car can not drivable!");
        }
    }

    public void drive(Weather weather){
        switch (weather) {
            case SNOW -> throw new RuntimeException("Weather is snowy for driving");
            case FROST -> throw new RuntimeException("Weather is frosty for driving");
            case FOG -> throw new RuntimeException("Weather is foggy for driving");
            case RAIN, WIND, SUNSHINE -> System.out.println("You can drive");
        }
    }
}
