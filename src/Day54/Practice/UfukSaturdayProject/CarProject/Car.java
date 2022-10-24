package Day54.Practice.UfukSaturdayProject.CarProject;

public class Car extends Vehicle{

    private Condition condition;

//    public Car(Condition condition) {
//        this.condition = condition;
//    }
//
    public Condition getCondition() {
        return condition;
    }

    public Car(String brand, String model, int year, double price, Condition condition) {
        super(brand, model, year, price);
        this.condition = condition;
    }

}
