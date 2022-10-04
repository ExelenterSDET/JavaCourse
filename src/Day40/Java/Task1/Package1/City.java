package Day40.Java.Task1.Package1;

import java.util.Random;

public class City {
    private String name;
    private int areaZipCode;

    private City() {
    this.areaZipCode = this.generateZipCode();
    }

    public City(String name) {
        this();
        this.name = name;
    }

    public City(String name, int areaZipCode) {
        this.name = name;
        this.areaZipCode = areaZipCode;
    }

    private int generateZipCode(){
        Random random = new Random();
        return random.nextInt(10000);
    }

    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areaZipCode=" + areaZipCode +
                '}';
    }
}
