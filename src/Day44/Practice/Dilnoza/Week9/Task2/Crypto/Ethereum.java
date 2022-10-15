package Day44.Practice.Dilnoza.Week9.Task2.Crypto;

public class Ethereum {

   public final String shortName= CryptoCurrency.ETHERIUM.getShortName();
    private  static double totalAmount;
    private static double totalValue;
    public static int transactionId;
    public static double transactionAmount;
    private static final double price = CryptoCurrency.ETHERIUM.getPrice();
    public double transactionValue;


    public Ethereum (double transactionAmount) {
        this.transactionAmount = transactionAmount;
        transactionValue=transactionAmount*this.price;
        totalAmount+=transactionId;
        totalValue+=transactionAmount;

    }

    public static double getTotalAmount(){
        return totalAmount;
    }

    public static double getTotalValue(){
        return totalValue;
    }


    public String toString() {
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price =" + this.price +
                ", transactionValue=" + transactionValue +
                '}';
    }

}
