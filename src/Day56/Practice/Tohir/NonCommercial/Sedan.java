package Day56.Tohir.NonCommercial;

public class Sedan extends NonCommercial{

    protected String DriverName;

    public Sedan(String brand, String model, int speed, String driverName) {
        super(brand, model, speed);
        DriverName = driverName;
    }

    public Sedan(String brand, String model, int speed, int plateNumber, double insurancePrice, String driverName) {
        super(brand, model, speed, plateNumber, insurancePrice);
        DriverName = driverName;
    }

    public Sedan(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Sedan(String brand, String model, int speed, int plateNumber, double insurancePrice) {
        super(brand, model, speed, plateNumber, insurancePrice);
    }

    @Override
    public int getPlateNumber() {
        return super.plateNumber;
    }

    @Override
    public void setPlateNumber(int plateNumber) {
        super.plateNumber = plateNumber;
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
        System.out.println("Sedan{" +
                "DriverName='" + DriverName + '\'' +
                ", plateNumber=" + plateNumber +
                ", insurancePrice=" + insurancePrice +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Speed=" + Speed +
                ", NumberofPassangers=" + NumberofPassangers +
                ", GasConsumption=" + GasConsumption +
                '}');
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "DriverName='" + DriverName + '\'' +
                ", plateNumber=" + plateNumber +
                ", insurancePrice=" + insurancePrice +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Speed=" + Speed +
                ", NumberofPassangers=" + NumberofPassangers +
                ", GasConsumption=" + GasConsumption +
                '}';
    }
}
