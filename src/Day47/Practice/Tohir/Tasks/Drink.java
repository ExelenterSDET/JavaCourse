package Day46.Tasks;

public enum Drink {
    COLA(1.99,37),
    SPRITE(1.98,42),
    FANTA(1.97,19),
    PEPSI(1.99,27);
    double Price;
    int Calories;
    Drink( double price,int calories)
    {
        this.Calories = calories;
        this.Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public int getCalories() {
        return Calories;
    }

    public void print() {
        System.out.println("Enum is " + this);
        System.out.println("Price is " + this.Price);
        System.out.println("Calories is " + this.Calories);
    }

  /*  @Override
    public String toString() {
        return "Drink{" +
                "Price=" + Price +
                ", Calories=" + Calories +
                '}';
    }*/
}
