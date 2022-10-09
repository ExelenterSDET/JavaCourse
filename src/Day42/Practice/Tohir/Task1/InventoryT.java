package Day42.Practice.Tohir.Task1;

import java.util.ArrayList;

public class InventoryT {
   static ArrayList<Car> cars = new ArrayList<>();
    public static void main(String[] args) {
        Car tesla = new Car(250,"tesla","teslas",34);
        Car Hyundai = new Car(250,"Hyundai","civic",34);
        cars.add(tesla);
        cars.add(Hyundai);
        System.out.println("cars = " + cars);
    }
}
