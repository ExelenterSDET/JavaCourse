package Day57.Practice.Ibrahim.Task1.Tablets;

import Day57.Java.Task.Tablets.TabletModels;
import Day57.Practice.Ibrahim.Task1.Devices.AbstractDevice;

public abstract class Tablet extends AbstractDevice {

    protected int memory;
    protected TabletBrands brand;

    public Tablet(String name, double price) {
        super(name, price);
    }

    public abstract void setMemory(int memory);

    public abstract void setBrand(TabletBrands brand);

    public abstract int getMemory();

}
