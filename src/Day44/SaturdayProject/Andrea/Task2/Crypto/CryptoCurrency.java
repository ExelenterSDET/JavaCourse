package Day44.SaturdayProject.Andrea.Task2.Crypto;

public enum CryptoCurrency {
    BITCOIN("BTC", 19540.09),
    ETHEREUM("ETH", 1329.17);

    public final String shortname;
    final double price;

    CryptoCurrency(String shortname, double price){
        this.shortname = shortname;
        this.price = price;
    }


}
