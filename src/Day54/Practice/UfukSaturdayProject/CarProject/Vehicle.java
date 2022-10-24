package Day54.Practice.UfukSaturdayProject.CarProject;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, double price) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
        this.setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
