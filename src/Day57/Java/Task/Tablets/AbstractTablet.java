package Day57.Java.Task.Tablets;

import Day57.Java.Task.Devices.AbstractDevice;
import Day57.Java.Task.Devices.Model;
import Day57.Java.Task.Tablets.TabletModels;

public abstract class AbstractTablet extends AbstractDevice implements Model {
    protected int memory;
    protected TabletModels model;

    public AbstractTablet(String name, double price) {
        super(name, price);
    }

    public abstract void setMemory(int memory);

    public abstract void setModels(TabletModels models);

    public abstract int getMemory();
}
