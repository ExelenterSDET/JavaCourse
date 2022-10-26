package Day56.Practice.Sebahattin.NonCommercial;

import Day56.Practice.Sebahattin.Vehicle.Vehicle;

public abstract class NonCommercial extends Vehicle {
    protected String plateNumber;
    protected double insurancePrice;

    public NonCommercial(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public NonCommercial(String brand, String model, int speed, String plateNumber, double insurancePrice) {
        super(brand, model, speed);
        this.plateNumber = plateNumber;
        this.insurancePrice = insurancePrice;
    }

    public abstract String getPlateNumber();

    public abstract void setPlateNumber(String plateNumber);

    public abstract double getInsurancePrice();

    public abstract void setInsurancePrice(double insurancePrice);
}
