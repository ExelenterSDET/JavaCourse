package Day44.Practice.Ibrahim.Saturday.Crypto;

public class Bitcoin {
    public final static String shortname = "BTC";
    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    private final double price = 19540.09;
    public double transactionValue;

    public Bitcoin() {
        transactionId++;
    }
    public Bitcoin(double transactionAmount) {
        this();
        this.transactionAmount = transactionAmount;
        this.transactionValue = this.transactionAmount * price;
        totalAmount += this.transactionAmount;
        totalValue += this.transactionValue;
    }

    public static double getTotalAmount(){
        return totalAmount;
    }

    public static double getTotalValue(){
        return totalValue;
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price=" + price +
                ", transactionValue=" + Math.round(transactionValue*100) / 100.0 +
                "}\n";
    }
}
