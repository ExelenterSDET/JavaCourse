package Day42.Practice.Sebahattin.Task1;

import java.util.ArrayList;

public class Inventory {
    static final  ArrayList<Car> inventoryList = new ArrayList<>();

    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Grandland X", 125, 45000.00);
        Car car2 = new Car("Honda", "CRV", 135, 65000.00);
        Car car3 = new Car("Volkswagen", "Golf", 115, 40000.00);

        Inventory.inventoryList.add(car1);
        Inventory.inventoryList.add(car2);
        Inventory.inventoryList.add(car3);
        System.out.println(inventoryList);
    }
}
