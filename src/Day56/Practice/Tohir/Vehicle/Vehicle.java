package Day56.Tohir.Vehicle;

public abstract class Vehicle {
    protected String Brand;
    protected String Model;
    protected int Speed;
    protected int NumberofPassangers;
    protected double GasConsumption;

    public Vehicle(String brand, String model, int speed) {
        Brand = brand;
        Model = model;
        Speed = speed;
    }

    public abstract String getBrand();

    public abstract String getModel();

    public abstract int getSpeed();

    public abstract int getNumberofPassangers();

    public abstract void setNumberofPassangers(int numberofPassangers);


    public abstract double getGasConsumption();

    public abstract void setGasConsumption(double gasConsumption);

    public abstract void print();
}
