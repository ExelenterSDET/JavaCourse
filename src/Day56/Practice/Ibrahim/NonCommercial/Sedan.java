package Day56.Practice.Ibrahim.NonCommercial;

public class Sedan extends NonCommercial{
    protected String driverName;

    public Sedan(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Sedan(String brand, String model, int speed, String plateNumber, double insurancePrice) {
        super(brand, model, speed, plateNumber, insurancePrice);
    }

    public Sedan(String brand, String model, int speed, String plateNumber, double insurancePrice, String driverName) {
        super(brand, model, speed, plateNumber, insurancePrice);
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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
    public String getPlateNumber() {
        return super.plateNumber;
    }

    @Override
    public void setPlateNumber(String plateNumber) {
        super.plateNumber = plateNumber;
    }

    @Override
    public double getInsurancePrice() {
        return super.insurancePrice;
    }

    @Override
    public void setInsurancePrice(double insurancePrice) {
        super.insurancePrice = insurancePrice;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + "{" +
                "driverName='" + driverName + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption +
                '}');
    }
}
