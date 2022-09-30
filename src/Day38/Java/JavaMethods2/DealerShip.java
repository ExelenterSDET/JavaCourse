package Day38.Java.JavaMethods2;

public class DealerShip {

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = car.setCarAttributes("Tesla", "X", 2020, 50000);
        Car car2 = car.setCarAttributes("Toyota", "Avalon", 2022, 35000);

        System.out.println(car1);
        System.out.println(car2);
    }
}
