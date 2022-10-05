package Day41.Practice.Tohir;

public class TRANSACTIONS {
    int TransactionID;
    String Currency;
    double value;
    static int counter = 1000;

    public TRANSACTIONS(int transactionID, String currency, double value) {
        TransactionID = transactionID;
        Currency = currency;
        this.value = value;
    }
    public TRANSACTIONS()
    {
        counter++;
        this.TransactionID = counter;
    }

    public TRANSACTIONS(String currency, double value) {
        this();
        Currency = currency;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TRANSACTIONS{" +
                "TransactionID=" + TransactionID +
                ", Currency='" + Currency + '\'' +
                ", value=" + value +
                '}';
    }
}
class Market{
    public static void main(String[] args) {
        TRANSACTIONS t1 = new TRANSACTIONS();
        TRANSACTIONS t2 = new TRANSACTIONS();
        TRANSACTIONS t3 = new TRANSACTIONS();
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
    }
}
