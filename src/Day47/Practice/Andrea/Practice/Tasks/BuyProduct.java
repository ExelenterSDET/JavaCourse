package Day47.Practice.Andrea.Practice.Tasks;

public class BuyProduct {

    double price;
    String details;
    Drink drink;
    int quantity;
    static double totalPrice;

    public BuyProduct(Drink drink, int quantity) {
        this.drink = drink;
        this.quantity = quantity;
        this.price = drink.getPrice();
        this.details = "" + drink + " has " + drink.calories + " calories";
        this.totalPrice = this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "BuyProduct{" +
                "price = $" + price +
                ", details = '" + details + '\'' +
                ", drink = " + drink +
                ", quantity = " + quantity +
                ", totalPrice = $" + totalPrice +
                '}';
    }
}
