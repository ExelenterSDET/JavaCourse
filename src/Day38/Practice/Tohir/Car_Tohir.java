package Day38.Practice.Tohir;

public class Car_Tohir {
    String Brand;
    String Model;
    int Year;
    int Price;
    public Car_Tohir SetCarAttributes(String brand, String model,int year,int price)
    {
        Car_Tohir car_tohir = new Car_Tohir();
        car_tohir.Brand = brand;
        car_tohir.Model = model;
        car_tohir.Year = year;
        car_tohir.Price = price;
        return car_tohir;
    }

    @Override
    public String toString() {
        return "Car_Tohir{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", Price=" + Price +"$"+
                '}';
    }
}
