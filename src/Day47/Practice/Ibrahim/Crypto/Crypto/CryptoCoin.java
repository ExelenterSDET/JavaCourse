package Day47.Practice.Ibrahim.Crypto.Crypto;

public enum CryptoCoin {
    BITCOIN ("BTC", 19540.09),
    ETHEREUM ("ETH", 1329.17);

    public  String shortname;
    public  double price;

    CryptoCoin(String shortname, double price) {
        this.shortname = shortname;
        this.price = price;
    }
}
