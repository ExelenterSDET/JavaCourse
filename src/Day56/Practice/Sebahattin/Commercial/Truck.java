package Day56.Practice.Sebahattin.Commercial;

public class Truck extends Commercial{
    private String licanseId;
    private String company;

    public Truck(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice, String licanseId, String company) {
        super(brand, model, speed, pricePerMile, insurancePrice);
        this.licanseId = licanseId;
        this.company = company;
    }

    public String getLicanseId() {
        return licanseId;
    }

    public void setLicanseId(String licanseId) {
        this.licanseId = licanseId;
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
        System.out.println(getClass().getSimpleName() + "{"+
                "company='" + company + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", licanseId='" + licanseId + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", numbersOfPassengers=" + numbersOfPassengers +
                ", gasConsumption=" + gasConsumption +
                '}');
    }
}
