package Day57.Practice.Sebahattin.Task.Devices;

public abstract class AbstractDevice {
    protected String name;
    protected double price;

    public AbstractDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void setName(String name);
    public abstract void setPrice(double price);
}
