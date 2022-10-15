package Day44.Practice.Dilnoza.Week9.Task2.Crypto;

public enum CryptoCurrency {
    BITCOIN("BTC",19540.09),
    ETHERIUM("ETH",1329.17);


    CryptoCurrency(String shortName, double price) {
        this.shortName = shortName;
        this.price = price;
    }

    public final String shortName;
    final double price;

    public String getShortName() {
        return shortName;
    }

    public double getPrice() {
        return price;
    }
}
