package Day54.Practice.arthur54day.Task2;

import java.util.ArrayList;

public class Driver {

    Weather weather;
    ArrayList<Car> c = new ArrayList<>();


    public Driver() {

    }

    void buy(Car car) throws CarConditionException{
        if((car.condition==Condition.RESTORABLE) || (car.condition==Condition.PARTS_CAR)){
            throw new CarConditionException("car condition unacceptable exception");
        } else {
            c.add(car);
        }
    }

    void drive(Weather w){
        if(w==Weather.FROST){
            throw new RuntimeException("Inclement Weather Exception");
        }

    }
}
