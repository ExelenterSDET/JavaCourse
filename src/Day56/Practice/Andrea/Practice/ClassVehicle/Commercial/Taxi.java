package Day56.Practice.Andrea.Practice.ClassVehicle.Commercial;

public class Taxi extends Commercial {

    private String medallionNumber;
    private String driverName;

    public Taxi(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Taxi(String brand, String model, double speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    public Taxi(String brand, String model, double speed, int numberOfPassengers, double gasConsumption, double pricePerMile, double insurancePrice, String medallionNumber, String driverName) {
        super(brand, model, speed, numberOfPassengers, gasConsumption, pricePerMile, insurancePrice);
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
        return 0; //why can't I use super.getPricePerMile()?
    }

    @Override
    void setPricePerMile() {

    }

    @Override
    double getInsurancePrice() {
        return 0;
    }

    @Override
    void setInsurancePrice() {

    }

    @Override
    public int getNumberOfPassengers() {
        return 0;
    }

    @Override
    public double getGasConsumption() {
        return 0;
    }

    @Override
    public void setNumberOfPassengers() {

    }

    @Override
    public void setGasConsumption() {

    }
}
