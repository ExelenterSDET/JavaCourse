package Day41.Java;

public class Transaction {
    int transactionId;
    String currency;
    double value;
    private static int counter = 1000;

    public Transaction() {
        counter++;
        transactionId = counter;
    }

    public Transaction(String currency, double value) {
        this();
        this.currency = currency;
        this.value = value;
    }
}

class Market{
    public static void main(String[] args) {
        Transaction t1 = new Transaction();
        Transaction t2 = new Transaction();
        Transaction t3 = new Transaction();

        System.out.println("T1 transaction id " + t1.transactionId);
        System.out.println("T2 transaction id " + t2.transactionId);
        System.out.println("T3 transaction id " + t3.transactionId);



    }
}
