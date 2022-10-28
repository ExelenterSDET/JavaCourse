package Day56.Tohir.PublicTransport;

import Day56.Tohir.Vehicle.Vehicle;

public abstract class PublicTransport extends Vehicle {
    protected Lane lane;
    protected WorkingShift workingShift;
    protected double price;
    public PublicTransport(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PublicTransport(String brand, String model, int speed, Lane lane, WorkingShift workingShift, double price) {
        super(brand, model, speed);
        this.lane = lane;
        this.workingShift = workingShift;
        this.price = price;
    }

    public abstract Lane getLane();

    public abstract void setLane(Lane lane);

    public abstract WorkingShift getWorkingShift();

    public abstract void setWorkingShift(WorkingShift workingShift);

    public abstract double getPrice();

    public abstract void setPrice(double price);
}
