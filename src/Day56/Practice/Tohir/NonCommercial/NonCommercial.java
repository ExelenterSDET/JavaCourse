package Day56.Tohir.NonCommercial;

import Day56.Tohir.Vehicle.Vehicle;

public abstract class NonCommercial extends Vehicle {

    protected int plateNumber;
    protected double insurancePrice;

    public NonCommercial(String brand, String model, int speed) {
        super(brand, model, speed);
    }
    public NonCommercial(String brand, String model, int speed, int plateNumber, double insurancePrice) {
        super(brand, model, speed);
        this.plateNumber = plateNumber;
        this.insurancePrice = insurancePrice;
    }

    public abstract int getPlateNumber();

    public abstract void setPlateNumber(int plateNumber);

    public abstract double getInsurancePrice();

    public abstract void setInsurancePrice(double insurancePrice);
}
