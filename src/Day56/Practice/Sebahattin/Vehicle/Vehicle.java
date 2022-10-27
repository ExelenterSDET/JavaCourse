package Day56.Practice.Sebahattin.Vehicle;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int speed;
    protected int numbersOfPassengers;
    protected double gasConsumption;

    public Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public abstract String getBrand();

    public abstract String getModel();

    public abstract int getSpeed();

    public abstract int getNumbersOfPassengers();

    public abstract void setNumbersOfPassengers(int numbersOfPassengers);

    public abstract double getGasConsumption();

    public abstract void setGasConsumption(double gasConsumption);

    public abstract void print();
}
