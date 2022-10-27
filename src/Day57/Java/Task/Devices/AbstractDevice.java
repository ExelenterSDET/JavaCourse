package Day57.Java.Task.Devices;

public abstract class AbstractDevice implements Device {
    protected String name;
    protected double price;

    public AbstractDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void setName(String name);
    public abstract void setPrice(double price);
}
