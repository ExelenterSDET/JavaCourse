package Day56.Practice.Ibrahim.Public;

public class Train extends PublicTransport{
    protected int workingHours;

    public Train(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Train(String brand, String model, int speed, Lane lane, WorkingShifts workingShifts, double pricePerRide) {
        super(brand, model, speed, lane, workingShifts, pricePerRide);
    }

    public Train(String brand, String model, int speed, Lane lane, WorkingShifts workingShifts, double pricePerRide, int workingHours) {
        super(brand, model, speed, lane, workingShifts, pricePerRide);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public Lane getLane() {
        return super.lane;
    }

    @Override
    public void setLane(Lane lane) {
        super.lane = lane;
    }

    @Override
    public WorkingShifts getWorkingShifts() {
        return super.workingShifts;
    }

    @Override
    public void setWorkingShifts(WorkingShifts workingShifts) {
        super.workingShifts = workingShifts;
    }

    @Override
    public double getPricePerRide() {
        return super.pricePerRide;
    }

    @Override
    public void setPricePerRide(double pricePerRide) {
        super.pricePerRide = pricePerRide;
    }

    @Override
    public String getBrand() {
        return super.brand;
    }

    @Override
    public String getModel() {
        return super.model;
    }

    @Override
    public int getSpeed() {
        return super.speed;
    }

    @Override
    public int getNumbersOfPassengers() {
        return super.numberOfPassenger;
    }

    @Override
    public void setNumbersOfPassengers(int numbersOfPassengers) {
        super.numberOfPassenger = numbersOfPassengers;
    }

    @Override
    public double getGasConsumption() {
        return super.gasConsumption;
    }

    @Override
    public void setGasConsumption(double gasConsumption) {
        super.gasConsumption = gasConsumption;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + "{" +
                "workingHours=" + workingHours +
                ", lane=" + lane +
                ", workingShifts=" + workingShifts +
                ", pricePerRide=" + pricePerRide +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption +
                '}');
    }
}
