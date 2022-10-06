package Day42.Practice.Andrea.Practice.Task1;

import java.util.ArrayList;

public class Inventory {
    static final ArrayList<Car> inventoryList = new ArrayList<>();

    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Mach E", 120, 60000.00);
        Car car2 = new Car("Dodge", "Challenger", 90, 40000.00);
        Car car3 = new Car("Toyota", "Avalon", 30, 10000.00);

        inventoryList.add(car1);
        inventoryList.add(car2);
        inventoryList.add(car3);
        System.out.println(inventoryList);
    }
}
