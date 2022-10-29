package Day56.Tohir.Commercial;

public class Truck extends Commercial{
    protected int LicenseID;
    protected String Company;

    public int getLicenseID() {
        return LicenseID;
    }

    public void setLicenseID(int licenseID) {
        LicenseID = licenseID;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Truck(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
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
                "LicenseID='" + LicenseID + '\'' +
                ", Company='" + Company + '\'' +
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
