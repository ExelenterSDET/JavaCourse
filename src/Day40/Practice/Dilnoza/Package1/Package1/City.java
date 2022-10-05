package Day40.Practice.Dilnoza.Package1.Package1;

public class City {
   private String name;
   private int areaZipCode;

    private City() {
        areaZipCode=10020;
    }

    public City(String name) {
        this();
        this.name = name;
    }


    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areaZipCode=" + areaZipCode +
                '}';
    }
}
