package Day54.Practice.Ibrahim_SP.Task2;

public class Car extends Vehicle{
    Condition condition;


    public Car(String brand, String model, int year, double price, Condition condition) {
        super(brand, model, year, price);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "condition=" + condition +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
