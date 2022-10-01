package Day38.Practice.AnthonyTasks2;

public class DealerShip {
    public static void main(String[] args) {
        Car car = new Car();

        Car Vehicle1 = car.getCarDetails("Toyota",2022,50000.0);
        Car Vehicle2 = car.getCarDetails("Ford",2020,75000.0);

        System.out.println(Vehicle1);
        System.out.println(Vehicle2);
    }

}
