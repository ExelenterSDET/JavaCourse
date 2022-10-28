package Day57.Practice.Andrea.Practice.Task.TVs;


import Day57.Practice.Andrea.Practice.Task.Devices.AbstractDevice;
import Day57.Practice.Andrea.Practice.Task.Devices.Model;

public abstract class AbstractTV extends AbstractDevice implements Model {

    protected int pixels;
    protected int size;
    protected TVModels models;


    public AbstractTV(String name, double price) {
        super(name, price);
    }

    public AbstractTV(String name) {super(name);}
}
