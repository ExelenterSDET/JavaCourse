package Day54.Practice.AndreaSaturdayProject.Task2;

public class Car extends Vehicle{

    private final Condition condition;
    public Car(String brand, String model, int year, double price, Condition condition) {
        super(brand, model, year, price);
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }
}
