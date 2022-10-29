package Day57.Practice.Ibrahim.Task1.Devices;

import Day57.Practice.Ibrahim.Task1.Devices.InterfaceDevice;

public abstract class AbstractDevice implements InterfaceDevice {

    protected String name;
    protected double price;

    public AbstractDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void setName(String name);

    public abstract void setPrice(double price);

}
