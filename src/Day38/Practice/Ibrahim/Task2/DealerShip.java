package Day38.Practice.Ibrahim.Task2;

public class DealerShip {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = car.setCarValues("Toyota", "RAV4", 2021, 50000);
        Car car2 = car.setCarValues("Subaru", "Outback", 2023, 45000);
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
    }
}
