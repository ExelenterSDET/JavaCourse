package Day54.Practice.DilnozaSP.Task1.Task2;

public class Car extends Vehicle{
    Condition condition;

    public Car(Condition condition) {
        this.condition = condition;
    }

    public Car(String brand, String model, int year, double price, Condition condition) {
        super(brand, model, year, price);
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }
}
