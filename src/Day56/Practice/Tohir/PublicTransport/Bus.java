package Day56.Tohir.PublicTransport;

public class Bus extends PublicTransport{


    public Bus(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Bus(String brand, String model, int speed, Lane lane, WorkingShift workingShift, double price) {
        super(brand, model, speed, lane, workingShift, price);
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
    public WorkingShift getWorkingShift() {
        return super.workingShift;
    }

    @Override
    public void setWorkingShift(WorkingShift workingShift) {
        super.workingShift = workingShift;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }

    @Override
    public String getBrand() {
        return super.Brand;
    }

    @Override
    public String getModel() {
        return super.Model;
    }

    @Override
    public int getSpeed() {
        return super.Speed;
    }

    @Override
    public int getNumberofPassangers() {
        return super.NumberofPassangers;
    }

    @Override
    public void setNumberofPassangers(int numberofPassangers) {
            super.NumberofPassangers = numberofPassangers;
    }

    @Override
    public double getGasConsumption() {
        return super.GasConsumption;
    }

    @Override
    public void setGasConsumption(double gasConsumption) {
        super.GasConsumption = gasConsumption;
    }

    @Override
    public void print() {

        System.out.println("Bus{" +
                "lane=" + lane +
                ", workingShift=" + workingShift +
                ", price=" + price +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Speed=" + Speed +
                ", NumberofPassangers=" + NumberofPassangers +
                ", GasConsumption=" + GasConsumption +
                '}');
    }

}
