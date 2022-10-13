package Day47.Practice.Ibrahim.Crypto.Crypto;

public class Bitcoin {


    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    public double transactionValue;

    public Bitcoin() {
        transactionId++;
    }
    public Bitcoin(double transactionAmount) {
        this();
        this.transactionAmount = transactionAmount;
        this.transactionValue = Math.round(this.transactionAmount * CryptoCoin.BITCOIN.price*100)/100.0;
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
                "transactionId = " + transactionId +
                ", transactionAmount = " + transactionAmount +
                ", transactionValue = $" + transactionValue +
                "}\n";
    }
}
