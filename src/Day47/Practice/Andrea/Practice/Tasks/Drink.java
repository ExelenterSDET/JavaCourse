package Day47.Practice.Andrea.Practice.Tasks;

public enum Drink {

    COLA(1.99, 37),
    SPRITE(1.98, 41),
    FANTA(1.97, 19),
    PEPSI(1.99, 27);

    double price;
    int calories;

    Drink(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.println("Enum is => " + this);
        System.out.println("Price is => " + this.price);
        System.out.println("Calories are => " + this.calories);
    }
}
