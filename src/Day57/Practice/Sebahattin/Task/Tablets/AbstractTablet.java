package Day57.Practice.Sebahattin.Task.Tablets;

import Day57.Practice.Sebahattin.Task.Devices.AbstractDevice;
import Day57.Practice.Sebahattin.Task.Devices.Model;

public abstract class AbstractTablet extends AbstractDevice implements Model {
    protected int memory;
    protected TabletModels model;

    public AbstractTablet(String name, double price) {
        super(name, price);
    }

    public abstract double getPrice();

    public abstract String getName();

    public abstract void setMemory(int memory);

    public abstract void setModels(TabletModels models);

    public abstract int getMemory();
}
