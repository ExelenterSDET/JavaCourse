package Day53.Java.Example;

public class Apple extends Fruit{
    int discount; // 15

    public Apple() {
    }

    public Apple(String name, String color, double price, int discount) {
       super(name, color, price);
       this.discount = discount;
       setPrice(price);
    }

    public Apple(String name, String color) {
        super(name, color);
    }


    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void setPrice(double price) {
        super.price = price - (price * discount / 100);
    }
}
