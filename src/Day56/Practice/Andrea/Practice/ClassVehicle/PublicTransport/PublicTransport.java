package Day56.Practice.Andrea.Practice.ClassVehicle.PublicTransport;


import Day56.Practice.Andrea.Practice.ClassVehicle.Vehicle.Vehicle;

abstract class PublicTransport extends Vehicle {

    protected Lane lane;
    protected WorkingShift workingShift;
    protected double pricePerRide;

    public PublicTransport(String brand, String model, double speed, int numberOfPassengers, double gasConsumption, Lane lane, WorkingShift workingShift, double pricePerRide) {
        super(brand, model, speed);
        this.lane = lane;
        this.workingShift = workingShift;
        this.pricePerRide = pricePerRide;
    }

    abstract Lane getLane();

    abstract void setLane(Lane lane);

    abstract WorkingShift getWorkingShift();

    abstract void setWorkingShift(WorkingShift workingShift) ;

    abstract double getPricePerRide();

    abstract void setPricePerRide(double pricePerRide);
}
