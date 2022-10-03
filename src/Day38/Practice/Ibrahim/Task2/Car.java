package Day38.Practice.Ibrahim.Task2;

public class Car {
    String make;
    String model;
    int year;
    double price;

    public Car setCarValues (String make, String model, int year, double price){
        Car car = new Car();
        car.make = make;
        car.model = model;
        car.year = year;
        car.price = price;
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make = '" + make + '\'' +
                ", Model = '" + model + '\'' +
                ", Year = " + year +
                ", Price = $" + price +
                '}';
    }
}
