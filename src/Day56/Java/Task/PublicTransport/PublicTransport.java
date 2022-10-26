package Day56.Java.Task.PublicTransport;

import Day56.Java.Task.Vehicle.Vehicle;

enum WorkingShift{
MORNING, DAY, EVENING, NIGHT
}

enum Lane{
MANHATTAN, QUINS, BROOKLYN, BRONX, STATEN_ISLAND
}
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
