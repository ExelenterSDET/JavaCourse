package Day56.Tohir.Commercial;

import Day56.Tohir.Vehicle.Vehicle;

public abstract class Commercial extends Vehicle {

    public Commercial(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    protected double pricePerMile;
    protected double insurancePrice;

    public Commercial(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed);
        this.pricePerMile = pricePerMile;
        this.insurancePrice = insurancePrice;
    }

    public abstract double getPricePerMile();

    public abstract void setPricePerMile(double pricePerMile);

    public abstract double getInsurancePrice();

    public abstract void setInsurancePrice(double insurancePrice);
}
