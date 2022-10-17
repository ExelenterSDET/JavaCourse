package Day46.Tasks;

public class BuyProduct {
    Drink drink;
    String details;
    double Price;
    int Quantity;
   double TotalPrice;

    public BuyProduct(Drink drink, int quantity) {
        this.drink = drink;
        this.Quantity = quantity;
        this.Price = drink.getPrice();
        this.details =""+drink+ " has " + drink.Calories+" calories";
        this.TotalPrice = quantity*drink.getPrice();
    }

    @Override
    public String toString() {
        return "BuyProduct{" +
                "drink=" + drink +
                ", details='" + details + '\'' +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                ", TotalPrice=" + TotalPrice +
                '}';
    }
}
