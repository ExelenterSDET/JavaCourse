package Day56.Practice.Sebahattin.Commercial;

public class Taxi extends Commercial{
    private String medallionNumber;
    private String driverName;

    public Taxi(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Taxi(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    public Taxi(String brand, String model, int speed, double pricePerMile, double insurancePrice, String medallionNumber, String driverName) {
        super(brand, model, speed, pricePerMile, insurancePrice);
        this.medallionNumber = medallionNumber;
        this.driverName = driverName;
    }

    public String getMedallionNumber() {
        return medallionNumber;
    }

    public void setMedallionNumber(String medallionNumber) {
        this.medallionNumber = medallionNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public double getPricePerMile() {
        return super.pricePerMile;
    }

    @Override
    public void setPricePerMile(double pricePerMile) {
        super.pricePerMile = pricePerMile;
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
        return super.numbersOfPassengers;
    }

    @Override
    public void setNumbersOfPassengers(int numbersOfPassengers) {
        super.numbersOfPassengers = numbersOfPassengers;
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
                "driverName='" + driverName + '\'' +
                ", model='" + model + '\'' +
                ", medallionNumber='" + medallionNumber + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                ", numbersOfPassengers=" + numbersOfPassengers +
                ", gasConsumption=" + gasConsumption +
                '}');
    }
}
