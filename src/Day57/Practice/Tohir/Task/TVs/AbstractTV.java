package Day57.Tohir.Task.TVs;

import Day57.Tohir.Task.Devices.AbstractDevice;
import Day57.Tohir.Task.Devices.Model;

public abstract class AbstractTV extends AbstractDevice implements Model {
    protected int pixels;
    protected int size;
    protected TVModels tvModels;


    public AbstractTV(String name, double price) {
        super(name, price);
    }

    public abstract void setPixels(int pixels);

    public abstract void setSize(int size);

    public abstract void setTvModels(TVModels tvModels);

    public abstract int getPixels();

    public abstract int getSize();
}
