package Day42.Practice.Anthony.Task1;

import java.util.ArrayList;

public class Inventory {
    static final ArrayList<Car> inventoryList = new ArrayList<>();


    public static void main(String[] args) {
        Car car1 = new Car("Toyota","COROLLA",70,45000.00);
        Car car2 = new Car("Tesla","S",90,95000.00);
        Car car3 = new Car("Nissan","ULTIMA",85,55000.00);


        inventoryList.add(car1); // can get without static
        inventoryList.add(car2);
        inventoryList.add(car3);

        System.out.println("inventoryList = " + inventoryList);
    }

}

