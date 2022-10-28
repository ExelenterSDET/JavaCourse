package Day56.Tohir.Commercial;

public class Taxi extends Commercial {
    protected String medallionNumber;
    protected String driverName;

    public Taxi(String brand, String model, int speed, String medallionNumber, String driverName) {
        super(brand, model, speed);
        this.medallionNumber = medallionNumber;
        this.driverName = driverName;
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

    public Taxi(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Taxi(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
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
        System.out.println(getClass().getSimpleName() + "{" +
                "medallionNumber='" + medallionNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + Brand + '\'' +
                ", model='" + Model + '\'' +
                ", speed=" + Speed +
                ", numbersOfPassengers=" + NumberofPassangers +
                ", gasConsumption=" + GasConsumption +
                '}');

    }


}
