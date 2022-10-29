package Day56.Practice.Andrea.Practice.ClassVehicle.Vehicle;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected double speed;
    protected int numberOfPassengers;
    protected double gasConsumption;

    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;

    }

    public abstract int getNumberOfPassengers();

    public abstract double getGasConsumption();

    public abstract void setNumberOfPassengers();

    public abstract void setGasConsumption();

}
