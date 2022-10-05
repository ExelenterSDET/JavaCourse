package Day40.Practice.Anthony.Task1.Package1;

public class City {

    private String name;
    private int areaZipCde;

    private City() {
        this.areaZipCde = 10020;
    }

    public City(String name) {
        this();
        this.name = name;
    }

    //@Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areaZipCde=" + areaZipCde +
                '}';
    }
}



