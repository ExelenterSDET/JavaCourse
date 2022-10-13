package Day47.Practice.Ibrahim.Task;

public class BuyProduct {
    Drink drink;
    String details;
    double price;
    int qty;
    double totalPrice;

    public BuyProduct(Drink drink, int quantity) {
        this.drink = drink;
        this.qty = quantity;
        this.price = drink.getPrice();
        this.details = "" + drink + " has " + drink.calories + " calories";
        this.totalPrice = this.price * this.qty;
    }

    @Override
    public String toString() {
        return "BuyProduct{" +
                "drink=" + drink +
                ", details='" + details + '\'' +
                ", price= $" + price +
                ", quantity= " + qty +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
