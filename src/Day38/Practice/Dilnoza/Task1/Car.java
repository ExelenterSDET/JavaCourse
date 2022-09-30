package Day38.Practice.Dilnoza.Task1;

public class Car {

    String brand;
    String model;
    int year;
    double price;



    public  Car setCarAttributes(String brand, String model,int year, double price){
        Car myCar = new Car();
        myCar.brand=brand;
        myCar.model=model;
        myCar.year=year;
        myCar.price=price;
        return myCar;
    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
