package Day56.Practice.Andrea.Practice.ClassVehicle.NonCommercial;


import Day56.Practice.Andrea.Practice.ClassVehicle.Vehicle.Vehicle;

abstract class NonCommercial extends Vehicle {
    private String plateNumber;
    private double insurancePrice;


    public NonCommercial(String brand, String model, double speed, int numberOfPassengers, double gasConsumption, String plateNumber, double insurancePrice) {
        super(brand, model, speed);
        this.plateNumber = plateNumber;
        this.insurancePrice = insurancePrice;
    }



    abstract String getPlateNumber();

    abstract void setPlateNumber(String plateNumber);

    abstract double getInsurancePrice();

    abstract void setInsurancePrice(double insurancePrice);
}
