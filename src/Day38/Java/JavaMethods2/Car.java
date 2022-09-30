package Day38.Java.JavaMethods2;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car setCarAttributes(String brand, String model, int year, double price){
        Car car = new Car();
        car.brand = brand;
        car.model =  model;
        car.year = year;
        car.price = price;
        return car;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
