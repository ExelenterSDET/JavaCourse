package Day54.Practice.UfukSaturdayProject.CarProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    private Weather weather;
    ArrayList<Car> carlist;

    public Driver(Weather weather, ArrayList<Car> carlist) {
        this.weather = weather;
        this.carlist = carlist;
    }

    public void buy(Car car) throws RuntimeException{
        switch(car.getCondition()){
            case EXCELLENT:
                System.out.println("Do not miss it!");
                break;
            case RESTORABLE:
                throw new RuntimeException("If you have time and more money you can buy and fix it!");
            case FINE:
                System.out.println("Buy it!");
                break;
            case PARTS_CAR:
                throw new RuntimeException("It can be used only as parts!");
            case GOOD:
                System.out.println("Search a little bit!");
                break;
            case VERY_GOOD:
                System.out.println("You can buy it!");
                break;
        }
    }

    public void drive(Weather weather) throws Exception{
        switch(weather){
            case RAIN:
                System.out.println("Be careful about rain! ");
                break;
            case SNOW:
                throw new Exception("If you want to drive, you need snow tires!");
            case WIND:
                System.out.println("Have a good drive!");
                break;
            case FROST:
                throw new Exception("Do not drive because of frost! ");
            case FOG:
                throw new Exception("Do not drive because fog is dangereous");
            case SUNSHINE:
                System.out.println("Enjoy your drive!");
                break;
        }
    }
}
