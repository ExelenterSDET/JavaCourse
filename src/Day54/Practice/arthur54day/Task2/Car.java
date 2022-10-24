package Day54.Practice.arthur54day.Task2;

public class Car extends Vehicle{

    Condition condition;

    public Car(String brand, String model, String year, double price, Condition condition) {
        super(brand, model, year, price);
        this.condition = condition;
    }
}
