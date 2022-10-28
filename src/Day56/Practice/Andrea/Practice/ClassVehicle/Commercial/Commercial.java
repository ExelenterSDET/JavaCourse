package Day56.Practice.Andrea.Practice.ClassVehicle.Commercial;


import Day56.Practice.Andrea.Practice.ClassVehicle.Vehicle.Vehicle;

public abstract class Commercial extends Vehicle {
    protected double pricePerMile;
    protected double insurancePrice;

    public Commercial(String brand, String model, double speed, int numberOfPassengers, double gasConsumption, double pricePerMile, double insurancePrice) {
        super(brand, model, speed);
        this.pricePerMile = pricePerMile;
        this.insurancePrice = insurancePrice;
    }

    public Commercial(String brand, String model, double speed){
        super(brand, model, speed);
    }

    public Commercial(String brand, String model, double speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed);
    }

    abstract double getPricePerMile() ;

    abstract void setPricePerMile();

    abstract double getInsurancePrice();

    abstract void setInsurancePrice();
}
