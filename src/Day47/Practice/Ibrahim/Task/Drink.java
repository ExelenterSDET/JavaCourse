package Day47.Practice.Ibrahim.Task;

public enum Drink {
    COLA (1.99, 37),
    SPRITE (1.98, 41),
    FANTA (1.97, 19),
    PEPSI (1.99, 27);

    double price;
    int calories;


    Drink(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }


//    public void print(){
//        System.out.println("Enum = " + this);
//        System.out.println("Price = " + this.price);
//        System.out.println("Calories = " + this.calories);
//    }
}
