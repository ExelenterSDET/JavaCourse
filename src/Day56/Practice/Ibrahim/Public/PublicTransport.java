package Day56.Practice.Ibrahim.Public;

import Day56.Practice.Ibrahim.Vehicle.Vehicle;

public abstract class PublicTransport extends Vehicle {

    protected Lane lane;
    protected WorkingShifts workingShifts;
    protected double pricePerRide;

    public PublicTransport(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PublicTransport(String brand, String model, int speed,
                           Lane lane, WorkingShifts workingShifts, double pricePerRide) {
        super(brand, model, speed);
        this.lane = lane;
        this.workingShifts = workingShifts;
        this.pricePerRide = pricePerRide;
    }

    public abstract Lane getLane();

    public abstract void setLane(Lane lane);

    public abstract WorkingShifts getWorkingShifts();

    public abstract void setWorkingShifts(WorkingShifts workingShifts);

    public abstract double getPricePerRide();

    public abstract void setPricePerRide(double pricePerRide);
}
