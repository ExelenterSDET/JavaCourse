package Day42.Practice.Ibrahim;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {

    static final ArrayList<Car> inventory = new ArrayList<>();


    public static void main(String[] args) {
        Car car = new Car("Toyota", "RAV4", 120, 549999);
        Car car1 = new Car("Subaru", "Outback", 100, 44999);
        Car car2 = new Car("Tesla", "Model X", 150, 84999);

        inventory.add(car);
        inventory.add(car1);
        inventory.add(car2);
        System.out.println(inventory);
    }
}
