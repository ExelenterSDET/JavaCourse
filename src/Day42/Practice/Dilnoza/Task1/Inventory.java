package Day42.Practice.Dilnoza.Task1;

import java.util.ArrayList;

public class Inventory {
   static final ArrayList<Car> inventoryList= new ArrayList<>();

    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Rav",100,35000D);
        Car car2 = new Car("Tesla","X",110,85000D);
        Car car3 = new Car("Honda","XL",90,25000D);

        inventoryList.add(car1);
        inventoryList.add(car2);
        inventoryList.add(car3);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("====================");
        System.out.println("inventoryList = " + inventoryList);




    }

}
