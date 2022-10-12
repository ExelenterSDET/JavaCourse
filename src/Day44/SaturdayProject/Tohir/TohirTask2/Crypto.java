package Day44.SaturdayProject.Tohir.TohirTask2;

public class Crypto {
    public static String shortname;//   ---> should be accessible in all packages. should be class attribute. should be constant: "BTC" for Bitcoin and "ETH" for Ethereum
    private double totalAmount;// ---> should be accessible only within the same class and be a class attribute.
    private double totalValue;//  ---> should be accessible only within the same class and be a class attribute.
    public int transactionId;// ---> should be instance attribute and accessible in all packages.
    public double transactionAmount;// ---> should be instance attribute and accessible in all packages.
    private static double price;
    private final double price_Bitcoin = 19540.09;

    private final double price_Etherium = 1329.17; // ---> should be accessible only within the same class. should be constant. Note: value for Bitcoin clas is 19540.09 and for Ethereum class is 1329.17
    public double transactionValue;// ---> should be instance attribute and accessible in all packages.

    public Crypto(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.transactionValue = transactionAmount*price;
        this.totalAmount += transactionAmount;
        this.totalValue += transactionAmount*price;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getTotalValue() {
        return totalValue;
    }

 /*   public void print()
    {

    }*/

    @Override
    public String toString() {
        return "Crypto{" +
                "totalValue=" + totalValue +
                ", transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", transactionValue=" + transactionValue +
                '}';
    }
    /*public void setTotalAmount(double totalAmount) {
        this.totalAmount += totalAmount;
    }

    public double setTotalAmount() {
        this.totalAmount ++;
    }*/

}
