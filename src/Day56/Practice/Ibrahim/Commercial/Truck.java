package Day56.Practice.Ibrahim.Commercial;

public class Truck extends Commercial{

    protected String licenceID;
    protected String company;

    public Truck(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice, String licenceID, String company) {
        super(brand, model, speed, pricePerMile, insurancePrice);
        this.licenceID = licenceID;
        this.company = company;
    }

    public String getLicenceID() {
        return licenceID;
    }

    public void setLicenceID(String licenceID) {
        this.licenceID = licenceID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
                "licenceID='" + licenceID + '\'' +
                ", company='" + company + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption +
                '}');
    }
}
