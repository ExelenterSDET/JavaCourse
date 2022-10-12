package Day44.SaturdayProject.Andrea.Task2.Crypto;

public class Bitcoin {

    public int transactionId; //---> should be instance attribute and accessible in all packages.
    public double transactionAmount; //---> should be instance attribute and accessible in all packages.
    private final double price = 19540.09; //---> should be accessible only within the same class. should be constant. Note: value for Bitcoin clas is 19540.09 and for Ethereum class is 1329.17
    public double transactionValue; //---> should be instance attribute and accessible in all packages.
    public final String shortname = "BTC"; //   ---> should be accessible in all packages. should be class attribute. should be constant: "BTC" for Bitcoin and "ETH" for Ethereum
    private static double totalAmount; //---> should be accessible only within the same class and be a class attribute.
    private static double totalValue;  //---> should be accessible only within the same class and be a class attribute.

    public Bitcoin(double transactionAmount) {
        transactionId++;
        this.transactionAmount = transactionAmount;
        this.transactionValue = transactionAmount * price;
        totalAmount += transactionAmount;
        totalValue += transactionValue;
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
                ", transactionValue=" + transactionValue +
                '}';
    }
}

//    Task 2
//            - Create a package crypto
//    - under crypto package create classes Bitcoin and Ethereum (Note: both classes are similar and have same type of attributes and methods)
//    - create following attributes:
//    String shortname   ---> should be accessible in all packages. should be class attribute. should be constant: "BTC" for Bitcoin and "ETH" for Ethereum
//    double totalAmount ---> should be accessible only within the same class and be a class attribute.
//    double totalValue  ---> should be accessible only within the same class and be a class attribute.
//    int transactionId ---> should be instance attribute and accessible in all packages.
//    double transactionAmount ---> should be instance attribute and accessible in all packages.
//    double price ---> should be accessible only within the same class. should be constant. Note: value for Bitcoin clas is 19540.09 and for Ethereum class is 1329.17
//    double transactionValue ---> should be instance attribute and accessible in all packages.
//
//    - create a constructor
//        -- parameter is transaction amount.
//    assign value to class transactionAmount attribute.
//    assign value to transactionValue (note: transactionValue = transactionAmount * price)
//    add value to the totalAmount (note: this field should always increase and represents totalAmount of all class transactions)
//    add value to the totalValue (note: this field should always increase and represents totalValue of all class transactions)
//
//    - create a static method getTotalAmount
//    should return totalAmount
//
//     - create a static method getTotalValue
//    should return totalValue
//
//     - create a print method.
//    print fields :
//    transactionId
//            transactionAmount
//    price
//            transactionValue
//
//    Example:
//    Bitcoin{transactionId=1, transactionAmount=1.2, price=19540.09, transactionValue=23448.108}
//    Ethereum{transactionId=2, transactionAmount=1.0, price=19540.09, transactionValue=19540.09}
