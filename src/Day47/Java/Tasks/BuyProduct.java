package Day47.Java.Tasks;

public class BuyProduct {
    Drink drink;
    String details;
    double price;
    int quantity;
    double totalPrice;

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
                "drink=" + drink +
                ", details='" + details + '\'' +
                ", price= $" + price +
                ", quantity= " + quantity +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
