package Day57.Practice.Andrea.Practice.Task.Tablets;


import Day57.Practice.Andrea.Practice.Task.Devices.AbstractDevice;
import Day57.Practice.Andrea.Practice.Task.Devices.Model;

public abstract class AbstractTablet extends AbstractDevice implements Model {
    protected int memory;
    protected TabletModels models;

    public AbstractTablet(String name, double price) {
        super(name, price);
    }

    public abstract void setMemory(int memory);

    public abstract void setModels(TabletModels models);

    public abstract int getMemory();
}
