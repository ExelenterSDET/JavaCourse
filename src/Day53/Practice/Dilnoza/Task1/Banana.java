package Day53.Practice.Dilnoza.Task1;

public class Banana extends Fruit{
   private String storeAddress;

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }


    @Override
    public String toString() {
        return "Banana{" +
                "storeAddress='" + storeAddress + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
