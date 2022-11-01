package Day57.Tohir.Task.Tablets;

import Day57.Tohir.Task.Devices.AbstractDevice;
import Day57.Tohir.Task.Devices.Model;

public abstract class AbstractTablet extends AbstractDevice implements Model {
    protected int memory;
    protected TabletModels tabletModels;

    public AbstractTablet(String name, double price) {
        super(name, price);
    }

    public abstract void setMemory(int memory);

    public abstract void setTabletModels(TabletModels tabletModels);

    public abstract int getMemory();
}
